class Network {
    int networkId;
    String type;
    double speed;
    String frequency;
    String provider;
    String typesAvailable[];

    Network() {
    }

    Network(int networkId, String type) {
        this.networkId = networkId;
        this.type = type;
    }

    Network(String type, double speed) {
        this.type = type;
        this.speed = speed;
    }

    Network(String frequency, String provider) {
        this.frequency = frequency;
        this.provider = provider;
    }

    Network(int networkId, String type, double speed, String frequency, String provider, String typesAvailable[]) {
        System.out.println("Parameterized constructor");
        this.networkId = networkId;
        this.type = type;
        this.speed = speed;
        this.frequency = frequency;
        this.provider = provider;
        this.typesAvailable = typesAvailable;
    }

    public void getData() {
        System.out.println("the network id is " + networkId);
        System.out.println("the type is " + type);
        System.out.println("the speed is " + speed);
        System.out.println("the frequency is " + frequency);
        System.out.println("the provider is " + provider);
        if (typesAvailable != null) {
            System.out.println("the types available are ");
            for (String t : typesAvailable) {
                System.out.println(t);
            }
         
        }
        System.out.println();
    }
}
