package org.example;

public class PersonClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        int returnedAge = person1.printAge();
        System.out.println("~~~"+returnedAge+"~~~");
    }
}
