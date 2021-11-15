package com.iris.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Entity
@Table(name = "user")
public class User extends BaseEntity{
    public User() {
    }

    public User(String email, String password, int active, Set<Authorities> authorities, Code code) {
        this.email = email;
        this.password = password;
        this.active = active;
        this.authorities = authorities;
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public void setAuthorities(Set<Authorities> authorities) {
        this.authorities = authorities;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public int getActive() {
        return active;
    }

    public Set<Authorities> getAuthorities() {
        return authorities;
    }

    public Code getCode() {
        return code;
    }

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "active")
    private int active;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "authorities_id")}
    )
    private Set<Authorities> authorities = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "code_id")
    private Code code;

}