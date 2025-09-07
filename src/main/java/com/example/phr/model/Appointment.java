package com.example.phr.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @ManyToOne(optional=false) private Patient patient;
    @ManyToOne(optional=false) private Doctor doctor;
    private LocalDateTime appointmentAt; private String status;
    public Appointment(){} public Appointment(Patient patient,Doctor doctor,LocalDateTime appointmentAt,String status){this.patient=patient;this.doctor=doctor;this.appointmentAt=appointmentAt;this.status=status;}
    public Long getId(){return id;} public Patient getPatient(){return patient;} public void setPatient(Patient p){this.patient=p;}
    public Doctor getDoctor(){return doctor;} public void setDoctor(Doctor d){this.doctor=d;}
    public LocalDateTime getAppointmentAt(){return appointmentAt;} public void setAppointmentAt(LocalDateTime a){this.appointmentAt=a;}
    public String getStatus(){return status;} public void setStatus(String s){this.status=s;}
}
