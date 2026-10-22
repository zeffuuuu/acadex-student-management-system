public class Lecturer {
    private String Name;
    private int Lecturerid;
    private String Subject;
    private String Faculty;
    private int age;
    private double salary;
    private int experience;

    public Lecturer(String Name, int Lecturerid, String Subject, String Faculty, int age, double salary, int experience){
        this.Name = Name;
        this.Lecturerid = Lecturerid;
        this.Subject = Subject;
        this.Faculty = Faculty;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }
    public Lecturer(){
        this.Name = "Unknown";
        this.Lecturerid = 0;
        this.Subject = "Unknown";
        this.Faculty = "Unknown";
        this.age = 0;
        this.salary = 0.0;
        this.experience = 0;
    }
    public String getName() {
        return Name;
    }
    public int getLecturerid() {
        return Lecturerid;
    }
    public String getSubject() {
        return Subject;
    }
    public String getFaculty() {
        return Faculty;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public int getExperience() {
        return experience;
    }

    
    public void setName(String name) {
        Name = name;
    }
    public void setLecturerid(int lecturerid) {
        Lecturerid = lecturerid;
    }
    public void setSubject(String subject) {
        Subject = subject;
    }
    public void setFaculty(String faculty) {
        Faculty = faculty;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void display() {
        System.out.println("Name: " + Name);
        System.out.println("Lecturer ID: " + Lecturerid);
        System.out.println("Subject: " + Subject);
        System.out.println("Faculty: " + Faculty);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience);
    }

    public void checkexperience() {
        if (experience >= 5) {
            System.out.println("The lecturer is experienced.");
        } else {
            System.out.println("The lecturer is not experienced.");
        }
    }

}
