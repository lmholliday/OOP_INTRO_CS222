package oop;

public class Course {
    private int id;
    private int code;
    private String name;
    private String description;
    private int credit;

    public Course(int id, int code, String name, String description, int credit) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredit() {
        return credit;
    }

    public static void main(String[] args) {
        Course c1 = new Course(224, 54321,"Design and Analysis of Algorithms", "A course about Algorithms!", 3);
        Course c2 = new Course(230, 12345,"Computer Organization", "A course about computer organization and architecture!", 3);
        Student s1 = new Student(10451, "Holliday");
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s1.displayCourses();
    }
}

