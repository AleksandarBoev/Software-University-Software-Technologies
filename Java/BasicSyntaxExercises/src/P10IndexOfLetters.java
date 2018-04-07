import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10IndexOfLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String input = reader.readLine();

        for (int i = 0; i < input.length(); i++) {
            int index = alphabet.indexOf(input.charAt(i));
            System.out.printf("%c -> %d%n", input.charAt(i), index);
        }

        //main ends here
    }
}
