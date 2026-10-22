public class course {
    private String courseName;
    private String courseCode;
    private String dept;
    private int lvl;
    private int duration;
    private int creditHours;
    private double fees;

    public course() {
        this("Unknown", "None", "Unknown", 2, 2, 4, 1.5);
    }

    public course(String courseName, String courseCode, String dept, int lvl,
                  int duration, int creditHours, double fees) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.dept = dept;
        this.lvl = lvl;
        this.duration = duration;
        this.creditHours = creditHours;
        this.fees = fees;
    }

    public String getCoursename() {
        return courseName;
    }

    public void setCoursename(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursecode() {
        return courseCode;
    }

    public void setCoursecode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getLevel() {
        return lvl;
    }

    public void setLevel(int lvl) {
        this.lvl = lvl;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getcreditHours() {
        return creditHours;
    }

    public void setcreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void displayCourseInfo() {
        System.out.println("Course name: " + courseName);
        System.out.println("Course code: " + courseCode);
        System.out.println("Department: " + dept);
        System.out.println("Level: " + lvl);
        System.out.println("Duration: " + duration);
        System.out.println("Credit hours: " + creditHours);
        System.out.println("Fees: " + fees);
    }

    public double calculateFeeperCredit() {
        if (creditHours == 0) {
            throw new IllegalStateException("Cannot calculate fee per credit with zero credit hours.");
        }
        return fees / creditHours;
    }
}
