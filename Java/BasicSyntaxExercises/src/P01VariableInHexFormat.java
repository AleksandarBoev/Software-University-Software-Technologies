import java.util.Scanner;

public class P01VariableInHexFormat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int result = Integer.parseInt(console.nextLine(), 16);
        System.out.println(result);
    }
}
