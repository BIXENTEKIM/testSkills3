package com.testSkills2.model;

import javax.persistence.*;

@Entity
@Table (name="User_Details")
public class UserDetails {
    @Id
    @Column(name="UserId")
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long UserId;

    @Column (name="Username" )
    private String user ;

    @Column (name="Password")
    private String password ;

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
