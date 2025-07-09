class ScriptWriter {
    public static void writeScript(String title, String writerName, String genre) {
        System.out.println("Script written by " + writerName);
        System.out.println("Script genre is " + genre);
        Cast.selectCast(title, "Allu Arjun , Rashmika");
    }
}