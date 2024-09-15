package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    public String toString() {

        return "Course: " + this.topic + "\nInstructor: " + this.instructor + "\nStudents: " + enrolledStudents;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(topic, course.topic) && Objects.equals(instructor, course.instructor) && Objects.equals(enrolledStudents, course.enrolledStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor, enrolledStudents);
    }

    public static void main(String[] args) {
        Teacher Carolyn = new Teacher("Carolyn", "Smith", "Math", 10);

        Student Henry = new Student ("Henry");
        Student Zula = new Student ("Zula");
        Student Agnes = new Student ("Agnes");

        ArrayList<Student> students = new ArrayList<Student>(); {
            {
                students.add(Henry);
                students.add(Zula);
                students.add(Agnes);
            }
        };
        Course math = new Course("Math", Carolyn, students);
        System.out.println(math);
    }
}