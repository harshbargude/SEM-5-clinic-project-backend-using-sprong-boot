package com.clinicwallah.clinic.Controller;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.clinicwallah.clinic.Clinic;

import com.clinicwallah.clinic.Service.ClinicServices;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@CrossOrigin
@RestController
public class ClinicController {
    
    @Autowired
    private ClinicServices clinicservices;

    @PostMapping("/clinic")
    public String CreateClinic (@RequestBody Clinic clinic) {
        return clinicservices.createclinic(clinic);
    }

    @GetMapping("/clinic")
    public List<Clinic> getClinic(){
        return clinicservices.readclinics();
    }
    @GetMapping("/clinic/{id}")
    public ResponseEntity<Clinic> getClinicbyid(@PathVariable int id){
        Clinic clinic1 = clinicservices.getClinicbyid(id);
        if(clinic1 == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(clinic1);
    }

    @PutMapping("clinic/{id}")
    public ResponseEntity<Clinic> editclinic(@PathVariable("id") int id, @RequestBody Clinic clinic) {
        Clinic clinic1 = clinicservices.editclinic(clinic, id);
        if(clinic1 == null){
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok(clinic1);
    }
}
