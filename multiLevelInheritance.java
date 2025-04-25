public class MultilevelInheritance {

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

    static class CollegeStudent extends Student {
        String major;

        void showMajor() {
            System.out.println("Major: " + major);
        }
    }

    public static void main(String[] args) {
        CollegeStudent cs1 = new CollegeStudent();
        cs1.name = "Samuel";
        cs1.studentId = 2300569;
        cs1.major = "Computer Science";
        // System.out.println("Multilevel Inheritance:");
        cs1.introduce();
        cs1.showId();
        cs1.showMajor();
    }
}
