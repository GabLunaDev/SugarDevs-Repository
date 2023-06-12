package com.SugarDevs.DiabetsAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SugarDevs.DiabetsAnalytics.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
