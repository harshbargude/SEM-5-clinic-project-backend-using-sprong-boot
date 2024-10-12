package com.clinicwallah.clinic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clinicwallah.clinic.Appointment;
import com.clinicwallah.clinic.Service.AppointmentServices;

@RestController
@CrossOrigin
public class AppointmentController {
    
    @Autowired
    private AppointmentServices appointmentServices;

    @PostMapping("/appointment")
    public String createAppointment(@RequestBody Appointment appointment) {
        return appointmentServices.createAppointment(appointment);
    }

    @GetMapping("/appointment/{id}")
    public Appointment getAppointment(@PathVariable int id) {
        return appointmentServices.readAppointment(id);
    }

    @GetMapping("/appointment")
    public List<Appointment> getAppointments() {
        return appointmentServices.readAppointments();
    }

    @PutMapping("/appointment/{id}")
    public String updateAppointment(@PathVariable int id, @RequestBody Appointment appointment) {
        return appointmentServices.updateAppointment(id, appointment);
    }

    @DeleteMapping("appointment/{id}")
    public String deleteAppointment(@PathVariable int id) {
        return appointmentServices.deleteAppointment(id);
    }
}   
