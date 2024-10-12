package com.clinicwallah.clinic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinicwallah.clinic.DoctorEntity;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity,Integer>{

    
}
