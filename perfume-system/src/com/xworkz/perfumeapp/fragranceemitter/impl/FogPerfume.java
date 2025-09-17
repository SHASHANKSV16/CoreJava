package com.xworkz.perfumeapp.fragranceemitter.impl;

import com.xworkz.perfumeapp.fragranceemitter.FragranceEmitter;

public class FogPerfume implements FragranceEmitter {
    @Override
    public void spray() {
        System.out.println("sparying the perfume");
    }

    @Override
    public void refill() {
        System.out.println("refilling the perfume");
    }

    @Override
    public void checkFragrance() {
        System.out.println("checking fragrance");
    }
}
