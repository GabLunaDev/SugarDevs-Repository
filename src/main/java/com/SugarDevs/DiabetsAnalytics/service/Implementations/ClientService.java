package com.SugarDevs.DiabetsAnalytics.service.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SugarDevs.DiabetsAnalytics.models.Client;
import com.SugarDevs.DiabetsAnalytics.repository.ClientRepository;
import com.SugarDevs.DiabetsAnalytics.service.Interfaces.ClientServiceInterface;

@Service
public class ClientService implements ClientServiceInterface {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
 