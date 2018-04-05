import java.util.Scanner;

public class P03ReverseCharacters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char character1 = console.nextLine().charAt(0);
        char character2 = console.nextLine().charAt(0);
        char character3 = console.nextLine().charAt(0);

        System.out.printf("%c%c%c", character3, character2, character1);
    }
}
