import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P09MostFrequentNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] numbers = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        LinkedHashMap<Integer, Integer> numberCount = new LinkedHashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!numberCount.containsKey(numbers[i])) {
                numberCount.put(numbers[i], 1);
            } else {
                numberCount.put(numbers[i], numberCount.get(numbers[i]) + 1);
            }
        }

        int biggestOccurence = 0;
        for (Map.Entry<Integer, Integer> currentElement : numberCount.entrySet()) {
            if (currentElement.getValue() > biggestOccurence) {
                biggestOccurence = currentElement.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> currentElement : numberCount.entrySet()) {
            if (currentElement.getValue() == biggestOccurence) {
                System.out.println(currentElement.getKey());
                break;
            }
        }

        //main ends here
    }
}

