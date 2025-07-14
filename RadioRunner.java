class RadioRunner {
    public static void main(String[] radio) {

        String brand = Radio.getBrand();
        System.out.println("Radio Brand: " + brand);

        double frequency = Radio.getFrequency();
        System.out.println("Tuned Frequency: " + frequency + " MHz");

        boolean isOn = Radio.isRadioOn();
        System.out.println("Is Radio On " + isOn);

        int volume = Radio.getVolumeLevel();
        System.out.println("Volume Level: " + volume);

        double price = Radio.getPrice();
        System.out.println("Price: ₹" + price);
    }
}
