import Composants.Wand;
import Composants.Wizard;
import lombok.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Wizard.name();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Wand.Run();
    }
}