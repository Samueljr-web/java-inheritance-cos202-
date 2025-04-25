class Person {
    String name;
    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String studentId;
    void showStudent() {
        System.out.println("Student ID: " + studentId);
    }
}

class CollegeStudent extends Student {
    String collegeName;
    void showCollege() {
        System.out.println("College: " + collegeName);
    }
}
