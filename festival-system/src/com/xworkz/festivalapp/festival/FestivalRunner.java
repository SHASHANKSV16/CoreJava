package com.xworkz.festivalapp.festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival firstFestival = new Festival(1, "Diwali", "India", "November", 5);
        firstFestival.getData();

        Festival secondFestival = new Festival(2, "Holi", "India", "March", 2);
        secondFestival.getData();
    }
}
