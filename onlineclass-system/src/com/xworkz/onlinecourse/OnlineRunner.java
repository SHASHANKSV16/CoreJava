package com.xworkz.onlinecourse;

import com.xworkz.onlinecourse.trainee.Trainee;
import com.xworkz.onlinecourse.trainee.impl.CourseEraImpl;

public class OnlineRunner {
    public static void main(String[] args) {
        Trainee courseEra = new CourseEraImpl();
        courseEra.enroll();
        courseEra.lessonCompleted();
        courseEra.issueCertificate();
    }
}
