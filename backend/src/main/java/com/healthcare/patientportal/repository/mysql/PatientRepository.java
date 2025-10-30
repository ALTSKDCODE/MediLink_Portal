package com.healthcare.patientportal.repository.mysql;

import com.healthcare.patientportal.model.mysql.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    
}
