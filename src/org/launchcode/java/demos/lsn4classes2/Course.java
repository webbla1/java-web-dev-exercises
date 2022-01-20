package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    //constructors
    public Course(String topic){
        this.topic = topic;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    @Override
    public String toString() {
        return "*****\nTitle: " + this.topic + "\nInstructor: " + this.instructor;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course == false) return false;
        Course myCourseObj = (Course) obj;
        if (myCourseObj.topic.equals(this.topic)) return true;
        else return false;

    }
}
