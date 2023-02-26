package com.fetcher.drivinglicence.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "login")
public class LoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
    private Timestamp updatedDate = new Timestamp(System.currentTimeMillis());
}
