package com.oocl.packagebooking.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ExpressPackage {

    @Id
    private int id;

    @Column(name = "addressee")
    private String addressee;

    @Column(name = "phone")
    private String phone;

    @Column(name = "status" ,columnDefinition="varchar(255) default 未取件")
    private String status;

    @Column(name = "weight")
    private double weight;

    @Column(name = "appointment_time")
    private long appointmentTime;

    public ExpressPackage() {
        this.status = "未取件";
    }

    public ExpressPackage(int id, String addressee, String phone, double weight) {
        this.id = id;
        this.addressee = addressee;
        this.phone = phone;
        this.status = "未取件";
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(long appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}
