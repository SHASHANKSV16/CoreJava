package com.xworkz.cloudapp.cloud.impl;

import com.xworkz.cloudapp.cloud.Cloud;

public class CloudImpl implements Cloud {
    @Override
    public void uploadFile() {
        System.out.println("File uploaded to cloud");
    }

    @Override
    public void downloadFile() {
        System.out.println("File downloaded from cloud");
    }

    @Override
    public void deleteFile() {
        System.out.println("File deleted from cloud");
    }

}
