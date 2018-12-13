import pokemons.Bulbasaur;

public class Main {

    public static void main(String[] args) {


        Bulbasaur b1 = new Bulbasaur(40, 20, 100, "B1");
        Bulbasaur b2 = new Bulbasaur(40, 1, 10, "B2");

        b1.attack(b2);

    }
}
