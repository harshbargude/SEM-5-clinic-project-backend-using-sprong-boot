package com.clinicwallah.clinic.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicwallah.clinic.Doctor;
import com.clinicwallah.clinic.DoctorEntity;
import com.clinicwallah.clinic.Repository.DoctorRepository;

@Service
public class DoctorServiceIMP implements DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public String CreateDoctor(Doctor doctor) {
        DoctorEntity entity = new DoctorEntity();
        BeanUtils.copyProperties(doctor, entity);
        doctorRepository.save(entity);
        return "Doctor Added Successfully";
    }

    @Override
    public Doctor ReadDoctor(int doctor_id) {
        DoctorEntity entity = doctorRepository.findById(doctor_id).orElse(null);
        Doctor doctor = new Doctor();
        BeanUtils.copyProperties(entity, doctor);
        return doctor;
    }

    @Override
    public List<Doctor> ReadDoctors() {
        List<DoctorEntity> doctorList = doctorRepository.findAll();
        List<Doctor> doctor = new ArrayList<>();
        for(DoctorEntity doctorEntity : doctorList){
            Doctor ndoctor = new Doctor();
            ndoctor.setDoctorId(doctorEntity.getDoctorId());
            ndoctor.setFirstName(doctorEntity.getFirstName());
            ndoctor.setLastName(doctorEntity.getLastName());
            ndoctor.setSpecialization(doctorEntity.getSpecialization());
            ndoctor.setExperienceYears(doctorEntity.getExperienceYears());
            ndoctor.setContactNumber(doctorEntity.getContactNumber());
            ndoctor.setEmail(doctorEntity.getEmail());
            ndoctor.setClinicId(doctorEntity.getClinicId());
            doctor.add(ndoctor);
        }
        return doctor;
    }

    @Override
    public List<DoctorEntity> getAllDoctorswithClinicId(int clinicId) {
        return doctorRepository.findByClinicId(clinicId);
    }
    
}
