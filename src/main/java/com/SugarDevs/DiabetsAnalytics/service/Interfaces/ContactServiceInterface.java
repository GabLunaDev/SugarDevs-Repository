package com.SugarDevs.DiabetsAnalytics.service.Interfaces;

import java.util.List;
import java.util.Optional;

import com.SugarDevs.DiabetsAnalytics.models.Contact;

public interface ContactServiceInterface {
    List<Contact> findAllContacts();
    Optional<Contact> findById(Long id);
    Contact saveContact(Contact contact);   
    Contact updateContact(Contact contact);
    void deleteContact(Long id);
}
