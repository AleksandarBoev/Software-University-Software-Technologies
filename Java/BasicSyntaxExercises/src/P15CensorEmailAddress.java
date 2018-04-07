import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P15CensorEmailAddress {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //pesho.peshev@email.bg
//        My name is Pesho Peshev. I am from Sofia, my email is: pesho.peshev@email.bg (not pesho.peshev@email.com). Test: pesho.meshev@email.bg, pesho.peshev@email.bg

        String emailToBeCensored = reader.readLine();
        int censorUntil = emailToBeCensored.indexOf('@');
        String censoredEmail = newString(emailToBeCensored.substring(0, censorUntil).length(), '*')
                + emailToBeCensored.substring(censorUntil, emailToBeCensored.length());

        String text = reader.readLine();
        text = text.replaceAll(emailToBeCensored, censoredEmail);

        System.out.println(text);
        //main ends here
    }

    static String newString(int count, char character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}
