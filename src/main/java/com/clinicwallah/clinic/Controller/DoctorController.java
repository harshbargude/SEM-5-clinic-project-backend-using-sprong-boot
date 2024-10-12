package com.clinicwallah.clinic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clinicwallah.clinic.Doctor;
import com.clinicwallah.clinic.Service.DoctorService;

@RestController
@CrossOrigin
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/createdoctor")
    public ResponseEntity<String> createDoctor(@RequestBody Doctor doctor) {
        String response = doctorService.CreateDoctor(doctor);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/doctor/{id}")
    public ResponseEntity<Doctor> getDoctor(@PathVariable("id") int doctorId) {
        Doctor doctor = doctorService.ReadDoctor(doctorId);
        return ResponseEntity.ok(doctor);
    }

    @GetMapping("/doctor")
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        List<Doctor> doctors = doctorService.ReadDoctors();
        return ResponseEntity.ok(doctors);
    }
}
