package com.SugarDevs.DiabetsAnalytics.models;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "care_plan")
public class CarePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "start_date")
    private Date start_date;
    
    @Column(name = "final_date")
    private Date final_date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nutricionist_id", referencedColumnName = "id")
    private Nutricionist nutricionist;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diet_id", referencedColumnName = "id")
    private Diet diet;

    public CarePlan(){
        
    }
    
    public CarePlan(Date start_date, Date final_date, Nutricionist nutricionist, Diet diet) {
        this.start_date = start_date;
        this.final_date = final_date;
        this.nutricionist = nutricionist;
        this.diet = diet;
    }

    public Diet getDiet() {
        return diet;
    }

    public Date getFinal_date() {
        return final_date;
    }

    public Nutricionist getNutricionist() {
        return nutricionist;
    }

    public Date getStart_date() {
        return start_date;
    }
    
    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public void setFinal_date(Date final_date) {
        this.final_date = final_date;
    }

    public void setNutricionist(Nutricionist nutricionist) {
        this.nutricionist = nutricionist;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }
}
