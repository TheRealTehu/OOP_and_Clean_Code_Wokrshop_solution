package org.example.phone.app;

import org.example.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Filter extends PhoneApp{
    private List<Person> contacts;

    public Filter(List<Person> contacts) {
        super("Filter", "manufacturer", "1.0.0");
        this.contacts = contacts;
    }

    public List<Person> getContactsFromSameWorkplace(String workplace){
        List<Person> contactsFromSameWorkplace = new ArrayList<>();
        for (Person person: contacts) {
            if(person.getWorkplace().equals(workplace)){
                contactsFromSameWorkplace.add(person);
            }
        }
        return contactsFromSameWorkplace;
    }

    public List<Person> getOlderContacts(int limit){
        List<Person> contactsOlderThanLimit = new ArrayList<>();
        for (Person person: contacts) {
            if(person.getAge() > limit){
                contactsOlderThanLimit.add(person);
            }
        }
        return contactsOlderThanLimit;
    }

    public List<Person> getYoungerContacts(int limit){
        List<Person> contactsYoungerThanLimit = new ArrayList<>();
        for (Person person: contacts) {
            if(person.getAge() < limit){
                contactsYoungerThanLimit.add(person);
            }
        }
        return contactsYoungerThanLimit;
    }

    public List<Person> getContactsBetweenAgeRange(int lowerLimit, int upperLimit){
        List<Person> contactsInAgeRange = new ArrayList<>();
        for (Person person: contacts) {
            if(person.getAge() < upperLimit && person.getAge() > lowerLimit){
                contactsInAgeRange.add(person);
            }
        }
        return contactsInAgeRange;
    }


}
