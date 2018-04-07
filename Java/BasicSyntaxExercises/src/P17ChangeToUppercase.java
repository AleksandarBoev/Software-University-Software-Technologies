import java.util.Arrays;
import java.util.Scanner;

public class P17ChangeToUppercase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
//Welcome to the <upcase>Software University</upcase>. Learn <upcase>computer programming</upcase> and start a <upcase>job</upcase> in a software company.

        String input = console.nextLine();

        while (input.contains("<upcase>")) {
            int wordsOpen = input.indexOf("<upcase>") + "<upcase>".length();
            int wordsClose = input.indexOf("</upcase>");

            String replaceWords = input.substring(wordsOpen, wordsClose);

            input = input.replace("<upcase>" + replaceWords + "</upcase>", replaceWords.toUpperCase());
        }

        System.out.println(input);

        //main ends here
    }
}
