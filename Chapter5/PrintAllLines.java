import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintAllLines {
    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(Paths.get("test.txt"), StandardCharsets.ISO_8859_1.name())){
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
    }
}
