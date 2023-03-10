import Composants.Wait;
import Composants.Wand;
import Composants.Wizard;
import lombok.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Wizard.Run();
        Wait.wait(2000);
        Wand.Run();
    }
}