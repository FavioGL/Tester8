package com.breakbot.domain;

public class Employee {

    public Employee(Integer id, Integer age, String gender, String fName, String lName){
        this.setId(id);
        this.setAge(age);
        this.setGender(gender);
        this.setFirstName(fName);
        this.setLastName(lName);
    }

    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;

    //Please generate Getter and Setters

    @Override
    public String toString() {
        return this.getId().toString()+" - "+ this.getAge().toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}