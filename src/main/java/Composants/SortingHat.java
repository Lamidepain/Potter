package Composants;

import java.util.ArrayList;
import java.util.Random;

public class SortingHat {
    public static void ChooseHouse() {
        System.out.println("Voici le Choipeau, c'est lui qui va décider de ta maison. ");
        Wait.wait(2000);
        ArrayList<String> houses = new ArrayList<>();
        houses.add("Gryffondor ");
        houses.add("Serdaigle ");
        houses.add("Poufsouffle ");
        houses.add("Serpentard ");
        Random rand = new Random();
        int ChoosedHouse = rand.nextInt(houses.size());
        String house = houses.get(ChoosedHouse);
        System.out.println("Mmmmh tu es quelqu'un d'intéressant... et ta maison est bien définie... c'est : " + house);
    }
}
