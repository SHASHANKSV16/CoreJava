package com.xworkz.mobileapp;

import com.xworkz.mobileapp.app.Apps;
import com.xworkz.mobileapp.app.impl.AppsImpl;

public class AppRunnerr {
    public static void main(String[] args) {
        Apps app = new AppsImpl();
        app.install();
        app.update();
        app.uninstall();
    }
}
