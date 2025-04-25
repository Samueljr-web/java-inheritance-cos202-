public class MultipleInheritance {

  interface Level {
    void level();  
}

interface School {
    void school(); 
}

static class Student implements Level, School {
    String name;

    Student(String name) {
        this.name = name;
    }

    public void school() {
        System.out.println(name + " schools at LMU.");
    }

    public void level() {
        System.out.println(name + " is in 200 level.");
    }
}
  public static void main(String[] args) {
        Student a1 = new Student("samuel");
    
        a1.school();
        a1.level();
    }
}
