import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class P07SumsByTown {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        HashMap<String, Double> townIncome = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] currentInput = Arrays.stream(reader.readLine().split("\\|")).map(w -> w.trim()).toArray(String[]::new);
            String currentTown = currentInput[0];
            Double currentIncome = Double.parseDouble(currentInput[1]);
//            townIncome.putIfAbsent(currentTown, 0.0);
//            townIncome.put(currentTown, townIncome.get(currentTown) + currentIncome);
            if (!townIncome.containsKey(currentTown)) {
                townIncome.put(currentTown, currentIncome);
            } else {
                townIncome.put(currentTown, townIncome.get(currentTown) + currentIncome);
            }
        }

        townIncome.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())).forEach(e -> {
            System.out.printf("%s -> %s%n", e.getKey(), e.getValue().toString());
        });
        //main ends here
    }
}
