class Festival {

    int festivalId;
    String name;
    String country;
    String month;
    int durationInDays;

    Festival() {
    }

    Festival(int festivalId, String name) {
        this.festivalId = festivalId;
        this.name = name;
    }

    Festival(String country, String month) {
        this.country = country;
        this.month = month;
    }

    Festival(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    Festival(int festivalId, String name, String country, String month, int durationInDays) {
        System.out.println("Parameterized constructor");
        this.festivalId = festivalId;
        this.name = name;
        this.country = country;
        this.month = month;
        this.durationInDays = durationInDays;
    }

    public void getData() {
        System.out.println("The festival id is " + festivalId);
        System.out.println("The name is " + name);
        System.out.println("The country is " + country);
        System.out.println("The month is " + month);
        System.out.println("The duration in days is " + durationInDays);
        System.out.println();
    }
}
