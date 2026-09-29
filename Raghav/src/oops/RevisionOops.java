package oops;

public class RevisionOops {
    private static class Pokemon{
        int hp;
        int speed;
        int attack;
        int defence;
        String type;
        String name;
    }
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu";
        p1.type = "Electric";
        p1.attack = 70;

        Pokemon p2 = new Pokemon();
        p2.name = "Watermellon";
        p2.type = "Shy";
        p2.attack = 67;

        Pokemon p3 = new Pokemon();
        p3.name = "Charizard";
        p3.type = "fire";
        p3.attack = 79;

        System.out.println(p1.type);

        final int x = 89; // can't change
    }
}