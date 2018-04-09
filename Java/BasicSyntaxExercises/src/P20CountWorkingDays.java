

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class P20CountWorkingDays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        ArrayList<String> holidays = new ArrayList<>();
        holidays.add("01-01");
        holidays.add("03-03");
        holidays.add("01-05");
        holidays.add("06-05");
        holidays.add("24-05");
        holidays.add("06-09");
        holidays.add("22-09");
        holidays.add("01-11");
        holidays.add("24-12");
        holidays.add("25-12");
        holidays.add("26-12");

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate = LocalDate.parse(console.nextLine(), format);
        LocalDate endDate = LocalDate.parse(console.nextLine(), format);

        int workingDays = 0;
        for (LocalDate currentDay = startDate; currentDay.compareTo(endDate) != 1; currentDay = currentDay.plusDays(1)) {
            if (currentDay.getDayOfWeek() == DayOfWeek.SATURDAY || currentDay.getDayOfWeek() == DayOfWeek.SUNDAY) {
                continue;
            }

            String currentDayString = String.format("%02d-%02d", currentDay.getDayOfMonth(), currentDay.getMonthValue());
            if (holidays.contains(currentDayString)) {
                continue;
            }

            workingDays++;
        }

        System.out.println(workingDays);

        //main ends here
    }
}
