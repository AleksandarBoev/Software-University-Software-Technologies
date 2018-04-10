import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class P25BookLibraryModification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        5
//        LOTR Tolkien GeorgeAllen 29.07.1954 0395082999 30.00
//        Hobbit Tolkien GeorgeAll 21.09.1937 0395082888 10.25
//        HP1 JKRowling Bloomsbury 26.06.1997 0395082777 15.50
//        HP7 JKRowling Bloomsbury 21.07.2007 0395082666 20.00
//        AC OBowden PenguinBooks 20.11.2009 0395082555 14.00
//        30.07.1954
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        Map<LocalDate, String> titleReleaseDate = new TreeMap<>();

        for (int i = 0; i < numberOfBooks; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String title = tokens[0];
            LocalDate releaseDate = LocalDate.parse(tokens[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            titleReleaseDate.put(releaseDate, title);
        }
        LocalDate baseDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Map<LocalDate, String> titleAfterRelease = new TreeMap<>();

        //kak se filtrirat datite i posle kak se sortirat


//        for (Map.Entry<LocalDate, String> currentDate: titleReleaseDate.entrySet()) {
//            if (currentDate.getKey().compareTo(baseDate) == 1) {
//                titleAfterRelease.put(currentDate.getKey(), currentDate.getValue());
//            }
//        }

        //kak se filtrirat i posle sortirat?

//        titleAfterRelease.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey).thenComparing(Map.Entry::getValue)).forEach(e -> {
//            System.out.printf("%s -> %s", e.getValue(), e.getKey());
//        });

        titleAfterRelease.entrySet().stream()
                .sorted((e1, e2) -> {
                int comparedDates = e1.getKey().compareTo(e2.getKey());
                if (comparedDates == 0) {
                    return e1.getValue().compareTo(e2.getValue());
                }

                return comparedDates;
                }).forEach(e -> {
            System.out.printf("%s -> %s", e.getValue(), e.getKey());
        });

        //main ends here
    }
}
