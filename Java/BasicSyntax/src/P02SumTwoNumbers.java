import java.util.Scanner;

public class P02SumTwoNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double number1 = Double.parseDouble(console.nextLine());
        double number2 = Double.parseDouble(console.nextLine());
        System.out.printf("%.2f", number1 + number2);
    }
}
