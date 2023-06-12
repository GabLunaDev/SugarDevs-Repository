package com.SugarDevs.DiabetsAnalytics.service.Interfaces;

import java.util.List;
import java.util.Optional;

import com.SugarDevs.DiabetsAnalytics.models.Client;

public interface ClientServiceInterface {
    List<Client> findAllClients();
    Optional<Client> findById(Long id);
    Client saveClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Long id);
}
