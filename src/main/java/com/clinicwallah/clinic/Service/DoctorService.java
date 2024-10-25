package com.clinicwallah.clinic.Service;

import java.util.List;

import com.clinicwallah.clinic.Doctor;
import com.clinicwallah.clinic.DoctorEntity;

public interface DoctorService {
    String CreateDoctor(Doctor doctor);
    Doctor ReadDoctor(int doctor_id);
    List<Doctor> ReadDoctors();
    List<DoctorEntity> getAllDoctorswithClinicId(int clinicId);
}
