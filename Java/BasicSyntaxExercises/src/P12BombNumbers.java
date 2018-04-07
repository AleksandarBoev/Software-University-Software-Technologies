import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P12BombNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bombInfo = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bombValue = bombInfo[0];
        int radius = bombInfo[1];

        boolean[] survivors = new boolean[numbers.length];
        for (int i = 0; i < survivors.length; i++) {
            survivors[i] = true;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != bombValue || !survivors[i]) {
                continue;
            }
            survivors[i] = false;

            int leftDetonations = Math.min(i, radius);
            int rightDetonations = Math.min(numbers.length - 1 - i, radius);

            for (int left = 1; left <= leftDetonations; left++) {
                survivors[i - left] = false;
            }

            for (int right = 1; right <= rightDetonations; right++) {
                survivors[i + right] = false;
            }
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (survivors[i]) {
                sum += numbers[i];
            }
        }

        System.out.println(sum);

        //main ends here
    }
}
