package com.xworkz.mobileapp.app.impl;

import com.xworkz.mobileapp.app.Apps;

public class AppsImpl implements Apps {
    @Override
    public void install() {
        System.out.println("App installed successfully");
    }

    @Override
    public void uninstall() {
        System.out.println("App uninstalled");
    }

    @Override
    public void update() {
        System.out.println("App updated to the latest version");
    }
}
