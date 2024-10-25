package com.clinicwallah.clinic.Service;

import java.util.List;

import com.clinicwallah.clinic.Appointment;

public interface AppointmentServices {
    // Create a new appointment
    String createAppointment(Appointment appointment);

    // Read a single appointment by ID
    Appointment readAppointment(int appointmentId);

    // Get all appointments
    List<Appointment> readAppointments();

    // Update an appointment
    String updateAppointment(int appointmentId, Appointment appointment);

    // Delete an appointment by ID
    String deleteAppointment(int appointmentId);
}
