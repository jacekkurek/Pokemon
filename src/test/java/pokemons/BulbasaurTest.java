package pokemons;

import exceptions.BadPotionExeption;
import exceptions.DeadPokemonExeption;
import org.junit.Test;


public class BulbasaurTest {

    @Test(expected = BadPotionExeption.class)
    public void testHeal() throws DeadPokemonExeption, BadPotionExeption {
        Bulbasaur b1 = new Bulbasaur(40, 20, 100, "B1");
        Bulbasaur b2 = new Bulbasaur(40, 30, 50, "B2");
        b1.attack(b2);
        b2.heal(-8);


    }
}