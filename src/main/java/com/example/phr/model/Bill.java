package com.example.phr.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @OneToOne(optional=false) private Appointment appointment;
    private BigDecimal amount; private String paymentMode;
    public Bill(){} public Bill(Appointment appointment,BigDecimal amount,String paymentMode){this.appointment=appointment;this.amount=amount;this.paymentMode=paymentMode;}
    public Long getId(){return id;} public Appointment getAppointment(){return appointment;} public void setAppointment(Appointment a){this.appointment=a;}
    public BigDecimal getAmount(){return amount;} public void setAmount(BigDecimal amt){this.amount=amt;}
    public String getPaymentMode(){return paymentMode;} public void setPaymentMode(String m){this.paymentMode=m;}
}
