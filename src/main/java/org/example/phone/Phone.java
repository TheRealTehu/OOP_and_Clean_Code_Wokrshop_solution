package org.example.phone;

import org.example.person.Person;
import org.example.phone.app.PhoneApp;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private int charge;
    private List<PhoneApp> apps;
    private PhoneApp favoriteApp;
    private List<Person> contacts;

    public Phone(List<PhoneApp> apps) {
        this.charge = 100;
        this.apps = apps;
        this.contacts = new ArrayList<>();
    }

    public Phone() {
        this.charge = 100;
        this.apps = new ArrayList<>();
        this.contacts = new ArrayList<>();
    }

    public int getCharge() {
        return charge;
    }

    public List<Person> getContacts() {
        return contacts;
    }

    public List<PhoneApp> getApps() {
        return apps;
    }

    public PhoneApp getAppByName(String name){
        for (PhoneApp app: apps) {
            if(app.getName().equals(name)){
                return app;
            }
        }
        return null;
    }

    public void setApps(List<PhoneApp> apps) {
        this.apps = apps;
    }

    public void drainBattery(){
        if(charge > 0){
            charge--;
        }
    }

    public void chargeBattery(){
        if(charge < 100){
            charge++;
        }
    }

    public void addApp(PhoneApp app){
        if(!apps.contains(app)){
            apps.add(app);
        }
    }

    public void deleteApp(PhoneApp app){
        apps.remove(app);
    }

    public void showInstalledApps(){
        StringBuilder builder = new StringBuilder();
        builder.append("Installed apps (" + apps.size() + ")\n");
        for (PhoneApp app: apps) {
            builder.append(app.toString() + "\n");
        }
        System.out.println(builder);
    }

    public void showFavoriteApp() {
        if(favoriteApp != null){
            System.out.println(favoriteApp);
        } else {
            System.out.println("You don't have a favorite app yet!");
        }
    }

    public void setFavoriteApp(PhoneApp favoriteApp) {
        this.favoriteApp = favoriteApp;
    }

    public void addPersonToContacts(Person person){
        if(!contacts.contains(person)){
            contacts.add(person);
        }
    }

    public void removePersonFromContacts(Person person){
        contacts.remove(person);
    }

    public void showContacts(){
        StringBuilder builder = new StringBuilder();
        builder.append("Contacts (" + contacts.size() + ")\n");
        for (Person person: contacts) {
            builder.append(person.toString() + "\n");
        }
        System.out.println(builder);
    }
}
