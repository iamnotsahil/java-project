import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String5 {
    public static void main(String6[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        String6 input = reader.readLine();
        StringBuffer buffer = new StringBuffer(input);
        System.out.println("Enter another string to append: ");
        String6 append = reader.readLine();
        buffer.append(append);
        System.out.println("The appended string is: " + buffer.toString());
    }
}

