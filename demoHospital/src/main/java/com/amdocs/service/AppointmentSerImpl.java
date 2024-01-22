package com.amdocs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Appointment;
import com.amdocs.repository.AppointmentRepository;

import java.util.List;

@Service
public class AppointmentSerImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void addAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public void deleteAppointment(Long appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }

    @Override
    public void updateAppointment(Long appointmentId, Appointment updatedAppointment) {
        appointmentRepository.findById(appointmentId).ifPresent(appointment -> {
            appointment.setDate(updatedAppointment.getDate());
            appointment.setTime(updatedAppointment.getTime());
            // Add other fields to update if needed

            appointmentRepository.save(appointment);
        });
    }
}
