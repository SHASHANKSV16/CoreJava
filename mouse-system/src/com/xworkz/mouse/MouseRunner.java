package com.xworkz.mouse;

import com.xworkz.mouse.functionalities.Functinalities;
import com.xworkz.mouse.functionalities.impl.HpMouseImpl;

public class MouseRunner {
    public static void main(String[] args) {
        Functinalities hpMouse = new HpMouseImpl();
        hpMouse.leftClick();
        hpMouse.rightClick();
        hpMouse.scroll();

    }
}
