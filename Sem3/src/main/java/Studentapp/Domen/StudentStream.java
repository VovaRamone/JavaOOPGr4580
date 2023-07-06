package Studentapp.Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studyGroups;

    public StudentStream() {
        studyGroups = new ArrayList<StudentGroup>();
    }

    public void addStudyGroup(StudentGroup group) {
        studyGroups.add(group);
    }

    public List<StudentGroup> getStudyGroups() {
        return studyGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studyGroups.iterator(); // Use the iterator of the studyGroups list
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Number of groups: ").append(studyGroups.size()).append("\n");
        sb.append("Full list of students from all streams and groups:\n");
        for (StudentGroup group : studyGroups) {
            sb.append("Group ID: ").append(group.getIdGroup()).append("\n");
            List<Student> students = group.getGroup();
            for (Student student : students) {
                sb.append(student).append(", Group ID: ").append(group.getIdGroup()).append("\n");
            }
        }
        return sb.toString();
    }
}
