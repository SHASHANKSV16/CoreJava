package com.xworkz.mouse.functionalities.impl;

import com.xworkz.mouse.functionalities.Functinalities;

public class HpMouseImpl implements Functinalities {


    @Override
    public void leftClick() {
        System.out.println("left Click");
    }

    @Override
    public void rightClick() {
        System.out.println("right click");
    }

    @Override
    public void scroll() {
        System.out.println("scroll");
    }
}
