import java.util.Arrays;
import java.util.Scanner;

public class P06CompareCharArrays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input1 = console.nextLine();
        input1 = input1.replace(" ", "");
        String input2 = console.nextLine();
        input2 = input2.replace(" ", "");

        for (int i = 0; i < Math.min(input1.length(), input2.length()); i++) {
            if (input1.charAt(i) < input2.charAt(i)) {
                System.out.println(input1);
                System.out.println(input2);
                return;
            } else if (input1.charAt(i) > input2.charAt(i)) {
                System.out.println(input2);
                System.out.println(input1);
                return;
            }
        }

        if (input1.length() < input2.length()) {
            System.out.println(input1);
            System.out.println(input2);
        } else {
            System.out.println(input2);
            System.out.println(input1);
        }
    }
}
