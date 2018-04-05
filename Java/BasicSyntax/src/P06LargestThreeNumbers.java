import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P06LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);

        int n = Math.min(numbers.length, 3);

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[numbers.length - i - 1]);
        }

        //main ends here
    }
}
