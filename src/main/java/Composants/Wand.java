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
        Wand.ChooseCore();
    }
    private static void Begin(){
        System.out.println("Bienvenue dans le magasin de baguette magique ! C'est ici que tu vas pouvoir choisir ta baguette qui va t'accompagner dans toutes tes aventures. ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Voici les différents coeurs de la baguette que tu peux choisir : ");
    }

    private static Core ChooseCore(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Choisis le coeur de ta baguette parmis ceux que nous avons : ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int count = 1;
        for (Core c: Core.values()){
            System.out.println(c);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int ChoiceCore = obj.nextInt();
        Core ChoosedCore;
        switch (ChoiceCore){
            case 1:
                ChoosedCore = Core.Dragon_Heartstring;
            break;
            case 2:
                ChoosedCore = Core.Pheonix_Feather;
            break;
            case 3:
                ChoosedCore = Core.Unicorn_Tail_Hair;
            break;
            case 4:
                ChoosedCore = Core.Veela_Hair;
            break;
            case 5:
                ChoosedCore = Core.Thestral_Tail_Hair;
            break;
            case 6:
                ChoosedCore = Core.Coral;
            break;
            case 7:
                ChoosedCore = Core.Flour;
            break;
            case 8:
                ChoosedCore = Core.Yeast;
            break;
            default:
                ChoosedCore = Core.Dragon_Heartstring;
            break;
        }
        System.out.println(ChoosedCore);
        return ChoosedCore;
    }
}
