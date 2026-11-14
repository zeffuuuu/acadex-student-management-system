public class StudentManager {

    private int studentCount;

    // Constructor
    public StudentManager() {
    studentCount = 0;
    }

    // Add student
    public void addStudent(Student student) {
        studentCount++;
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
        System.out.println("Total Students: " + studentCount);
    }

    // Getter
    public int getStudentCount() {
        return studentCount;
    }
}