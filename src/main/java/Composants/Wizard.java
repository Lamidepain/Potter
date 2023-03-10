package Composants;
import lombok.*;
import java.util.Scanner;
import java.io.*;
public class Wizard {
    public static void name(){
        Scanner obj = new Scanner(System.in);
        String name;

        System.out.println("Bienvenue au classes préparatoires Jules Ferry, en classe SEGPA spécialisée sur la sorcelerie, je suis Dumbledore, votre directeur.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Quel est ton nom sorcier ? ");
        name = obj.nextLine();
        System.out.println("Tu t'appelles " + name + "... C'est intéressant comme prénom... ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bien trève de perte de temps inutile, viens choisir ta braguette magique. ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Je voulais dire baguette bien sûr, je crois que je deviens sénile... ");
    }
}
