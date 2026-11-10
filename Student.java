
    // Getter methods
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getSemester() {
        return semester;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getAttendance() {
        return attendance;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    // Method to be overridden by derived classes
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Attendance: " + attendance + "%");
    }
