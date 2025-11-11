class Course {
    String code = "";
    String name = "";

    public Course(String code ,String name) {

    }
    public String getCode() {

    }
    public String getName() {

    }
}

class OnlineCourse extends Course {
    public OnlineCourse(String code, String name) {

    }
    toString() {

    }
}

class OfflineCourse extends Course {
    public OfflineCourse(String code, String name) {

    }
    toString() {

    }
}

public class Homework6 {
    OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
    OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
    System.out.println(course1);
    System.out.println(course2);
}