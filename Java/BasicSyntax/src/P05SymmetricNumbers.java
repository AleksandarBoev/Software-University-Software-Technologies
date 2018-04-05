import java.util.Scanner;

public class P05SymmetricNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= n; i++) {
            if (isSymmetric(i)) {
                System.out.print(i + " ");
            }
        }

        //main ends here
    }

    static boolean isSymmetric(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
