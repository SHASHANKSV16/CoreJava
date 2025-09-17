package com.xworkz.navigationapp;

import com.xworkz.navigationapp.navigation.Navigation;
import com.xworkz.navigationapp.navigation.impl.NavigationImpl;

public class NavigationRunner {
    public static void main(String[] args) {
        Navigation navigator = new NavigationImpl();
        navigator.setDestination();
        navigator.startNavigation();
        navigator.stopNavigation();
    }
}
