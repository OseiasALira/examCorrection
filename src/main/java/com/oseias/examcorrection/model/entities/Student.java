package com.oseias.examcorrection.model.entities;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String parentName;

    public Student() {
    }

    public Student(Integer id, String firstName, String lastName, String parentName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.parentName = parentName;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getParentName() {
        return parentName;
    }
}
