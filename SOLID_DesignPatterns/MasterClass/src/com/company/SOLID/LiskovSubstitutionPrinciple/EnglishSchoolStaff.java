package com.company.SOLID.LiskovSubstitutionPrinciple;

public class EnglishSchoolStaff implements CourseInstructor{
    @Override
    public void teach() {
        System.out.println("I am english teacher");
    }
}
