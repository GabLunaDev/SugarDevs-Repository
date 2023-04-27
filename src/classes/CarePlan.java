package src.classes;

import java.util.Arrays;

public class CarePlan {
    private String[] medicinesArray;
    private String diet;
    private String[] exerciseArray;
    private String nutritionist;
    private String beginDate;
    private String finalDate;
    
    public CarePlan(String[] medicinesArray, String diet, String[] exerciseArray, String nutritionist, String beginDate, String finalDate) {
        this.medicinesArray = medicinesArray;
        this.diet = diet;
        this.exerciseArray = exerciseArray;
        this.nutritionist = nutritionist;
        this.beginDate = beginDate;
        this.finalDate = finalDate;
    }
    
    public String[] getMedicinesArray() {
        return medicinesArray;
    }
    
    public void setMedicinesArray(String[] medicinesArray) {
        this.medicinesArray = medicinesArray;
    }
    
    public String getDiet() {
        return diet;
    }
    
    public void setDiet(String diet) {
        this.diet = diet;
    }
    
    public String[] getExerciseArray() {
        return exerciseArray;
    }
    
    public void setExerciseArray(String[] exerciseArray) {
        this.exerciseArray = exerciseArray;
    }
    
    public String getNutritionist() {
        return nutritionist;
    }
    
    public void setNutritionist(String nutritionist) {
        this.nutritionist = nutritionist;
    }
    
    public String getBeginDate() {
        return beginDate;
    }
    
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }
    
    public String getFinalDate() {
        return finalDate;
    }
    
    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }
    
    @Override
    public String toString() {
        return "CarePlan{" +
                "medicinesArray=" + Arrays.toString(medicinesArray) +
                ", diet='" + diet + '\'' +
                ", exerciseArray=" + Arrays.toString(exerciseArray) +
                ", nutritionist='" + nutritionist + '\'' +
                ", beginDate='" + beginDate + '\'' +
                ", finalDate='" + finalDate + '\'' +
                '}';
    }
}
