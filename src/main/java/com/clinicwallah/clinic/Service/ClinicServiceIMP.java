package com.clinicwallah.clinic.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicwallah.clinic.Clinic;
import com.clinicwallah.clinic.ClinicEntity;
import com.clinicwallah.clinic.Repository.ClinicRepository;

@Service
public class ClinicServiceIMP implements ClinicServices{

    @Autowired
    private ClinicRepository clinicrepository;

    @Override
    public String createclinic(Clinic clinic) {
        ClinicEntity entity = new ClinicEntity();
        BeanUtils.copyProperties(clinic, entity);
        clinicrepository.save(entity);
        return "New clinic added";
    }

    @Override
    public List<Clinic> readclinics(){ 
        List<ClinicEntity> clinicList = clinicrepository.findAll();
        List<Clinic> clinics = new ArrayList<>();
        for(ClinicEntity clinicEntity: clinicList){
        Clinic clc = new Clinic();
            clc.setClinicId(clinicEntity.getClinicId());
            clc.setClinicName(clinicEntity.getClinicName());
            clc.setAddress(clinicEntity.getAddress());
            clc.setContactNumber(clinicEntity.getContactNumber());
            clc.setEmail(clinicEntity.getEmail());
            clc.setSpecialization(clinicEntity.getSpecialization());
            clc.setOpeningHours(clinicEntity.getOpeningHours());
            clinics.add(clc);
        }
        return clinics;
    }

    // @Override
    // public List<Clinic> readClinics() {
    //     List<ClinicEntity> clinicList = clinicrepository.findAll();
    //     List<Clinic> clinics = new ArrayList<>();
    //     for(ClinicEntity clinicEntity: clinicList){
            // Clinic clc = new Clinic();
            // clc.setClinicId(clinicEntity.getClinicId());
            // clc.setAddress(clinicEntity.getClinicName());
            // clc.setAddress(clinicEntity.getAddress());
            // clc.setContactNumber(clinicEntity.getContactNumber());
            // clc.setEmail(clinicEntity.getEmail());
            // clc.setSpecialization(clinicEntity.getSpecialization());
            // clc.setOpeningHours(clinicEntity.getOpeningHours());
            // clinics.add(clc);
    //     }
    //     return clinics;
    // }

    
}
