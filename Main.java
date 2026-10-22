public class Main {
    public static void main(String[] args) {

        // 1. Create a Lecturer object
        Lecturer thing1 = new Lecturer("Sir Jamal", 01, "Java", "Computing", 20, 6500.0, 3);

        // 2. Show the details
        thing1.display();

        // 3. Change an attribute with a setter
        thing1.setExperience(8);

        // 4. Read an attribute with a getter
        System.out.println("New experience: " + thing1.getExperience());

        // 5. Selection: if-else
        if (thing1.getExperience() >= 5) {
            System.out.println("Experienced lecturer");
        } else {
            System.out.println("New lecturer");
        }

        // 6. Selection: switch
        switch (thing1.getFaculty()) {
            case "Computing":
                System.out.println("Faculty is Computing");
                break;
            case "Business":
                System.out.println("Faculty is Business");
                break;
            default:
                System.out.println("Other faculty");
        }

        // 7. Loop: for (prints 1 to 3)
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop: " + i);
        }

        // 8. Loop: while (prints 1 to 3)
        int count = 1;
        while (count <= 3) {
            System.out.println("While loop: " + count);
            count++;
        }
    }
}