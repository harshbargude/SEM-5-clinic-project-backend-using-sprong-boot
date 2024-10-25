package com.clinicwallah.clinic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.clinicwallah.clinic.DoctorEntity;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity,Integer>{

    List<DoctorEntity> findByClinicId(int clinicId);
}
