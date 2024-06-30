package model.impl;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    protected final List<Student> students = new ArrayList<Student>();
    Teacher teacher;
    protected int groupId;

    public StudyGroup(List<Student> students, Teacher teacher) {
        this.students.addAll(students);
        this.teacher = teacher;
    }

    public StudyGroup(List<Student> students, Teacher teacher, int groupId) {
        this(students, teacher);
        this.groupId = groupId;
    }

    public void add(List<Student> students) {
    }

    public void add(Teacher teacher) {
    }

    public void add(int groupId) {
    }

    public int getStudyGroupId() {
        return groupId;
    }

    public List<Student> getStudent_List(int groupId) {
        return students;
    }

    public Teacher getGroupTeacher(int groupId) {
        return teacher;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                ", groupId=" + groupId +
                '}';
    }
}
