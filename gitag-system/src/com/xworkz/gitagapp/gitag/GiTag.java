package com.xworkz.gitagapp.gitag;

public class GiTag {
    int GiId;
    String name;
    String state;
    String type;
    String year;

    GiTag(int GiId, String name, String type, String state, String year) {
        this.GiId = GiId;
        this.name = name;
        this.type = type;
        this.state = state;
        this.year = year;
    }


    public void getData() {
        System.out.println("the GiId is " + GiId);
        System.out.println("the name is " + name);
        System.out.println("the type is " + type);
        System.out.println("the state is " + state);
        System.out.println("the year is " + year);
        System.out.println();
    }
}
