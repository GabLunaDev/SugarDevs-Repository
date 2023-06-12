package com.SugarDevs.DiabetsAnalytics.models;

import javax.persistence.Table;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Table(name = "client")
public class Client extends Person{

    @Column(name = "weight")
    private double weight;

    @Column(name = "height")
    private double height;

    @Column(name = "diabetes_type")
    private String diabetesType;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Glicosis> admeasurements;

    public Client(){
        
    }
    
    public Client(String firstName, String lastName, String password, int age, Contact contact,double weight, double height, String diabetesType, List<Glicosis> admeasurements) throws Exception {
        super(firstName, lastName, password, age, contact);
        setWeight(weight);
        this.height = height;
        this.admeasurements = admeasurements;
        this.diabetesType = diabetesType;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight)throws Exception {
        if(weight > 500 || weight < 0){
            throw new Exception("Invalid input to weight");
        }

        this.weight = weight;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public String getDiabetesType() {
        return diabetesType;
    }
    
    public void setDiabetesType(String diabetesType) {
        this.diabetesType = diabetesType;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "name='" + getFirstName() + " " + getLastName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + weight +
                ", height=" + height +
                ", diabetesType='" + diabetesType + '\'' +
                '}';
    }
}