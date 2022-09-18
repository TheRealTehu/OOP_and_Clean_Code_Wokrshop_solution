package org.example.person;

public class Person {
    private String name;
    private String phoneNumber;
    private int age;
    private String workplace;
    private String homeTown;

    public Person(String name, String phoneNumber, int age, String workplace, String homeTown) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.workplace = workplace;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + homeTown + " " + phoneNumber + " " + workplace;
    }
}
