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

import com.SugarDevs.DiabetsAnalytics.models.Client;
import com.SugarDevs.DiabetsAnalytics.service.Implementations.ClientService;

@RestController
@ResponseBody
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> findAllClients(){
        return clientService.findAllClients();
    }

    @GetMapping("/{id}")
    public Optional<Client> findClientById(@PathVariable("id") Long id){
        return clientService.findById(id);
    }

    @PostMapping
    public Client saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @PutMapping("/{id}/update")
    public Client updateClient (@RequestBody Client client){
        return clientService.updateClient(client);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }    
}
