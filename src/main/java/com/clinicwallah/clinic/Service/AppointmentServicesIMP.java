package com.clinicwallah.clinic.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicwallah.clinic.Appointment;
import com.clinicwallah.clinic.AppointmentEntity;
import com.clinicwallah.clinic.Repository.AppointmentRepository;

@Service
public class AppointmentServicesIMP implements AppointmentServices{

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public String createAppointment(Appointment appointment) {
        AppointmentEntity entity = new AppointmentEntity();
        BeanUtils.copyProperties(appointment, entity);
        appointmentRepository.save(entity);
        return "Appointment Created Successfully!";
    }

    @Override
    public Appointment readAppointment(int appointmentId) {
        AppointmentEntity entity = appointmentRepository.findById(appointmentId).get();
        Appointment appointment = new Appointment();
        BeanUtils.copyProperties(entity, appointment);
        return appointment;
    }

    @Override
    public List<Appointment> readAppointments() {
        List<AppointmentEntity> appointmentList = appointmentRepository.findAll();
        List<Appointment> appointment = new ArrayList<>();
        for(AppointmentEntity appointmentEntity : appointmentList){
            Appointment app = new Appointment();
            BeanUtils.copyProperties(appointmentEntity, app);
            appointment.add(app);
        }
        return appointment;
    }

    @Override
    public String updateAppointment(int appointmentId, Appointment appointment) {
        
        AppointmentEntity existingAppointmentEntity = appointmentRepository.findById(appointmentId).get();
        BeanUtils.copyProperties(appointment, existingAppointmentEntity);
        appointmentRepository.save(existingAppointmentEntity);
        return "Appointment Updated successfully!";
    }

    @Override
    public String deleteAppointment(int appointmentId) {
        if(appointmentRepository.existsById(appointmentId)){
            appointmentRepository.deleteById(appointmentId);
            return "Appointment Deleted successfully!";
        }
        return "Appointment not found!";
    }

}
