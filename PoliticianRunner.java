class PoliticianRunner {
    public static void main(String[] politics) {

        Politician firstPolitician = new Politician(1, "Narendra Modi", 73, "Prime Minister", "Bharatiya Janata Party");
        firstPolitician.getData();

        Politician secondPolitician = new Politician("Rahul Gandhi", 54);
        secondPolitician.getData();

        Politician thirdPolitician = new Politician("Chief Minister", "All India Trinamool Congress");
        thirdPolitician.getData();

        Politician fourthPolitician = new Politician(4, "Arvind Kejriwal", 56, "Chief Minister", "Aam Aadmi Party");
        fourthPolitician.getData();
    }
}
