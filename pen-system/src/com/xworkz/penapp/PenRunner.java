package com.xworkz.penapp;

import com.xworkz.penapp.pen.Pen;
import com.xworkz.penapp.pen.impl.PenImpl;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new PenImpl();
        pen.write();
        pen.refillInk();
    }
}
