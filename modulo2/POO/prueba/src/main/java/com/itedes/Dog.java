package com.itedes;

public class Dog extends Animal {

    private String size;

    public Dog(String name, Double weight, String size) {
        super(name, weight);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void talk() {
        System.out.println("guau guau!");
    }
}