class Safari{
	
	int safariId;
	String name;
	int declared;
	double longKm;
	String district;

Safari(int safariId, String name, int declared, double longKm, String district) {
        System.out.println("Parameterized constructor");
        this.safariId = safariId;
        this.name = name;
        this.declared = declared;
        this.longKm = longKm;
        this.district = district;
    }

    public void getData() {
        System.out.println("The safariId is " + safariId);
        System.out.println("The name is " + name);
        System.out.println("The declared year is " + declared);
        System.out.println("The length in km is " + longKm);
        System.out.println("The district is " + district);
        System.out.println();
    }
}