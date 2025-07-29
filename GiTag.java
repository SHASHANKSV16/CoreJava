class GiTag {

    int GiId;
    String name;
    String state;
    String type;
    String year;

    GiTag() {
    }

    GiTag(int GiId, String name) {
        this.GiId = GiId;
        this.name = name;
    }

    GiTag(String state, String type) {
        this.state = state;
        this.type = type;
    }

    GiTag(String year) {
        this.year = year;
    }

    GiTag(int GiId, String name, String type, String state, String year) {
        System.out.println("Parameterized constructor");
        this.GiId = GiId;
        this.name = name;
        this.type = type;
        this.state = state;
        this.year = year;
    }

    public void getData() {
        System.out.println("The GiId is " + GiId);
        System.out.println("The name is " + name);
        System.out.println("The type is " + type);
        System.out.println("The state is " + state);
        System.out.println("The year is " + year);
        System.out.println();
    }
}
