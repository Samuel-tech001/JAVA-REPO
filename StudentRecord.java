import java.util.Scanner; //importing scanner

//class StudentRecord
class StudentRecord {
    int studentID;
    String name;
    String course;

    public StudentRecord(int studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

//class StudentApp
class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details");
        System.out.print("Student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Course: ");
        String course = scanner.nextLine();

        StudentRecord student = new StudentRecord(studentID, name, course);
        student.displayInfo();

        scanner.close();
    }
}