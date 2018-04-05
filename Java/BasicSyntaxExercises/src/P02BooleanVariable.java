import java.util.Scanner;

public class P02BooleanVariable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean input = Boolean.parseBoolean(console.nextLine());

        if (input) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
