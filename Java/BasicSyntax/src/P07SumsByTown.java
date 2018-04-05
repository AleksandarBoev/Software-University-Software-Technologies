import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P07SumsByTown {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        HashMap<String, Double> townIncome = new HashMap<>();
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = console.nextLine().split("\\|");
            String currentTown = input[0].trim();
            double currentIncome = Double.parseDouble(input[1].trim());

            if (!townIncome.containsKey(currentTown)) {
                townIncome.put(currentTown, currentIncome);
            } else {
                townIncome.put(currentTown, townIncome.get(currentTown) + currentIncome);
            }
        }



        //main ends here
    }
}
