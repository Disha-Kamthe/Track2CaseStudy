package com.amdocs.service;

import java.util.List;

import com.amdocs.entity.Appointment;

public interface AppointmentService {

    void addAppointment(Appointment appointment);

    List<Appointment> getAllAppointments();

    void deleteAppointment(Long appointmentId);

    void updateAppointment(Long appointmentId, Appointment appointment);
}

