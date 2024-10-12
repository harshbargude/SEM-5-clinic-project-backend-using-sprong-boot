package com.clinicwallah.clinic.Service;

import com.clinicwallah.clinic.Patient;

public interface PatientService {

    String CreatePatient(Patient patient);
    // List<Patient> ReadPatients();
    // String UpdatePatient(Long patientId, Patient patient);
    boolean DeletePatient(int patientId);
    Patient ReadPatient(int patientId);
    String UpdatePatient(  int patientId,Patient patient);

}
