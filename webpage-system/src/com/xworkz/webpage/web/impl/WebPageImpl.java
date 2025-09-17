package com.xworkz.webpage.web.impl;

import com.xworkz.webpage.web.WebPage;

public class WebPageImpl implements WebPage {
    @Override
    public void openURL() {
        System.out.println("URL opened ");
    }

    @Override
    public void refreshPage() {
        System.out.println("Web page refreshed");
    }

    @Override
    public void goBack() {
        System.out.println(" back to previous page");
    }
}
