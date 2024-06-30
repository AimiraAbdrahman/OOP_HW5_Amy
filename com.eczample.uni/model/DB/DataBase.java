package model.DB;

import java.util.ArrayList;
import java.util.List;

import model.impl.Student;
import model.impl.StudyGroup;
import model.impl.Teacher;
//симулирует базу данных
public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();
    public static final List<StudyGroup> StudyGroupDB = new ArrayList<>();

    public static void fillDB(){
        Teacher teacher = new Teacher(1, "Вася", "Иванов");
        teacher.addGroupId(1);
        teachersDB.add(teacher);
        Student s1 = new Student(1, "Рикон", "Старк", 1);
        Student s2 = new Student(2, "Джофри", "Ланистер", 1);
        studentsDB.add(s1);
        studentsDB.add(s2);

        Student s3 = new Student(3, "Dua", "Lipa",2);
        Student s4 = new Student(4, "Britney", "Spears",2);
        studentsDB.add(s3);
        studentsDB.add(s4);

        StudyGroup studyGroup1 = new StudyGroup(List.of(s1, s2), teacher, 1);
        StudyGroup studyGroup2 = new StudyGroup(List.of(s3, s4), teacher, 2);
        StudyGroupDB.add(studyGroup1);
        StudyGroupDB.add(studyGroup2);
    }
}
