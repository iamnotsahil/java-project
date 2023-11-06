import java.io.*;

public class inputOutput1 {
  public static void main(String6[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter a character: ");
    char c = (char) br.read();

    System.out.println("You entered: " + c);
  }
}
