package week3.sort;

import week3.model.Student;

import java.util.Comparator;

public class IdAndNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // id tăng dần, tên giảm dần

        int compareID = Integer.compare(o1.getId(), o2.getId());
        if (compareID != 0) {
            return compareID;
        }
        return o2.getName().compareTo(o1.getName());
    }
}
