package Tests;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car("blue", 5, "Lada");
        System.out.println(car1.toString());

        String number = String.format("%.2f", 4.5555);
        System.out.println(number);
    }
}
