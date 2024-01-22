package com.amdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.entity.Doctor;
import com.amdocs.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // Add a new doctor
    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
        return "Doctor added successfully";
    }

    // View all doctors
    @GetMapping("/all")
    public List<Doctor> viewAllDoctors() {
        return doctorService.getAllDoctors();
    }

    // View doctor by ID
    @GetMapping("/{doctorId}")
    public Doctor viewDoctorById(@PathVariable Long doctorId) {
        return doctorService.getDoctorById(doctorId).orElse(null);
    }
}

