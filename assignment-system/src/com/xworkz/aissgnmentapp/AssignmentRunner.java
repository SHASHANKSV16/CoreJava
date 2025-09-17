package com.xworkz.aissgnmentapp;

import com.xworkz.aissgnmentapp.assignment.Assignment;
import com.xworkz.aissgnmentapp.assignment.impl.CsImpl;

public class AssignmentRunner {

    public static void main(String[] args) {
        Assignment assignment = new CsImpl();
        assignment.upload();
        assignment.submit();
        assignment.checkStatus();
    }
}
