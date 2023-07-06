package Studentapp.Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

//    @Override
//    public String toString() {
//        return "StudentGroup{" +
//                "group=" + group +
//                ", idGroup=" + idGroup +
//                '}';
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudentGroup {");
        sb.append("idGroup=").append(idGroup);
        sb.append(", numberOfStudents=").append(group.size());
        sb.append(", students=").append(group);
        sb.append("}");
        return sb.toString();
    }

//    @Override
//    public Iterator<Student> iterator() {
//        return new Iterator<Student>() {
//
//            private int counter;
//
//            @Override
//            public boolean hasNext() {
//
//                if(counter<group.size())
//                {
//                    return true;
//                }
//                else
//                {
//                    return false;
//                }
//            }
//
//            @Override
//            public Student next() {
//                return group.get(counter++);
//            }
//        };

    @Override
    public Iterator<Student> iterator() {
        return group.iterator();
    }

    @Override
    public int compareTo(StudentGroup otherGroup) {
        int sizeComparison = Integer.compare(group.size(), otherGroup.getGroup().size());
        if (sizeComparison == 0) {
            return Integer.compare(idGroup, otherGroup.getIdGroup());
        }
        return sizeComparison;
    }
}