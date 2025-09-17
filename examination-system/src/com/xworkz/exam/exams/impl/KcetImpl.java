package com.xworkz.exam.exams.impl;

import com.xworkz.exam.exams.Exam;

public class KcetImpl implements Exam {

    @Override
    public void examCourse() {
        System.out.println("the exam course is opted");
    }

    @Override
    public void registerNo() {
        System.out.println("the user is registered");

    }

    @Override
    public void examAttended() {
        System.out.println("the user attended exam");
    }
}
