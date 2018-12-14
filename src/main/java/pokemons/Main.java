package pokemons;

public class Main {

    public static void main(String[] args) {


        Bulbasaur b1 = new Bulbasaur(40, 20, 100, "B1");
        Bulbasaur b2 = new Bulbasaur(40, 42, 42, "B2");
        b1.attack(b2);
        System.out.println(b1.getCurrentHP());
        System.out.println(b2.getCurrentHP());


    }
}
