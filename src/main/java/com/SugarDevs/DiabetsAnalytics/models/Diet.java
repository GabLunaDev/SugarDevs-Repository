package com.SugarDevs.DiabetsAnalytics.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "diet")
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "describe")
    private String describe;

    @Column(name = "observations")
    private String observations;

    @ManyToOne
    @JoinColumn(name = "nutricionist_id", referencedColumnName = "id")
    private Nutricionist nutricionist;
    
    @OneToMany(mappedBy = "diet", cascade = CascadeType.ALL)
    private List<Meal> meals;

    @OneToOne(mappedBy = "diet")
    private CarePlan care_plan;
    
    public Diet(String describe, String observations, Nutricionist nutricionist, List<Meal> meals, CarePlan care_plan) {
        this.describe = describe;
        this.observations = observations;
        this.nutricionist = nutricionist;
        this.care_plan = care_plan;
        this.meals = meals;
    }

    public String getDescribe() {
        return describe;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public Nutricionist getNutricionist() {
        return nutricionist;
    }

    public String getObservations() {
        return observations;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    
    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public void setNutricionist(Nutricionist nutricionist) {
        this.nutricionist = nutricionist;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}