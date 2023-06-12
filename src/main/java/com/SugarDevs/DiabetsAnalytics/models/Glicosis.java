package com.SugarDevs.DiabetsAnalytics.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "glicosis")

public class Glicosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "admeasurement")
    private double admeasurement;
    
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    public Glicosis(){
        
    }

    public Glicosis(Date date, double admeasurement, Client user) throws Exception{
        this.date = date;
        this.client = user;
       setAdmeasurement(admeasurement);
    }

    public double getAdmeasurement() {
        return admeasurement;
    }

    public void setAdmeasurement(double admeasurement) throws Exception{
        if(admeasurement < 0){
            throw new Exception("Invalid input to admeasurement");
        }
        this.admeasurement = admeasurement;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}