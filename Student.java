// Student.java - класс студента
import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades != null ? Arrays.copyOf(grades, grades.length) : new int[0];
    }

    public double getAverageGrade() {
        if (grades.length == 0) return 0.0;

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public boolean isExcellentStudent() {
        if (grades.length == 0) return false;

        for (int grade : grades) {
            if (grade != 5) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(grades) +
                " (средний: " + String.format("%.2f", getAverageGrade()) +
                ", отличник: " + (isExcellentStudent() ? "да" : "нет") + ")";
    }
}