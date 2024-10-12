package com.clinicwallah.clinic.Service;

import com.clinicwallah.clinic.Clinic;
import java.util.List;

public interface ClinicServices {
    String createclinic(Clinic clinic);
    List<Clinic> readclinics();
    Clinic getClinicbyid(int id);
    Clinic editclinic(Clinic clinic, int id);
}
