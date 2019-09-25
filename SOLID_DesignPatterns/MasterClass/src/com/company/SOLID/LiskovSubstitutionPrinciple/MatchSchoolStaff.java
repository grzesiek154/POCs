package com.company.SOLID.LiskovSubstitutionPrinciple;

public class MatchSchoolStaff implements CourseInstructor {
    @Override
    public void teach() {
        System.out.println("I am teaching math");
    }
}
