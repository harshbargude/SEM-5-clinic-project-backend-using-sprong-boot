package com.clinicwallah.clinic;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class AppointmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentId;

    private LocalDateTime appointmentDate;
    private String status;  // booked, completed, cancelled
    private String reasonForVisit;

    private String patient;

    private String doctor;

    @ManyToOne
    @JoinColumn(name = "clinic_id")
    private ClinicEntity clinic;
}
