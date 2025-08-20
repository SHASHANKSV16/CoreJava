package com.xworkz.hairclipapp.hairclip;

public class HairClipRunner {
    public static void main(String[] args) {
        HairClip firstClip = new HairClip(1, "Clipster", "Plastic", "Black", 20);
        firstClip.getData();

        HairClip secondClip = new HairClip(2, "Fix", "Metal", "Silver", 35);
        secondClip.getData();
    }
}
