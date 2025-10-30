package com.healthcare.patientportal.controller;

import com.healthcare.patientportal.model.MedicalRecord;
import com.healthcare.patientportal.model.mysql.Patient;
import com.healthcare.patientportal.repository.mongo.MedicalRecordRepository;
import com.healthcare.patientportal.repository.mysql.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@CrossOrigin(origins = "*") // allow frontend during dev
public class TestController {

    private final PatientRepository patientRepository;
    private final MedicalRecordRepository recordRepository;

    public TestController(PatientRepository patientRepository, MedicalRecordRepository recordRepository) {
        this.patientRepository = patientRepository;
        this.recordRepository = recordRepository;
    }

    // ✅ Add a patient (to test MySQL insert)
    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient) {
        try {
            patientRepository.save(patient);
            return "✅ Patient saved successfully: " + patient.getFullName();
        } catch (Exception e) {
            e.printStackTrace();
            return "❌ Error saving patient: " + e.getMessage();
        }
    }

    // ✅ Retrieve all patients (to test MySQL fetch)
    @GetMapping("/all")
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // ✅ Quick database connection test
    @GetMapping("/ping")
    public String ping() {
        try {
            long count = patientRepository.count();
            return "✅ MySQL connected successfully. Total patients: " + count;
        } catch (Exception e) {
            return "❌ Database connection failed: " + e.getMessage();
        }
    }
    // ✅ Test MongoDB connection
    @GetMapping("/mongo/test")
    public String testMongoConnection() {
        try {
            recordRepository.save(new MedicalRecord(null, 1L, "Test Record"));
            long count = recordRepository.count();
            return "✅ MongoDB connected successfully. Total records: " + count;
        } catch (Exception e) {
            e.printStackTrace();
            return "❌ MongoDB connection failed: " + e.getMessage();
        }
    }

    // ✅ Fetch all MongoDB medical records
    @GetMapping("/mongo/all")
    public List<MedicalRecord> getAllRecords() {
        return recordRepository.findAll();
    }
}
