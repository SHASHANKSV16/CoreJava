package com.xworkz.penapp.pen.impl;

import com.xworkz.penapp.pen.Pen;

public class PenImpl implements Pen {
    @Override
    public void write() {
        System.out.println("Writing with the pen");
    }

    @Override
    public void refillInk() {
        System.out.println("Pen ink refilled");
    }
}
