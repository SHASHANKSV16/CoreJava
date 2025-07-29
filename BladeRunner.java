class BladeRunner {
    public static void main(String[] blades) {

        String[] shavingUse = {"Shaving","Trimming"};
        

 
        Blade firstBlade = new Blade(1, "Gillette", "Stainless Steel", "Double Edge", shavingUse);
        firstBlade.getData();

        
        Blade secondBlade = new Blade(2, "Feather");
        System.out.println("The blade id is " + secondBlade.bladeId);
        System.out.println("The brand is " + secondBlade.brand);
        System.out.println();

        
        Blade thirdBlade = new Blade("Chromium Ceramic", "Single Edge");
        System.out.println("The material is " + thirdBlade.material);
        System.out.println("The type is " + thirdBlade.type);
        System.out.println();
 
        Blade fifthBlade = new Blade();
        fifthBlade.bladeId = 5;
        fifthBlade.brand = "Wilkinson Sword";
        fifthBlade.material = "Stainless Steel";
        fifthBlade.type = "Double Edge";
        fifthBlade.usage = shavingUse;
        fifthBlade.getData();
    }
}
