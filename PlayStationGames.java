class PlayStationGames {
    public static void main(String psgames[]) {

        String games[] = { "God of War", "Spider-Man", "The Last of Us", "Uncharted 4",
		"Ghost of Tsushima", "Horizon Zero Dawn", "Gran Turismo 7", "Bloodborne",
		"Ratchet & Clank", "Demon's Souls" };

        System.out.println(games[0]);
        System.out.println(games[1]);
        System.out.println(games[2]);
        System.out.println(games[3]);
        System.out.println(games[4]);
        System.out.println(games[5]);
        System.out.println(games[6]);
        System.out.println(games[7]);
        System.out.println(games[8]);
        System.out.println(games[9]);

        for (String game : games) {
            System.out.println(game);
        }
    }
}
