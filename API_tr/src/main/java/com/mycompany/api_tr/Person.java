/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.api_tr;

/**
 *
 * @author rompalskitobiasz
 */
public class Person {

    private String name;
    private int age;
    private int count;

    public Person(String name, int age, int count) {
        this.name = name;
        this.age = age;
        this.count = count;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getCount() {
        return this.count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public String toString(){
        return getName()+", "+getAge()+", "+getCount();
    }
}
