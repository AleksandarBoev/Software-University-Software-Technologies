import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] numbers = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int bestStartIndex = 0;
        int currentStartIndex = 0;
        int biggestSequence = 1;
        int currentSequence = 1;
        int currentNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == currentNumber) {
                currentSequence++;
            } else {
                if (currentSequence > biggestSequence) {
                    bestStartIndex = currentStartIndex;
                    biggestSequence = currentSequence;
                }
                currentStartIndex = i;
                currentSequence = 1;
                currentNumber = numbers[i];
            }
        }

        if (currentSequence > biggestSequence) {
            bestStartIndex = currentStartIndex;
            biggestSequence = currentSequence;
        }

        for (int i = bestStartIndex; i < bestStartIndex + biggestSequence; i++) {
            System.out.print(numbers[i] + " ");
        }

        //main ends here
    }
}
