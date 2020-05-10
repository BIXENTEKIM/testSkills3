package com.testSkills2.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table (name="customers")
public class Customers {

    @Id
    @Column (name="CustomerId")
    @GeneratedValue  (strategy = GenerationType.AUTO )
    private Long CustomerId;

    @Column (name="FirstName" )
    private String FirstName ;

    @Column (name="OtherNames")
    private String OtherNames ;

    @Column (name="Gender")
    private String Gender ;

    @Column (name="Age")
    private Long Age;

    @Column (name="DOB"  ) @NotNull
    private Date DOB;

    @Column (name="CreatedOn")
    private Timestamp CreatedOn;


    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long customerId) {
        CustomerId = customerId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getOtherNames() {
        return OtherNames;
    }

    public void setOtherNames(String otherNames) {
        OtherNames = otherNames;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Long getAge() {
        return Age;
    }

    public void setAge(Long age) {
        Age = age;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Timestamp getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        CreatedOn = createdOn;
    }
}
