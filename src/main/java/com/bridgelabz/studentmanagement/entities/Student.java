package com.bridgelabz.studentmanagement.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    public String name;
    public String email;
    public String course;

    @Temporal(TemporalType.DATE)
    public Date date;

    public long phoneNumber;

    public Student() {
        // TODO Auto-generated constructor stub
    }

    public long getId() {
        return id;
    }

    public Student(String name, String email, String course, Date date, long phoneNumber) {
        super();
        this.name = name;
        this.email = email;
        this.course = course;
        this.date = date;
        this.phoneNumber = phoneNumber;
    }
}
