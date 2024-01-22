package com.amdocs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Patient;
import com.amdocs.repository.PatientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PatientSerImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Optional<Patient> getPatientById(Long patientId) {
        return patientRepository.findById(patientId);
    }
}
