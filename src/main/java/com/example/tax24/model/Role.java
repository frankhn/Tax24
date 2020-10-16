package com.example.tax24.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User userid;

    public Role() {}

    public Role(String name, User userid) {
        this.name = name;
        this.userid = userid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return userid;
    }

    public void setUser(User userid) {
        this.userid = userid;
    }
}
