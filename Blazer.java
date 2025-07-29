class Blazer {

    int blazerId;
    String colourAvailable[];
    int noOfPockets;
    int noOfButtons;
    String typeOfMaterial;
    String type;

    Blazer() {
    }

    Blazer(int blazerId, int noOfButtons) {
        this.blazerId = blazerId;
        this.noOfButtons = noOfButtons;
    }

    Blazer(String typeOfMaterial, String type) {
        this.typeOfMaterial = typeOfMaterial;
        this.type = type;
    }

    

    Blazer(int blazerId, String colourAvailable[], int noOfPockets, int noOfButtons, String typeOfMaterial, String type) {
        System.out.println("Parameterized constructor is invoked");
        this.blazerId = blazerId;
        this.colourAvailable = colourAvailable;
        this.noOfPockets = noOfPockets;
        this.noOfButtons = noOfButtons;
        this.typeOfMaterial = typeOfMaterial;
        this.type = type;
    }

    public void getData() {
        System.out.println("The blazer id is " + blazerId);
        System.out.print("The colours are: ");
        if (colourAvailable != null) {
            for (String colour : colourAvailable) {
                System.out.print(colour );
            }
        }
        System.out.println();
        System.out.println("The number of pockets are " + noOfPockets);
        System.out.println("The number of buttons are " + noOfButtons);
        System.out.println("The material is " + typeOfMaterial);
        System.out.println("The type of blazer is " + type);
        System.out.println();
    }
}
