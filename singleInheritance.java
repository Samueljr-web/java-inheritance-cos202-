public class SingleInheritance {
    static class Person {
        String name;

        void introduce() {
            System.out.println("Hi, I'm " + name);
        }
    }

    static class Student extends Person {
        int studentId;

        void showId() {
            System.out.println("Student ID: " + studentId);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Samuel";
        s1.studentId = 1234;
        System.out.println("Single Inheritance:");
        s1.introduce();
        s1.showId();
    }
}
