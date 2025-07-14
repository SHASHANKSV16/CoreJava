class HackerRunner {
    public static void main(String[] hack) {

        String name = Hacker.getName();
        System.out.println("Hacker Name: " + name);

        int level = Hacker.getSkillLevel();
        System.out.println("Skill Level: " + level);

        boolean ethical = Hacker.isEthicalHacker();
        System.out.println("Is Ethical Hacker? " + ethical);

        String fame = Hacker.getKnownFor();
        System.out.println("Known For: " + fame);

        
    }
}
