package com.amdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.entity.Appointment;
import com.amdocs.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    // Add a new appointment
    @PostMapping("/add")
    public String addAppointment(@RequestBody Appointment appointment) {
        appointmentService.addAppointment(appointment);
        return "Appointment added";
    }

    // Get all appointments
    @GetMapping("/all")
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    // Delete an appointment by ID
    @DeleteMapping("/delete/{id}")
    public String deleteAppointment(@PathVariable Long id) {
        appointmentService.deleteAppointment(id);
        return "Appointment deleted";
    }

    // Update an appointment by ID
    @PutMapping("/update/{id}")
    public String updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
        appointmentService.updateAppointment(id, appointment);
        return "Appointment updated";
    }
}

