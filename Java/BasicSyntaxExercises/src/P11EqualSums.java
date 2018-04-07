import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11EqualSums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            if (areEqualSums(numbers, i)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("no");

        //main ends here
    }

    static int sumBefore(int[] numbers, int index) {
        if (index == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = index - 1; i >= 0; i--) {
            sum += numbers[i];
        }
        return sum;
    }

    static int sumAfter(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return 0;
        }

        int sum = 0;
        for (int i = index + 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static boolean areEqualSums(int[] numbers, int index) {
        if (sumBefore(numbers, index) == sumAfter(numbers, index)) {
            return true;
        } else {
            return false;
        }
    }

}
