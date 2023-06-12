package com.SugarDevs.DiabetsAnalytics.service.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SugarDevs.DiabetsAnalytics.models.Meal;
import com.SugarDevs.DiabetsAnalytics.repository.MealRepository;
import com.SugarDevs.DiabetsAnalytics.service.Interfaces.MealServiceInterface;

@Service
public class MealService implements MealServiceInterface {
    private final MealRepository mealRepository;

    public MealService(MealRepository mealRepository){
        this.mealRepository = mealRepository;
    }

    @Override
    public List<Meal> findAllMeals() {
        return mealRepository.findAll();
    }

    @Override
    public Optional<Meal> findById(Long id) {
        return mealRepository.findById(id);
    }

    @Override
    public Meal saveMeal(Meal Meal) {
        return mealRepository.save(Meal);
    }

    @Override
    public Meal updateMeal(Meal Meal) {
        return mealRepository.save(Meal);
    }

    @Override
    public void deleteMeal(Long id) {
        mealRepository.deleteById(id);
    }
}
