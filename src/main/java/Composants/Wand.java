package Composants;
import lombok.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Wand {
    @Setter @Getter static Core core;
    @Setter @Getter static int size;

    public static void Run(){
        Wand.Begin();
        Wait.wait(2000);
        Wand.ChooseCore();
        Wait.wait(2000);
        Wand.ChooseSize();
    }
    private static void Begin(){
        System.out.println("Bienvenue dans le magasin de baguette magique ! C'est ici que tu vas pouvoir choisir ta baguette qui va t'accompagner dans toutes tes aventures. ");
        Wait.wait(2000);
        System.out.println("Voici les coeurs de baguettes disponibles : ");
    }

    private static Core ChooseCore(){
        Scanner obj = new Scanner(System.in);
        for (Core c: Core.values()){
            System.out.println(c);
            Wait.wait(1000);
        }
        System.out.println("Désormais je te laisse choisir : ");
        String ChoiceCore = obj.nextLine();
        Core ChoosedCore;
        switch (ChoiceCore){
            case "Coeur de Dragon":
                ChoosedCore = Core.Coeur_de_Dragon;
            break;
            case "Plume de Phoénix":
                ChoosedCore = Core.Plume_de_Phoénix;
            break;
            case "Poil de queue de Licorne":
                ChoosedCore = Core.Poil_de_queue_de_Licorne;
            break;
            case "Cheuveux de Veela":
                ChoosedCore = Core.Cheuveux_de_Veela;
            break;
            case "Poil de queue de Thestral":
                ChoosedCore = Core.Poil_de_queue_de_Thestral;
            break;
            case "Farine":
                ChoosedCore = Core.Farine;
            break;
            default:
                ChoosedCore = Core.Coeur_de_Dragon;
            break;
        }
        System.out.println("Très bien tu as donc pris " + ChoosedCore + ", ce n'est pas très original...");
        return ChoosedCore;
    }

    private static int ChooseSize(){
        Scanner obj = new Scanner(System.in);
        int ChoosedSize;
        System.out.println("Bien, maintenant il ne reste plus qu'à choisir la taille de ta baguette. ");
        Wait.wait(2000);
        do {
            System.out.println("Choisis une taille comprise entre 20 et 35 centimètres : ");
            ChoosedSize = obj.nextInt();
        } while (20 > ChoosedSize & ChoosedSize > 35);
        System.out.println("Très bien, elle fera donc " + ChoosedSize + " centimètres.");
        return ChoosedSize;
    }
}
