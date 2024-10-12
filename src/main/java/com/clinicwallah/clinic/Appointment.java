package com.clinicwallah.clinic;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    private int appointmentId;

    private LocalDateTime appointmentDate;
    private String status;  // booked, completed, cancelled
    private String reasonForVisit;

    private String patient;

    private String doctor;

    private Clinic clinic;
}
