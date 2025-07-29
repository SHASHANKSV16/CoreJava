class FestivalRunner {
    public static void main(String[] festivals) {

        Festival firstFestival = new Festival(1, "Diwali", "India", "November", 5);
        firstFestival.getData();

        Festival secondFestival = new Festival(2, "Holi");
        System.out.println("The festival id is " + secondFestival.festivalId);
        System.out.println("The name is " + secondFestival.name);
        System.out.println();

        Festival thirdFestival = new Festival("India", "October");
        System.out.println("The country is " + thirdFestival.country);
        System.out.println("The month is " + thirdFestival.month);
        System.out.println();

        Festival fourthFestival = new Festival(1);
        System.out.println("The duration in days is " + fourthFestival.durationInDays);
        System.out.println();

        Festival fifthFestival = new Festival();
        fifthFestival.festivalId = 5;
        fifthFestival.name = "Raksha Bandhan";
        fifthFestival.country = "India";
        fifthFestival.month = "August";
        fifthFestival.durationInDays = 1;
        fifthFestival.getData();
    }
}
