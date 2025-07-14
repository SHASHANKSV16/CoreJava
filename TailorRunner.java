class TailorRunner {
    public static void main(String[] tailor) {

        String name = Tailor.getName();
        System.out.println("Tailor Name: " + name);

        int exp = Tailor.getExperience();
        System.out.println("Experience: " + exp + " years");

        String location = Tailor.getLocation();
        System.out.println("Shop Location " + location);

        boolean allTypes = Tailor.doesStitchAll();
        System.out.println("Stitches for Ladies & Gents: " + allTypes);

        double charge = Tailor.getCharge();
        System.out.println("Stitching Charge " + charge);
    }
}
