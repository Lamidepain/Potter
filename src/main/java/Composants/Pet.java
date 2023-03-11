package Composants;
import java.util.Random;

public enum Pet {
    hibou("Hibou"),
    chat("Chat"),
    rat("Rat"),
    chien("Chien"),
    crapaud("Crapaud");
    private String name;
    Pet(String name) {
        this.name = name;
    }
    private static final Random PRNG = new Random();
    public static Pet randomPet() {
        Pet[] pets = values();
        return pets[PRNG.nextInt(pets.length)];
    }


}


