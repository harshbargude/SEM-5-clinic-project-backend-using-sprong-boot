package com.clinicwallah.clinic;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clinic {
    
    private int clinicId;

    private String clinicName;
    private String address;
    private String contactNumber;
    private String email;
    private String specialization;
    private String openingHours;
    
    
}
