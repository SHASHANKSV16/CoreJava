class King {
    int kingId;
    String name;
    String dynasty;
    String kingdom;
    String capital;
    String[] battles;  

    King() {
        
    }

    King(int kingId, String name) {
        this.kingId = kingId;
        this.name = name;
    }

    King(String dynasty, String kingdom) {
        this.dynasty = dynasty;
        this.kingdom = kingdom;
    }


    King(int kingId, String name, String dynasty, String kingdom, String capital, String[] battles) {
        this.kingId = kingId;
        this.name = name;
        this.dynasty = dynasty;
        this.kingdom = kingdom;
        this.capital = capital;
        this.battles = battles;
    }

    public void getData() {
        System.out.println("the king id is " + kingId);
        System.out.println("the name is " + name);
        System.out.println("the dynasty is " + dynasty);
        System.out.println("the kingdom is " + kingdom);
        System.out.println("the capital is " + capital);

      
        if (battles != null) {
            System.out.print("Battles are  ");
            for (String battle : battles) {
                System.out.println(battle );
            }
            
        }

        System.out.println();
    }
}
