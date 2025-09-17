package com.xworkz.aissgnmentapp.assignment.impl;

import com.xworkz.aissgnmentapp.assignment.Assignment;

public class CsImpl implements Assignment {
    @Override
    public void upload() {
        System.out.println("Assignment uploaded successfully");
    }

    @Override
    public void submit() {
        System.out.println("Assignment submitted");
    }

    @Override
    public void checkStatus() {
        System.out.println("Assignment status checked");
    }
}
