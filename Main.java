public class Main {
    public static void main(String[] args) {
 
        // ---- Lecturer ----
        Lecturer lecturer = new Lecturer("Sir Jamal", 1, "Java", "Computing", 20, 6500.0, 3);
        lecturer.display();
        lecturer.setExperience(8);
        System.out.println("New experience: " + lecturer.getExperience());
 
        // if-else
        if (lecturer.getExperience() >= 5) {
            System.out.println("Experienced lecturer");
        } else {
            System.out.println("New lecturer");
        }
 
        // switch
        switch (lecturer.getFaculty()) {
            case "Computing":
                System.out.println("Faculty is Computing");
                break;
            case "Business":
                System.out.println("Faculty is Business");
                break;
            default:
                System.out.println("Other faculty");
        }
 
        // ---- Students (inheritance + polymorphism) ----
        StudentManager manager = new StudentManager();
 
        Student degree = new DegreeStudent("bro", "D001", 20,
                "Computer Science", 3, 3.5, 95, "Bachelor of Comp Forensic");
        Student diploma = new DiplomaStudent("Zaeff", "P002", 19,
                "IT", 2, 3.1, 88, "Dihgree in Comp Science");
 
        manager.addStudent(degree);
        manager.addStudent(diploma);
        manager.updateStudentName(degree, "bro");
        manager.displayStudent(degree);
        manager.displayTotalStudents();
 
        // ---- Loops ----
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop: " + i);
        }
 
        int count = 1;
        while (count <= 3) {
            System.out.println("While loop: " + count);
            count++;
        }
 
        // ---- Course ----
        course c = new course("Computer Science", "CS101", "Computing", 1, 3, 4, 8000.0);
        c.displayCourseInfo();
 
        // ---- Grade ----
        Grade grade = new Grade(75);
        grade.displayGrade();
    }
}