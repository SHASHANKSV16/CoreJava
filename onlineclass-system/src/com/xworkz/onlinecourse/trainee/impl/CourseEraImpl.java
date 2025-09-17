package com.xworkz.onlinecourse.trainee.impl;

import com.xworkz.onlinecourse.trainee.Trainee;

public class CourseEraImpl implements Trainee {
    @Override
    public void enroll() {
        System.out.println("trainee enrolled");
    }

    @Override
    public void lessonCompleted() {
        System.out.println("lesson completed");
    }

    @Override
    public void issueCertificate() {
        System.out.println("certificate issued");
    }
}
