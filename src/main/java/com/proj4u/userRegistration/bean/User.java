package com.proj4u.userRegistration.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "userdetails")
public class User {
    @Id
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;
}
