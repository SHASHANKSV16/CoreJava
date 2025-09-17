package com.xworkz.navigationapp.navigation.impl;

import com.xworkz.navigationapp.navigation.Navigation;

public class NavigationImpl implements Navigation {
    @Override
    public void setDestination() {
        System.out.println("Destination set successfully");
    }

    @Override
    public void startNavigation() {
        System.out.println("Navigation started");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Navigation stopped");
    }
}
