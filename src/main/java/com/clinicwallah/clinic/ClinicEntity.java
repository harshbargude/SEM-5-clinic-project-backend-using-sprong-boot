package com.clinicwallah.clinic;

import java.util.ArrayList;
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

    // Initialize doctors list to avoid NullPointerException
    

    // You may keep the addDoctor method if you plan to manage the relationship in the future
    // public void addDoctor(DoctorEntity doctor) {
    //     if (!this.doctors.contains(doctor)) {
    //         this.doctors.add(doctor);
    //         doctor.setClinic(this);  // Set the clinic reference in the doctor entity
    //     }
    // }
}
