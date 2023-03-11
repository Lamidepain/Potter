package Composants;
import lombok.*;

import javax.naming.Name;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Wizard {

    @Setter @Getter static Pet pet;
    @Setter @Getter static Wand wand;
    @Setter @Getter static House house;

    public static void Run(){
        Wizard.Begin();
        Wait.wait(2000);
    }
    private static void Begin(){
        Scanner obj = new Scanner(System.in);
        String name;
        System.out.println("Bienvenue à Poudelard jeune sorcier, je suis Dumbledore, votre directeur.");
        Wait.wait(2000);
        System.out.println("Pourrais-tu me donner ton nom ? ");
        name = obj.nextLine();
        System.out.println("Tu t'appelles " + name + "... C'est un nom intéressant... ");
        Wait.wait(2000);
        Pet Name = Pet.randomPet();
        System.out.println("Je vois que ton animal de compagnie est un " + Name + ".");
        Wait.wait(2000);
        System.out.println("Maintenant que j'ai ton nom, suis-moi, nous allons choisir ta baguette. ");
    }

    public static Wizard NewWizard(){
        Wizard wizard = new Wizard();
        wizard.setWand(wand);
        wizard.setPet(pet);
        wizard.setHouse(house);
        return wizard;
    }
}
