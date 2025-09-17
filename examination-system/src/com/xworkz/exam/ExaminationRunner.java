package com.xworkz.exam;

import com.xworkz.exam.exams.Exam;
import com.xworkz.exam.exams.impl.KcetImpl;

public class ExaminationRunner {
    public static void main(String[] args) {
        Exam kCet = new KcetImpl();
        kCet.examCourse();
        kCet.examAttended();
        kCet.registerNo();
    }
}
