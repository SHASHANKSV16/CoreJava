package com.xworkz.commercialspace;

import com.xworkz.commercialspace.commercial.Commercial;
import com.xworkz.commercialspace.commercial.shop.HariSuperSandwitch;

public class CommercialRunner {
    public static void main(String[] args) {


        Commercial commercial1 = new HariSuperSandwitch();
        commercial1.doBusiness();
    }
}
