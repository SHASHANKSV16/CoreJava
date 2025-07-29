class Coin {

    int coinId;
    String material;
    String shapesAvailable[];
    int year;
    double value;

    Coin() {
    }

    Coin(int coinId, String material) {
        this.coinId = coinId;
        this.material = material;
    }

   

    Coin(int year, double value) {
        this.year = year;
        this.value = value;
    }

    Coin(int coinId, String material, String shapesAvailable[], int year, double value) {
        System.out.println("Parameterized constructor");
        this.coinId = coinId;
        this.material = material;
        this.shapesAvailable = shapesAvailable;
        this.year = year;
        this.value = value;
    }

    public void getData() {
        System.out.println("The coin id is " + coinId);
        System.out.println("The material is " + material);
        System.out.print("The shapes available are: ");
        if (shapesAvailable != null) {
            for (String shape : shapesAvailable) {
                System.out.print(shape);
            }
        }
        System.out.println("The year is " + year);
        System.out.println("The value is " + value);
        System.out.println();
    }
}
