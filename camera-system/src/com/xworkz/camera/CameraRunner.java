package com.xworkz.camera;

import com.xworkz.camera.functionalities.Functionalities;
import com.xworkz.camera.functionalities.impl.CanonImpl;

public class CameraRunner {
    public static void main(String[] args) {
        Functionalities canon = new CanonImpl();
        canon.capturePhoto();
        canon.recordVideo();
        canon.zoomIn();
    }
}
