import java.util.Scanner;

public class P04VowelOrDigit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String vowels = "aeiou";
        String digits = "0123456789";

        char inputChar = console.nextLine().charAt(0);

        if (vowels.contains("" + inputChar)) {
            System.out.println("vowel");
        } else if (digits.contains("" + inputChar)) {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }

        //main ends here
    }
}