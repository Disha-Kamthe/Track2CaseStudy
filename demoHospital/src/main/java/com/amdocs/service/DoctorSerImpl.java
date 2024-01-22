package com.amdocs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Doctor;
import com.amdocs.repository.DoctorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorSerImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Optional<Doctor> getDoctorById(Long doctorId) {
        return doctorRepository.findById(doctorId);
    }
}
