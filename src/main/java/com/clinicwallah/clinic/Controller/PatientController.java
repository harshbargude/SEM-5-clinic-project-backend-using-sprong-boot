package com.clinicwallah.clinic.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.clinicwallah.clinic.Patient;
import com.clinicwallah.clinic.Service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/patient")
    public String CreatePatient (@RequestBody Patient patient) {
        return patientService.CreatePatient(patient);
    }

    @GetMapping("/patient/{id}")
    public Patient ReadPatient(@PathVariable int id){
        return patientService.ReadPatient(id);
    }
    @PutMapping("/patient/{id}")
    public String UpdatePatient( @PathVariable int id, @RequestBody Patient patient){
        return patientService.UpdatePatient(id, patient);
    }


    
}
