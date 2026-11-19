public class Grade {
    private double marks;

    public Grade(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayGrade() {
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}