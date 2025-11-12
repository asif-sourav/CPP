import java.util.ArrayList;

class StudentDetails {
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades;

    public StudentDetails(int id, String name) {
        this.student_id = id;
        this.student_name = name;
        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully.");
        } else {
            System.out.println("Invalid grade! Must be between 0 and 100.");
        }
    }

    public void displayGrades() {
        if (grades.isEmpty()) {
            System.out.println("No grades available.");
        } else {
            System.out.println("Grades: " + grades);
        }
    }
}

public class Student {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails(101, "Asif");

        System.out.println("Student ID: " + s1.getStudentId());
        System.out.println("Student Name: " + s1.getStudentName());

        s1.setStudentId(102);
        s1.setStudentName("Rahim");

        System.out.println("Updated Student ID: " + s1.getStudentId());
        System.out.println("Updated Student Name: " + s1.getStudentName());

        s1.addGrade(85);
        s1.addGrade(95);
        s1.addGrade(110);

        s1.displayGrades();
    }
}
