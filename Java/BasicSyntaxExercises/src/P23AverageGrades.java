import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P23AverageGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            String[] tokens = Arrays.stream(scanner.nextLine().split(" ")).toArray(String[]::new);
            String name = tokens[0];

            ArrayList<Double> currentStudentGrades = new ArrayList<>();
            for (int grade = 1; grade < tokens.length; grade++) {
                currentStudentGrades.add(Double.parseDouble(tokens[grade]));
            }

            Student currentStudent = new Student(name, currentStudentGrades);
            students[i] = currentStudent;
        }

//        Arrays.stream(students).filter(s -> s.getAverageGrade() >= 5.50).sorted(n -> n.getName())
        //main ends here
    }
}

class Student {
    private String name;
    public ArrayList<Double> grades; //don't know how to make a proper set method for an array
    private double averageGrade;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageGrade() {
        double sum = 0.0;
        for (Double currentGrade : this.grades) {
            sum += currentGrade;
        }

        return sum / this.grades.size();
    }

    public Student(String name, ArrayList<Double> grades) {
        this.name = name;
        this.grades = grades;
    }
}
