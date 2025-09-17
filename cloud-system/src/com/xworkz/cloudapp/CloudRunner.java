package com.xworkz.cloudapp;

import com.xworkz.cloudapp.cloud.Cloud;
import com.xworkz.cloudapp.cloud.impl.CloudImpl;

public class CloudRunner {
    public static void main(String[] args) {
        Cloud cloud = new CloudImpl();
        cloud.uploadFile();
        cloud.downloadFile();
        cloud.deleteFile();
    }
}
