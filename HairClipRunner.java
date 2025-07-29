class HairClipRunner {
    public static void main(String[] clips) {

        String colors[] = {"Black", "Silver", "Pink"};

        HairClip firstClip = new HairClip(1, "Clipster", "Plastic", colors, 20);
        firstClip.getData();

        HairClip secondClip = new HairClip(2, "Fix");
        System.out.println("The clip id is " + secondClip.clipId);
        System.out.println("The brand is " + secondClip.brand);
        System.out.println();

        HairClip thirdClip = new HairClip("HairHug", "Plastic");
        System.out.println("The brand is " + thirdClip.brand);
        System.out.println("The material is " + thirdClip.material);
        System.out.println();

        HairClip fourthClip = new HairClip();
        fourthClip.clipId = 4;
        fourthClip.brand = "Gripster";
        fourthClip.material = "Metal";
        fourthClip.colors = colors;
        fourthClip.price = 30;
        fourthClip.getData();
    }
}
