package com.getchristianajob.applicationmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Applicant implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String currentJob;
    private String appliedPosition;
    private String university;
    private String major;
    private String phone;
    private String imageUrl;

    public Applicant() {
    }

    public Applicant(Long id, String name, String email, String currentJob, String appliedPosition, String university, String major, String phone, String imageUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.currentJob = currentJob;
        this.appliedPosition = appliedPosition;
        this.university = university;
        this.major = major;
        this.phone = phone;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }

    public String getAppliedPosition() {
        return appliedPosition;
    }

    public void setAppliedPosition(String appliedPosition) {
        this.appliedPosition = appliedPosition;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public java.lang.String toString() {
        return "Applicant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", currentJob='" + currentJob + '\'' +
                ", appliedPosition='" + appliedPosition + '\'' +
                ", university='" + university + '\'' +
                ", major='" + major + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
