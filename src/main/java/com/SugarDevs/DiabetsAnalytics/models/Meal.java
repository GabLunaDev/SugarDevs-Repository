package com.SugarDevs.DiabetsAnalytics.models;

import javax.persistence.*;


import com.SugarDevs.DiabetsAnalytics.Utils.enums.MealType;

@Entity
@Table(name = "meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "describe")
    private String describe;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private MealType type;

    @ManyToOne
    @JoinColumn(name = "diet_id", referencedColumnName = "id")
    private Diet diet;

    public Meal(){
        
    }

    public Meal(String describe, MealType type){
        this.type = type;
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }

    public MealType getType() {
        return type;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setType(MealType type) {
        this.type = type;
    }
}
