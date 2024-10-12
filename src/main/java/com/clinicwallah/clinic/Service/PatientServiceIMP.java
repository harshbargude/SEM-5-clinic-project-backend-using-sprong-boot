package com.clinicwallah.clinic.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicwallah.clinic.Patient;
import com.clinicwallah.clinic.PatientEntity;
import com.clinicwallah.clinic.Repository.PatientRepository;

@Service
public class PatientServiceIMP implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public String CreatePatient(Patient patient) {
        PatientEntity patientEntity = new PatientEntity();
        BeanUtils.copyProperties(patient, patientEntity);
        patientRepository.save(patientEntity);

        return "Data Saved Successfully!";

    }
    
    @Override
    public boolean DeletePatient(int patientId){
        if (patientRepository.existsById(patientId)) {
            patientRepository.deleteById(patientId);
            return true;
        }
        return false;
    }

    @Override
    public Patient ReadPatient(int patientId) {
        PatientEntity patientEntity = patientRepository.findById(patientId).get();
        Patient patient = new Patient();
        BeanUtils.copyProperties(patientEntity, patient);
        return patient;
    }

    @Override
    public String UpdatePatient(int patientId, Patient patient) {
        PatientEntity exPatientEntity = patientRepository.findById(1).get();
        exPatientEntity.setFirstName(patient.getFirstName());
        exPatientEntity.setLastName(patient.getLastName());
        exPatientEntity.setGender(patient.getGender());
        exPatientEntity.setCurrentIllness(patient.getCurrentIllness());
        
        patientRepository.save(exPatientEntity);
        return "Patient Updated";
    }

}
