package com.SugarDevs.DiabetsAnalytics.service.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SugarDevs.DiabetsAnalytics.models.Contact;
import com.SugarDevs.DiabetsAnalytics.repository.ContactRepository;
import com.SugarDevs.DiabetsAnalytics.service.Interfaces.ContactServiceInterface;

@Service
public class ContactService implements ContactServiceInterface {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository ContactRepository){
        this.contactRepository = ContactRepository;
    }

    @Override
    public List<Contact> findAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Optional<Contact> findById(Long id) {
        return contactRepository.findById(id);
    }

    @Override
    public Contact saveContact(Contact Contact) {
        return contactRepository.save(Contact);
    }

    @Override
    public Contact updateContact(Contact Contact) {
        return contactRepository.save(Contact);
    }

    @Override
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}