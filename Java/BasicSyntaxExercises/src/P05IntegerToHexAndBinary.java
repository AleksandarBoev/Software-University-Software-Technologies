import java.util.Scanner;

public class P05IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Integer decimalNumber = Integer.parseInt(console.nextLine());
        System.out.println(Integer.toHexString(decimalNumber).toUpperCase());
        System.out.println(Integer.toBinaryString(decimalNumber));
    }
}
