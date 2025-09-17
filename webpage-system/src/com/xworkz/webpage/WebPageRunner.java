package com.xworkz.webpage;

import com.xworkz.webpage.web.WebPage;
import com.xworkz.webpage.web.impl.WebPageImpl;

public class WebPageRunner {
    public static void main(String[] args) {
        WebPage page = new WebPageImpl();
        page.openURL();
        page.refreshPage();
        page.goBack();
    }
}
