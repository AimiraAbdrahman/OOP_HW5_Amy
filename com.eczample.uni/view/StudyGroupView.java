package view;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.DB.DataBase;
import model.impl.Student;
import model.impl.StudyGroup;
import model.impl.Teacher;
import service.StudentService;
import controller.StudentController;
import view.StudentView;

public class StudyGroupView {
    
private controller.StudyGroupController StudyGroupController = new controller.StudyGroupController();

    public void start(){
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать учебную группу");
            System.out.println("2 - найти студентов по id учебной группы");
            System.out.println("3 - найти учителя по id учебной группы");
            System.out.println("4 - выход");
            
            switch (scanner.nextInt()) {
                case 1 -> createStudyGroup();
                case 2 -> getStudents();
                case 3 -> getTeacher();
                case 4 -> System.exit(0);// выход из приложения
            
                default -> System.out.println("Операция не поддерживается");
            }
        }

    }

    public StudyGroup createStudyGroup() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя учителя:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию учителя:");
        String lastName = scanner.nextLine();
        System.out.println("Введите id учителя:");
        int id = scanner.nextInt();
        Teacher teacher = new Teacher(id, name, lastName);
        Student s5 = StudentView.createStudent();
        Student s6 = StudentView.createStudent();
        List<Student> students = new ArrayList<Student>();
        students.add(s5);
        students.add(s6);
        System.out.println("Введите номер группы:");
        int groupId = scanner.nextInt();
        StudyGroup StudyGroup = StudyGroupController.createStudyGroup(students, teacher, groupId);
        System.out.println(StudyGroup);
        return StudyGroup;
    }

    public void getStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id группы: ");
        int id = scanner.nextInt();
        try {
            StudyGroupController.getStudents(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
}
    public void getTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id группы: ");
        int id = scanner.nextInt();
        StudyGroupController.getTeacher(id);
    }

}
