package com.SugarDevs.DiabetsAnalytics.service.Interfaces;

import java.util.List;
import java.util.Optional;

import com.SugarDevs.DiabetsAnalytics.models.Diet;

public interface DietServiceInterface {
    List<Diet> findAllDiets();
    Optional<Diet> findById(Long id);
    Diet saveDiet(Diet diet);
    Diet updateDiet(Diet diet);
    void deleteDiet(Long id);
}
