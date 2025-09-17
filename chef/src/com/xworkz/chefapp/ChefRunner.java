package com.xworkz.chefapp;

import com.xworkz.chefapp.chef.Chef;
import com.xworkz.chefapp.chef.impl.ChefImpl;

public class ChefRunner {
    public static void main(String[] args) {


        Chef chef = new ChefImpl();

        chef.cook();
        chef.cutting();
        chef.selectingIngredients();
    }
}
