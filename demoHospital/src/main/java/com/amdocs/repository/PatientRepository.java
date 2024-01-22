package com.amdocs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.amdocs.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Custom query methods if needed
}
