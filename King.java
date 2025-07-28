class King {
    int kingId;
    String name;
    String dynasty;
    String kingdom;
    String capital;
	
	King(int kingId, String name, String dynasty, String kingdom, String capital) {
        System.out.println("Parameterized constructor");
        this.kingId = kingId;
        this.name = name;
        this.dynasty = dynasty;
        this.kingdom = kingdom;
        this.capital = capital;
    }

   
    public void getData() {
        System.out.println("the king id is " + kingId);
        System.out.println("the name is " + name);
        System.out.println("the dynasty is " + dynasty);
        System.out.println("the kingdom is " + kingdom);
        System.out.println("the capital is " + capital);
        System.out.println();
    }
	
}
