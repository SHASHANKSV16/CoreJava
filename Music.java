class Music {
    public static void addMusic(String title, String musicDirector) {
        System.out.println("Music composed by: " + musicDirector);
        Release.releaseMovie(title , MovieMakerRunner.language);
    }
}
