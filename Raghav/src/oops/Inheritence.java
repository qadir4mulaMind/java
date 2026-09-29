package oops;

class Pokemon{
    int power;
    String type;

    Pokemon(String type, int power){
        this.type = type;
        this.power = power;
    }
    Pokemon(){}

    void print(){
        System.out.println(this.power + " " + this.type);
    }
}

class LegendaryPokemon extends Pokemon{ // child class --> derived class
    String ability;
}

class StrongPokemon extends Pokemon{
    int speed;
}

class GodPokemon extends LegendaryPokemon{
    char tag;
}
public class Inheritence {
    public static void main(String[] args) {
        LegendaryPokemon mewto = new LegendaryPokemon();
        mewto.ability = "presure";

        Pokemon pikachu = new Pokemon();

        GodPokemon dilega = new GodPokemon();
    }
}