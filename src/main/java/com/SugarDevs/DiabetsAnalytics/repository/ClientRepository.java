package com.SugarDevs.DiabetsAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SugarDevs.DiabetsAnalytics.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
