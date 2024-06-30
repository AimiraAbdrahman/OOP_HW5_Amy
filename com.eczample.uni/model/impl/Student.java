package model.impl;

import model.User;

public class Student extends User{

    int groupId;

    public Student(int id, String name, String lastName, int groupId) {
        super(id, name, lastName);
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public String getlastName() {
        return lastName;
    }

    public int getStudentId() {
        return id;
    }

    
    
}
