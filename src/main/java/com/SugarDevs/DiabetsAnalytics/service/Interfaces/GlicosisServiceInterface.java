package com.SugarDevs.DiabetsAnalytics.service.Interfaces;

import java.util.List;
import java.util.Optional;

import com.SugarDevs.DiabetsAnalytics.models.Glicosis;

public interface GlicosisServiceInterface {
    List<Glicosis> findAllGlicosises();
    Optional<Glicosis> findById(Long id);
    Glicosis saveGlicosis(Glicosis glicosis);
    Glicosis updateGlicosis(Glicosis glicosis);
    void deleteGlicosis(Long id);
}
