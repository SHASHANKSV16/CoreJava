class Safari {

    int safariId;
    String name;
    int declared;
    double longKm;
    String district;
    String animals[];

    Safari() {
    }

    Safari(int safariId, String name) {
        this.safariId = safariId;
        this.name = name;
    }

    Safari(int safariId, String name, int declared, double longKm) {
        this.safariId = safariId;
        this.name = name;
        this.declared = declared;
        this.longKm = longKm;
    }

    Safari(int safariId, String name, int declared, double longKm, String district, String animals[]) {
        System.out.println("Parameterized constructor");
        this.safariId = safariId;
        this.name = name;
        this.declared = declared;
        this.longKm = longKm;
        this.district = district;
        this.animals = animals;
    }

    public void getData() {
        System.out.println("The safariId is " + safariId);
        System.out.println("The name is " + name);
        System.out.println("The declared year is " + declared);
        System.out.println("The length in km is " + longKm);
        System.out.println("The district is " + district);

        if (animals != null) {
            System.out.println("The animals are: ");
            for (String a : animals) {
                System.out.println(a );
            }
          
        }
        System.out.println();
    }
}
