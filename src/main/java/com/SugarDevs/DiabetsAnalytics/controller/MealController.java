package com.SugarDevs.DiabetsAnalytics.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SugarDevs.DiabetsAnalytics.models.Meal;
import com.SugarDevs.DiabetsAnalytics.service.Implementations.MealService;

@RestController
@ResponseBody
@RequestMapping("/meal")
public class MealController {
        private final MealService mealService;

    public MealController(MealService mealService){
        this.mealService = mealService;
    }

    @GetMapping
    public List<Meal> findAllMeals(){
        return mealService.findAllMeals();
    }

    @GetMapping("/{id}")
    public Optional<Meal> findMealById(@PathVariable("id") Long id){
        return mealService.findById(id);
    }

    @PostMapping
    public Meal saveMeal(@RequestBody Meal meal){
        return mealService.saveMeal(meal);
    }   

    @PutMapping("/{id}/update")
    public Meal updateMeal (@RequestBody Meal meal){
        return mealService.updateMeal(meal);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteMeal(@PathVariable Long id){
        mealService.deleteMeal(id);
    }
}
