package com.xworkz.gitagapp.gitag;

public class GiTagRunner {
    public static void main(String[] args) {
        GiTag firstTag = new GiTag(1, "Darjeeling Tea", "Agricultural", "West Bengal", "2004–05");
        firstTag.getData();

        GiTag secondTag = new GiTag(2, "Aranmula Kannadi", "Handicraft", "Kerala", "2004–05");
        secondTag.getData();
    }
}
