package pratica13;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter escritorArquivo = new FileWriter("src/main/java/pratica13/arquivo.txt")) {
            escritorArquivo.write("Primeira gravação.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
