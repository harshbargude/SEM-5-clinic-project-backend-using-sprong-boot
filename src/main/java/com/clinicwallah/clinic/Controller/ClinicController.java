package com.clinicwallah.clinic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.clinicwallah.clinic.Clinic;

import com.clinicwallah.clinic.Service.ClinicServices;

@CrossOrigin
@RestController
public class ClinicController {
    
    @Autowired
    private ClinicServices clinicservices;

    @PostMapping("/addclinic")
    public String CreateClinic (@RequestBody Clinic clinic) {
        return clinicservices.createclinic(clinic);
    }

    @GetMapping("/allclinics")
    public List<Clinic> getClinic(){
        return clinicservices.readclinics();
    }
}
