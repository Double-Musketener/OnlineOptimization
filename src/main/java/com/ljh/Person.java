package com.ljh;

public class Person implements Cloneable{


    public static void main(String[] args) {

        Person person = new Person("dsd", "dsds");
        try {
            Person clone = (Person) person.clone();
            System.out.println(clone + "88888");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(person);


    }



    private String name;
    private String age;


    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

