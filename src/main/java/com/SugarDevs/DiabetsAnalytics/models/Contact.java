package com.SugarDevs.DiabetsAnalytics.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "cellphone")    
    private String cellphone;

    @Column(name = "whatsapp")
    private boolean whatsapp;

    @Column(name = "telegram")
    private boolean telegram;

    public Contact(){
        
    }

    public Contact(String email, String cellphone, boolean whatsapp, boolean telegram){
        this.email = email;
        this.cellphone = cellphone;
        this.whatsapp = whatsapp;
        this.telegram = telegram;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelegram(boolean telegram) {
        this.telegram = telegram;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }
}