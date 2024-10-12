package com.clinicwallah.clinic.Service;

import com.clinicwallah.clinic.Clinic;
import java.util.List;

public interface ClinicServices {
    String createclinic(Clinic clinic);
    List<Clinic> readclinics();
    // String UpdatePatient(Long patientId, Patient patient);
}
