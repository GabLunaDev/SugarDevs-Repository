package com.SugarDevs.DiabetsAnalytics.service.Interfaces;

import java.util.List;
import java.util.Optional;

import com.SugarDevs.DiabetsAnalytics.models.Meal;

public interface MealServiceInterface {
    List<Meal> findAllMeals();
    Optional<Meal> findById(Long id);
    Meal saveMeal(Meal meal);
    Meal updateMeal(Meal meal);
    void deleteMeal(Long id);
}
