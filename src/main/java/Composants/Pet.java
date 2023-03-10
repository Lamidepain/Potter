package Composants;
import java.util.Random;

public enum Pet {
    Hibou("Hibou"),
    Chat("Chat"),
    Rat("Rat"),
    Chien("Chien"),
    Crapaud("Crapaud"),
    Fouine("Fouine");
    private String name;
    Pet(String name) {
        this.name = name;
    }
    private Pet randomPet() {
        int Pick = new Random().nextInt(Pet.values().length);
        return Pet.values()[Pick];
    }
}
