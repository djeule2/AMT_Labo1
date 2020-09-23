package ch.heig.od.business;

import ch.heig.od.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private List<Contact>  contacts;

    public ContactService() {
        contacts = new ArrayList<>();
        contacts.add(new Contact("Pierre",1234));
        contacts.add(new Contact("Sylvie",1111));
    }

    synchronized public List<Contact> getContacts() {
        return contacts;
    }

    synchronized public int add(Contact contact) {
        contacts.add(contact);
        return contacts.size()-1;
    }
}
