class NetworkRunner {
    public static void main(String[] networks) {

        String typesAvailable[] = {"LAN", "WAN", "MAN"};

        Network firstNetwork = new Network(1, "LAN", 100, "2.4GHz", "LinkNova", typesAvailable);
        firstNetwork.getData();

        Network secondNetwork = new Network(2, "WAN");
        System.out.println("the network id is " + secondNetwork.networkId);
        System.out.println("the type is " + secondNetwork.type);
        System.out.println();

        Network thirdNetwork = new Network("MAN", 300);
        System.out.println("the type is " + thirdNetwork.type);
        System.out.println("the speed is " + thirdNetwork.speed);
        System.out.println();

        Network fourthNetwork = new Network("2.4GHz", "NodeWave");
        System.out.println("the frequency is " + fourthNetwork.frequency);
        System.out.println("the provider is " + fourthNetwork.provider);
        System.out.println();
    }
}
