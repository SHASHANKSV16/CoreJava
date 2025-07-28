class Network {
    int networkId;
    String type;       
    double speed;
    String frequency;  
    String provider;   
	
	 Network(int networkId, String type, int speed, String frequency, String provider) {
        System.out.println("Parameterized constructor");
        this.networkId = networkId;
        this.type = type;
        this.speed = speed;
        this.frequency = frequency;
        this.provider = provider;
    }

   
    public void getData() {
        System.out.println("the network id is " + networkId);
        System.out.println("the type is " + type);
        System.out.println("the speed is " + speed);
        System.out.println("the frequency is " + frequency);
        System.out.println("the provider is " + provider);
        System.out.println();
    }
	
}
