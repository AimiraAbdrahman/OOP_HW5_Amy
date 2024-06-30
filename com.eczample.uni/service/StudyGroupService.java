package service;

import java.util.List;
import java.util.stream.Collectors;

import model.DB.DataBase;
import model.impl.Student;
import model.impl.StudyGroup;
import model.impl.Teacher;

public class StudyGroupService {
    protected StudyGroup StudyGroup;
    protected int groupId;
    protected List<Student> students;

    public void addTeacher(Teacher teacher) {
        StudyGroup.add(teacher);
    }

    public StudyGroup createStudyGroup(List<Student> students, Teacher teacher, int groupId) {

        StudyGroup = new StudyGroup(students, teacher, groupId);
        DataBase.StudyGroupDB.add(StudyGroup);
        StudyGroup.add(students);
        StudyGroup.add(teacher);
        return StudyGroup;
    }

    public void getStudents(int groupId) throws Exception {
        StudyGroup StudyGroup = DataBase.StudyGroupDB
               .stream()
               .filter(sg -> sg.getStudyGroupId() == groupId)
               .findFirst()
               .orElse(null);
        System.out.println("Студенты группы " + groupId + ":");
        List<Student> students = StudyGroup.getStudent_List(groupId);
        for (Student student : students) { {
            System.out.println(student.getName() + " " + student.getlastName() + " " + student.getStudentId());
        }
        if (StudyGroup == null) {
            throw new Exception("Группа не найдена");
        }
    }
}

    public void getTeacher(int groupId) {
        StudyGroup StudyGroup = DataBase.StudyGroupDB
               .stream()
               .filter(sg -> sg.getStudyGroupId() == groupId)
               .findFirst()
               .orElse(null);
        System.out.println("Преподаватель группы " + groupId + ":");
        Teacher teacher = StudyGroup.getGroupTeacher(groupId);
        if (teacher!= null) {
            System.out.println(teacher.getName() + " " + teacher.getlastName() + " " + teacher.getTeacherId());
        } else {
            System.out.println("Преподаватель группы не найден");
        }
    }
    }


