class Director {
    public static void startMovie(String title, String genre) {
        System.out.println("Director started the movie: " + title);
        System.out.println("the Genre is  " + genre);
        ScriptWriter.writeScript(title, "Sukumar", genre);
    }
}