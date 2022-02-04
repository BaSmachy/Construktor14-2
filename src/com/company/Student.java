package com.company;

import java.time.LocalDate;

public class Student {
    //• туулган куну, аты, фамилиāсы, жашы
    private String name;
    private String surname;
    private LocalDate dateofbirth;
    private int age;

    public Student() {
    }

    public Student(String name, String surname, LocalDate dateofbirth) {
        this.name = name;
        this.surname = surname;
        this.dateofbirth = dateofbirth;
        this.age = LocalDate.now().getYear() - dateofbirth.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <=0){
            System.err.println("invalid age");
        } else {
            this.age = age;
        }
    }
}
