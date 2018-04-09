import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P18Phonebook {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        HashMap<String, String> nameNumber = new HashMap<>();
        String input = console.nextLine();
        while (true) {
            if (input.equals("END")) {
                break;
            }

            String[] tokens = Arrays.stream(input.split(" ")).toArray(String[]::new);
            char command = tokens[0].charAt(0);
            String name = tokens[1];
            if (command == 'A') {
                String number = tokens[2];
                nameNumber.put(name, number);
            } else {
                if (!nameNumber.containsKey(name)) {
                    System.out.printf("Contact %s does not exist.%n", name);
                } else {
                    System.out.printf("%s -> %s%n", name, nameNumber.get(name));
                }
            }

            input = console.nextLine();
        }

        //main ends here
    }
}
