package com.clinicwallah.clinic.Service;

import java.util.List;

import com.clinicwallah.clinic.Doctor;

public interface DoctorService {
    String CreateDoctor(Doctor doctor);
    Doctor ReadDoctor(int doctor_id);
    List<Doctor> ReadDoctors();
}
