import java.util.Arrays;
import java.util.Scanner;

public class P03ThreeIntegersSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

//        String input = console.nextLine();

        int[] numbers = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // or mapToInt(x -> Integer.parseInt(x))
                //Arrays.stream(scanner.nextLine().split(“ ”)).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        if (numbers[0] + numbers[1] == numbers[2]) {
            System.out.printf("%d + %d = %d", Math.min(numbers[0], numbers[1]), Math.max(numbers[0], numbers[1]), numbers[2]);
        } else  if (numbers[0] + numbers[2] == numbers[1]){
            System.out.printf("%d + %d = %d", Math.min(numbers[0], numbers[2]), Math.max(numbers[0], numbers[2]), numbers[1]);
        } else if (numbers[1] + numbers[2] == numbers[0]) {
            System.out.printf("%d + %d = %d", Math.min(numbers[1], numbers[2]), Math.max(numbers[1], numbers[2]), numbers[0]);
        } else {
            System.out.println("No");
        }

        //main ends here
    }
}
