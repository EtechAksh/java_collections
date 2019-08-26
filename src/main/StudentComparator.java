package main;


import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student std1, Student std2) {
        if (std1.marks < std2.marks) {
            return 1;
        } else if (std1.marks > std2.marks) {
            return -1;
        } else return 0;

    }
}

