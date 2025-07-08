class MovieMakerRunner {
    static String movieTitle = "PUSHPA";
    static String language = "Kannada , Telugu , hindi ,tamil, malyalam";
static String genre = "Action Drama";
    public static void main(String[] movie) {
        System.out.println("Movie production started");
        Director.startMovie(movieTitle, genre);
        System.out.println("Movie production ended");
    }
}

