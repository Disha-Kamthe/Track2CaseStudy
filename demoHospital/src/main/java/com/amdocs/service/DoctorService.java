package com.amdocs.service;

import java.util.List;
import java.util.Optional;

import com.amdocs.entity.Doctor;

public interface DoctorService {

    void addDoctor(Doctor doctor);

    List<Doctor> getAllDoctors();

    Optional<Doctor> getDoctorById(Long doctorId);
}
