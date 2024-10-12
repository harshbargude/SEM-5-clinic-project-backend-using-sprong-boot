package com.clinicwallah.clinic;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class ClinicEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clinicId;
    
    private String clinicName;
    private String address;
    private String contactNumber;
    private String email;
    private String specialization;
    private String openingHours;

    @OneToMany(mappedBy = "clinic")
    private List<DoctorEntity> doctors;

    @OneToMany(mappedBy = "clinic")
    private List<AppointmentEntity> appointments;
}
