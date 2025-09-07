package com.example.phr.model;

import javax.persistence.*;

@Entity
public class Prescription {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @OneToOne(optional=false) private Appointment appointment;
    @Lob private String notes;
    public Prescription(){} public Prescription(Appointment appointment,String notes){this.appointment=appointment;this.notes=notes;}
    public Long getId(){return id;} public Appointment getAppointment(){return appointment;} public void setAppointment(Appointment a){this.appointment=a;}
    public String getNotes(){return notes;} public void setNotes(String n){this.notes=n;}
}
