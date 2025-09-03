package com.xworkz.lokhasaba;

import com.xworkz.lokhasaba.lokasaba.LokhaSaba;
import com.xworkz.lokhasaba.politician.Politician;

public class LokhaSabaRunner {
    public static void main(String[] args) {

        Politician politician1=new Politician(1,"Lakshimi Kantha","Laggere",45,"Indian");
        Politician politician2=new Politician(2,"Ramesh Gowda","Basavanagudi",52,"Indian");
        Politician politician3=new Politician(3,"Meena Rani","Indiranagar",47,"Indian");
        Politician politician4=new Politician(4,"Prakash Shetty","Malleswaram",54,"Indian");
        Politician politician5=new Politician(5,"Sunitha Rao","Rajajinagar",42,"Indian");
        Politician politician6=new Politician(6,"Harish Kumar","Koramangala",50,"Indian");
        Politician politician7=new Politician(7,"Savitha Naidu","Jayanagar",39,"Indian");
        Politician politician8=new Politician(8,"Manjunath Reddy","Yeshwanthpur",48,"Indian");
        Politician politician9=new Politician(9,"Anitha Deshpande","Hebbal",44,"Indian");
        Politician politician10=new Politician(10,"Vikram Patil","Shivajinagar",53,"Indian");
        Politician politician11=new Politician(11,"Kavitha Shekar","BTM Layout",41,"Indian");
        Politician politician12=new Politician(12,"Suresh Hegde","Whitefield",49,"Indian");


        LokhaSaba lokhaSaba=new LokhaSaba();

        if(lokhaSaba.addPolitician(politician1)&&lokhaSaba.addPolitician(politician2)&&lokhaSaba.addPolitician(politician3)&&
                lokhaSaba.addPolitician(politician4)&&lokhaSaba.addPolitician(politician5)&&lokhaSaba.addPolitician(politician6)&&
                lokhaSaba.addPolitician(politician7)&&lokhaSaba.addPolitician(politician8)&&lokhaSaba.addPolitician(politician9)&&
                lokhaSaba.addPolitician(politician10)&&lokhaSaba.addPolitician(politician11)&&lokhaSaba.addPolitician(politician12)){
            lokhaSaba.getAllPoiticiansInfo();
        }


    }
}
