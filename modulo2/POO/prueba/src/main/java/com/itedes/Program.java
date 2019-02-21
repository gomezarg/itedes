package com.itedes;

import java.util.ArrayList;

public class Program {
    public static void main(String args[]) {
        Dog myDog = new Dog("Firulais", 2.0, "Mediano");
        Cat myCat = new Cat("Pelusa", 1.0, "Corto");

        System.out.println(myDog.getName());
        System.out.println(myDog.getWeight());
        System.out.println(myDog.getAge());
        System.out.println(myDog.getSize());
        myDog.talk();

        System.out.println();

        System.out.println(myCat.getName());
        System.out.println(myCat.getWeight());
        System.out.println(myCat.getAge());
        System.out.println(myCat.getHairLength());
        myCat.talk();

        System.out.println();

        ArrayList<Animal> myList = new ArrayList<Animal>();

        myList.add(myDog);
        myList.add(myCat);

        for(Animal myAnimal : myList) {
            System.out.println(myAnimal.getName());
            System.out.println(myAnimal.getWeight()); 
            System.out.println(myAnimal.getAge()); 
            myAnimal.talk();
            
            System.out.println();
        }
    }
}