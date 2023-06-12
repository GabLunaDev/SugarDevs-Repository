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

import com.SugarDevs.DiabetsAnalytics.models.Contact;
import com.SugarDevs.DiabetsAnalytics.service.Implementations.ContactService;


@RestController
@ResponseBody
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService ContactService){
        this.contactService = ContactService;
    }

    @GetMapping
    public List<Contact> findAllContacts(){
        return contactService.findAllContacts();
    }

    @GetMapping("/{id}")
    public Optional<Contact> findContactById(@PathVariable("id") Long id){
        return contactService.findById(id);
    }

    @PostMapping
    public Contact saveContact(@RequestBody Contact Contact){
        return contactService.saveContact(Contact);
    }

    @PutMapping("/{id}/update")
    public Contact updateContact (@RequestBody Contact Contact){
        return contactService.updateContact(Contact);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteContact(@PathVariable Long id){
        contactService.deleteContact(id);
    }    
}

