package com.clinicwallah.clinic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinicwallah.clinic.ClinicEntity;

@Repository
public interface ClinicRepository extends JpaRepository<ClinicEntity, Integer>{

}
