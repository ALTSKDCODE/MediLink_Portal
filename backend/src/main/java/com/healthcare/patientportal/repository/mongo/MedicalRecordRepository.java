package com.healthcare.patientportal.repository.mongo;

import com.healthcare.patientportal.model.MedicalRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicalRecordRepository extends MongoRepository<MedicalRecord, String> {}
