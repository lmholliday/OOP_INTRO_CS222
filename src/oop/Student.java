package oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    private int id;
    private String name;
    private HashMap<Integer, Double> grades;
    private List<Course> enrolledCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new HashMap<>();
        this.enrolledCourses = new ArrayList<>();
    }

    public void displayCourses(){
        int counter = 1;
        System.out.println("Student: " + name);
        for (Course course : enrolledCourses){
            System.out.println("Course #" + counter);
            System.out.println("Name: " + course.getName());
            System.out.println("Description: " + course.getDescription());
            System.out.println("Credit #: " + course.getCredit());
            System.out.println("");
            counter++;
        }
    }

    public double calculateGPA() {
        int creditAmt = 0;
        double sum = 0;
        for (Course course : enrolledCourses) {
            int credits = course.getCredit();
            creditAmt += credits;
            if (grades.containsKey(course.getId())){
                sum += grades.get(course.getId()) * credits;
            }
        }
        return sum/creditAmt;
    }

    public void enrollCourse(Course course){
        enrolledCourses.add(course);
    }

    public boolean setGrade(Course course, double grade){
        if (enrolledCourses.contains(course)) {
            grades.put(course.getId(), grade);
            return true;
        }else{
            return false;
        }
    }

    public List<Course> getEnrolledCourses(){
        return enrolledCourses;
    }

}
