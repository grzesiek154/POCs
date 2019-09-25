package com.company.SOLID.LiskovSubstitutionPrinciple;

public class ScienceSchoolStaff implements CourseInstructor{
    @Override
    public void teach() {
        System.out.println("I am teaching");
    }
}
