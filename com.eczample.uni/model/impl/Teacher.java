package model.impl;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class Teacher extends User{

    private final List<Integer> groups = new ArrayList<>();
    
    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
    }

    public void addGroupId(int groupId) {}

    public String getName() {
        return name;
    }

    public String getlastName() {
        return lastName;
    }

    public int getTeacherId() {
        return id;
    }
    
}
