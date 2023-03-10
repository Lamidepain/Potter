package Composants;
import lombok.*;
import java.util.Scanner;
import java.io.*;
public class Wizard {

    @Setter @Getter static Pet pet;
    @Setter @Getter static Pet Pick;

    public static void Run(){
        Wizard.Begin();
        Wait.wait(2000);
        Wizard.Pet();
    }
    private static void Begin(){
        Scanner obj = new Scanner(System.in);
        String name;
        System.out.println("Bienvenue au classes préparatoires Jules Ferry, en classe SEGPA spécialisée sur la sorcelerie, je suis Dumbledore, votre directeur.");
        Wait.wait(2000);
        System.out.println("Quel est ton nom sorcier ? ");
        name = obj.nextLine();
        System.out.println("Tu t'appelles " + name + "... C'est intéressant comme prénom... ");
        Wait.wait(2000);
        System.out.println("Bien trève de perte de temps inutile, viens choisir ta braguette magique. ");
        Wait.wait(2000);
        System.out.println("Je voulais dire baguette bien sûr, je crois que je deviens sénile... ");
    }

    public static void Pet(){
        System.out.println("Je vois que ton animal de compagnie est " + Pick );
    }


}
