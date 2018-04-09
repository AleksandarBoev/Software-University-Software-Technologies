import java.util.Random;
import java.util.Scanner;

public class P21AdvertisementMessage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] phrases = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can't live without this product."};

        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int n = Integer.parseInt(console.nextLine());
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %s %s - %s%n",
                    phrases[Math.abs(random.nextInt()) % phrases.length],
                    events[Math.abs(random.nextInt()) % events.length],
                    authors[Math.abs(random.nextInt()) % authors.length],
                    cities[Math.abs(random.nextInt()) % cities.length]);
        }

        //main ends here
    }
}