import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        String input = reader.readLine();
        StringBuffer buffer = new StringBuffer(input);
        System.out.println("Enter the index where you want to insert the string: ");
        int index = Integer.parseInt(reader.readLine());
        System.out.println("Enter the string to insert: ");
        String insert = reader.readLine();
        buffer.insert(index, insert);
        System.out.println("The modified string is: " + buffer.toString());
    }
}
