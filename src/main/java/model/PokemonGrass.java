package model;

public class PokemonGrass extends Pokemon {


    public PokemonGrass(int AP, int DP, int maxHP) {
        super(AP, DP, maxHP);
        super.type = PokemonType.GRASS;
        super.strongAgainst = PokemonType.FIRE;
        super.weakAgainst = PokemonType.WATER;

    }
}
