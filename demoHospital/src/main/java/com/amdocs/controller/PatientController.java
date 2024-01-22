package com.amdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.entity.Patient;
import com.amdocs.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    // Add a new patient
    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
        return "Patient added successfully";
    }

    // View all patients
    @GetMapping("/all")
    public List<Patient> viewAllPatients() {
        return patientService.getAllPatients();
    }

    // View patient by ID
    @GetMapping("/{patientId}")
    public Patient viewPatientById(@PathVariable Long patientId) {
        return patientService.getPatientById(patientId).orElse(null);
    }
}
