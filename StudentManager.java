import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("\nStudent added successfully!");
        student.displayInfo();
    }

    // Display student information
    public void displayStudent(Student student) {
        System.out.println("\nSTUDENT INFORMATION");
        student.displayInfo();
    }

    // Update student name
    public void updateStudentName(Student student, String name) {
        student.setName(name);
        System.out.println("Student name updated successfully!");
    }

    // Update student ID
    public void updateStudentID(Student student, String id) {
        student.setStudentId(id);
        System.out.println("Student ID updated successfully!");
    }

    // Display total students
    public void displayTotalStudents() {
        System.out.println("Total Students: " + getStudentCount());
    }

    // Count now comes from the list itself
    public int getStudentCount() {
        return students.size();
    }
}