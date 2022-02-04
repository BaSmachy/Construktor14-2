package com.company;

public class Courses {//   • аты, номери, мугалимдин аты жону, курс башталган кун

    private String name;
    private int number;
    private String nameTeacher;
    private String coursesday;

    public Courses(String name, int number, String nameTeacher, String coursesday) {
        this.name = name;
        this.number = number;
        this.nameTeacher = nameTeacher;
        this.coursesday = coursesday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getCoursesday() {
        return coursesday;
    }

    public void setCoursesday(String coursesday) {
        this.coursesday = coursesday;
    }
}



