import Composants.*;
import lombok.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Wizard.Run();
        Wait.wait(2000);
        Wand.Run();
        Wait.wait(2000);
        SortingHat.ChooseHouse();
    }
}