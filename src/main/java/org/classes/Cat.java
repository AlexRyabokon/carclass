package org.classes;

public class Cat {


    private int age;
    private String name = "Barsik";

    public Cat(int age) {
        this.age = age;


    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   String CatTextInfo(){
        return "His name is: " + getName() + "; His age is: " + getAge();
   }
}
