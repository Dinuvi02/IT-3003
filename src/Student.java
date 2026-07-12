public class Student {

    int studentId;
    String studentName;
    int age;
    String course;

    public Student(int studentId, String studentName, int age, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.course = course;
    }

    public void displayStudent() {

        System.out.println("----------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);
    }

}