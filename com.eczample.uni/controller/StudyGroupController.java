package controller;

import java.util.List;

import model.DB.DataBase;
import model.impl.Student;
import model.impl.StudyGroup;
import model.impl.Teacher;
import service.StudentService;
import service.StudyGroupService;

public class StudyGroupController {
    
    private StudyGroupService GroupService = new StudyGroupService();

    public void addTeacher(Teacher teacher) {
        GroupService.addTeacher(teacher);
    }

    public StudyGroup createStudyGroup(List<Student> students, Teacher teacher, int groupId) {

        return GroupService.createStudyGroup(students, teacher, groupId);
    }

    public void getStudents(int groupId) throws Exception {
        try {
            GroupService.getStudents(groupId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
}
    public void getTeacher(int groupId) {
        try {
            GroupService.getTeacher(groupId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
