package Studentapp.Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream<T extends StudentGroup> implements Iterable<T> {
    private List<T> studyGroups;

    public StudentStream() {
        studyGroups = new ArrayList<>();
    }

    public void addStudyGroup(T group) {
        studyGroups.add(group);
    }

    public List<T> getStudyGroups() {
        return studyGroups;
    }

    @Override
    public Iterator<T> iterator() {
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
