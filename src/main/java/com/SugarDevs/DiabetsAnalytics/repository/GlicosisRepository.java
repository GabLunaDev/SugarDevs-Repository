package com.SugarDevs.DiabetsAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SugarDevs.DiabetsAnalytics.models.Glicosis;

@Repository
public interface GlicosisRepository extends JpaRepository<Glicosis, Long> {
    
}
