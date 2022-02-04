package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Courses java = new Courses("Java", 5,"Muhammed Allanov","21.08.2021");
        System.out.println("Course name"+" "+java.getName()+" "+ java.getNumber()+" "+java.getNameTeacher()+" "+
                " "+ java.getCoursesday());

        Student s1 = new Student("Beksultan","Mamatkadyr uulu",
                LocalDate.of(2004,
                        2,02));
        System.out.print(s1.getName()+" "+s1.getSurname()+" "
                +s1.getDateofbirth()+" "+" age -"+" "+
                "["+s1.getAge()+"]");
    }


}
