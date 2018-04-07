import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14FitStringInTwentyChars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder(reader.readLine());
        int length = input.length();
        if (length < 20) {
            for (int i = 0; i < 20 - length; i++) {
                input.append('*');
            }
        } else {
            input = new StringBuilder(input.substring(0, 20));
        }

        System.out.println(input);

        //main ends here
    }
}
