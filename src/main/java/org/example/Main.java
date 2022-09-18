package org.example;

import org.example.person.Person;
import org.example.phone.Phone;
import org.example.phone.app.Filter;
import org.example.phone.app.PhoneApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.getCharge());

        for (int i = 0; i < 30; i++) {
            phone.drainBattery();
        }

        System.out.println(phone.getCharge());

        for (int i = 0; i < 50; i++) {
            phone.chargeBattery();
        }

        System.out.println(phone.getCharge());

        phone.showFavoriteApp();

        Person person1 = new Person("Bruce Banner", "0000001", 34, "Irodaház", "Székesfehérvár");
        Person person2 = new Person("Bruce Wayne", "0000002", 56, "Irodaház", "Esztergom");
        Person person3 = new Person("Clark Kent", "0000003", 20, "Farm", "Győr");
        Person person4 = new Person("Peter Parker", "0000004", 100, "Iskola", "Siófok");
        Person person5 = new Person("Barry Alan", "0000005", 4, "Parlament", "Debrecen");

        PhoneApp app1 = new PhoneApp("Twitter", "TwitterSoft", "1.34.0");
        PhoneApp app2 = new PhoneApp("Instagram", "meta", "0.4.23");

        List<PhoneApp> appList = new ArrayList<>(){{add(app1); add(app2);}};

        Phone newPhone = new Phone(appList);

        newPhone.addPersonToContacts(person1);
        newPhone.addPersonToContacts(person2);
        newPhone.addPersonToContacts(person3);
        newPhone.addPersonToContacts(person4);
        newPhone.addPersonToContacts(person5);

        newPhone.addApp(new Filter(newPhone.getContacts()));

        newPhone.setFavoriteApp(newPhone.getAppByName("Filter"));

        System.out.println("My favorite app is:");
        newPhone.showFavoriteApp();

        Filter filter = (Filter) newPhone.getAppByName("Filter");

        System.out.println("Contacts in age range of 18 and 40");
        writeListToConsole(filter.getContactsBetweenAgeRange(18, 40));
        System.out.println("Contacts working in Irodaház");
        writeListToConsole(filter.getContactsFromSameWorkplace("Irodaház"));
        System.out.println("Contacts older than 30");
        writeListToConsole(filter.getOlderContacts(30));
        System.out.println("Contacts younger than 100");
        writeListToConsole(filter.getYoungerContacts(100));
    }

    private static void writeListToConsole(List<Person> list) {
        for (Person person: list) {
            System.out.println(person);
        }
    }
}