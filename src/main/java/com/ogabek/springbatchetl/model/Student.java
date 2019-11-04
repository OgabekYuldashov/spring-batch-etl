package com.ogabek.springbatchetl.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    private Integer id;
    private String first;
    private String last;
    private Double gpa;
    private LocalDate dob;

    @Transient
    private Integer age;


    public Student(Integer id, String first, String last, Double gpa, Integer age) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.gpa = gpa;
        this.age = age;
    }

    public Student(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", gpa=" + gpa +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
