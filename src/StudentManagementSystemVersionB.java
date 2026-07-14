import java.util.Scanner;

public class StudentManagementSystemVersionB {

    static Scanner input = new Scanner(System.in);

    static Student[] students = new Student[100];
    static int studentCount = 0;

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Program Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

    }

    public static void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        students[studentCount] = new Student(id, name, age, course);
        studentCount++;

        System.out.println("Student Added Successfully.");

    }

    public static void viewStudents() {

        if (studentCount == 0) {

            System.out.println("No Student Records Found.");
            return;

        }

        for (int i = 0; i < studentCount; i++) {

            students[i].displayStudent();

        }

    }

    public static void searchStudent() {

        System.out.print("Enter Student ID to Search: ");
        int id = input.nextInt();

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {

            if (students[i].studentId == id) {

                students[i].displayStudent();
                found = true;
                break;

            }

        }

        if (!found) {

            System.out.println("Student Not Found.");

        }

    }

    public static void updateStudent() {

        System.out.print("Enter Student ID to Update: ");
        int id = input.nextInt();
        input.nextLine();

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {

            if (students[i].studentId == id) {

                System.out.print("Enter New Name: ");
                students[i].studentName = input.nextLine();

                System.out.print("Enter New Age: ");
                students[i].age = input.nextInt();
                input.nextLine();

                System.out.print("Enter New Course: ");
                students[i].course = input.nextLine();

                System.out.println("Student Updated Successfully.");

                found = true;
                break;

            }

        }

        if (!found) {

            System.out.println("Student Not Found.");

        }

    }

    public static void deleteStudent() {

        System.out.print("Enter Student ID to Delete: ");
        int id = input.nextInt();

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {

            if (students[i].studentId == id) {

                for (int j = i; j < studentCount - 1; j++) {

                    students[j] = students[j + 1];

                }

                students[studentCount - 1] = null;
                studentCount--;

                System.out.println("Student Deleted Successfully.");

                found = true;
                break;

            }

        }

        if (!found) {

            System.out.println("Student Not Found.");

        }

    }

}