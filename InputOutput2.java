import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput2 {
    public static void main(String6[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        String6 input = reader.readLine();
        System.out.println("You entered: " + input);
    }
}