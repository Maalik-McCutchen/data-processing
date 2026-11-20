package com.pluralsight;

import com.pluralsight.loops.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        Person person1 = new Person("John", "Smith", 25);
        personList.add(person1);

        Person person2 = new Person("Sarah", "Johnson", 30);
        personList.add(person2);

        Person person3 = new Person("Michael", "Brown", 22);
        personList.add(person3);

        Person person4 = new Person("Emily", "Davis", 27);
        personList.add(person4);

        Person person5 = new Person("Potato", "Sensei", 35);
        personList.add(person5);

        Person person6 = new Person("Jessica", "Miller", 24);
        personList.add(person6);

        Person person7 = new Person("David", "Anderson", 42);
        personList.add(person7);

        Person person8 = new Person("Ashley", "Thomas", 29);
        personList.add(person8);

        Person person9 = new Person("Daniel", "Jackson", 19);
        personList.add(person9);

        Person person10 = new Person("Olivia", "Smith", 33);
        personList.add(person10);

        System.out.println("Enter a first or last name to search: ");
        String user = myScanner.nextLine().trim();

        List<Person> poepleList = new ArrayList<>();

        for (Person person : personList) {

            if (person.getFirstName().equalsIgnoreCase(user) || person.getLastName().equalsIgnoreCase(user)) {
                poepleList.add(person);
            }
        }
        for (Person person11 : poepleList) {
            System.out.println(person11.getFirstName() + " " + person11.getLastName());

        }
    }
}
