package com.hw1.model.dto;

import java.security.PublicKey;

public class Person {
    protected String name;
    private int age;
    private double height;
    private double weight;

    public Person() {
    }

    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String information() {

        return null;
    }
}

