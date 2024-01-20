package com.pomorowl.pomodorowlbe.entities;


import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

}
