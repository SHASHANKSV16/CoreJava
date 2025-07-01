class IPLTeams {
    public static void main(String cricket[]) {

        String teamNames[] = { "Royal Challengers Bangalore","Chennai Super Kings", "Mumbai Indians", 
		"Kolkata Knight Riders", "Rajasthan Royals", "Sunrisers Hyderabad", 
		"Delhi Capitals", "Lucknow Super Giants", "Gujarat Titans","Punjab Kings" };

        System.out.println(teamNames[0]);
        System.out.println(teamNames[1]);
        System.out.println(teamNames[2]);
        System.out.println(teamNames[3]);
        System.out.println(teamNames[4]);
        System.out.println(teamNames[5]);
        System.out.println(teamNames[6]);
        System.out.println(teamNames[7]);
        System.out.println(teamNames[8]);
        System.out.println(teamNames[9]);

        for (String team : teamNames) {
            System.out.println(team);
        }
    }
}
