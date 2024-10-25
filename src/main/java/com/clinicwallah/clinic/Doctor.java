package com.clinicwallah.clinic;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctor {
    private int doctorId;

    private String firstName;
    private String lastName;
    private String specialization;
    private int experienceYears;
    private String contactNumber;
    private String email;

    private int clinicId;


}
