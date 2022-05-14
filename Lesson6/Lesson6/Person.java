package Lesson6.Lesson6;
public class Person {
    
    protected String name;
    protected String surName;
    protected int age;
    protected int phoneNumber;

    public Person (String name, String surName, int age, int phoneNumber){
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String toCSV (String name, String surName, int age, int phoneNumber) {
        String formated = "\"" + name + "\";\"" + surName + "\";\"" + Integer.toString(age) + "\";\"" + Integer.toString(phoneNumber) + "\"";
        return formated;
    }
}
