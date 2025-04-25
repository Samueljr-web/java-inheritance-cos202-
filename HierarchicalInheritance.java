public class HierarchicalInheritance {

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

    static class Teacher extends Person {
        String subject;

        void showSubject() {
            System.out.println("Teaches: " + subject);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Samuel";
        s1.studentId = 2300569;
        System.out.println("Hierarchical Inheritance (Student):");
        s1.introduce();
        s1.showId();

        Teacher t1 = new Teacher();
        t1.name = "Mr. Jide";
        t1.subject = "Cos202";
        System.out.println("\nHierarchical Inheritance (Lecturer):");
        t1.introduce();
        t1.showSubject();
    }
}
