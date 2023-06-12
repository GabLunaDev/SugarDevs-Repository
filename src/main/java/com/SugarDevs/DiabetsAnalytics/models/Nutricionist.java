package com.SugarDevs.DiabetsAnalytics.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nutricionist")
public class Nutricionist extends Person {
    @Column(name = "crn")
    private String crn;

    @OneToMany(mappedBy = "nutricionist", cascade = CascadeType.ALL)
    private List<Diet> diet;

    @OneToOne(mappedBy = "nutricionist")
    private CarePlan care_plan;

    
    public Nutricionist(String firstName, String lastName, String password, int age, Contact contact, String crn, CarePlan care_plan, List<Diet> diet) {
        super(firstName, lastName, password, age, contact);
        this.diet = diet;
        this.care_plan = care_plan;
        this.crn = crn;
    }
    
    public String getCrn() {
        return crn;
    }
    
    public void setCrn(String crn) {
        this.crn = crn;
    }
    
    @Override
    public String toString() {
        return "Nutricionist{" +
                "name='" + getFirstName() + '\'' +
                ", crn='" + crn + '\'' +
                '}';
    }
}