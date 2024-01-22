package com.amdocs.service;

import java.util.List;
import java.util.Optional;

import com.amdocs.entity.Patient;

public interface PatientService {

    void addPatient(Patient patient);

    List<Patient> getAllPatients();

    Optional<Patient> getPatientById(Long patientId);
}
