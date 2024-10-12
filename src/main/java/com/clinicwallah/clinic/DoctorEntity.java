package com.clinicwallah.clinic;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;

    private String firstName;
    private String lastName;
    private String specialization;
    private int experienceYears;
    private String contactNumber;
    private String email;

    @ManyToOne
    @JoinColumn(name = "clinic_id")
    private ClinicEntity clinic;

    @OneToMany(mappedBy = "doctor")
    private List<AppointmentEntity> appointments;

    @ManyToMany(mappedBy = "doctors")
    private List<PatientEntity> patients;
}
