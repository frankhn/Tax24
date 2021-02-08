package com.example.tax24.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    public long latitude;

    @NotNull
    @NotEmpty
    public long longitude;

    @Column(name = "location")
    public String location;

    @OneToOne(mappedBy = "userid", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    public User user;

    public Address(@NotNull long latitude, @NotNull @NotEmpty long longitude, String location) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
