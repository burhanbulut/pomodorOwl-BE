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
//
//    private String name;
//    private String surname;

    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Todo> todo;


//    private boolean accountNonExpired;
//    private boolean isEnabled;
//    private boolean accountNonLocked;
//    private boolean credentialsNonExpired;

//    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
//    @Enumerated(EnumType.STRING)
//    @JoinTable(name = "authorities", joinColumns = @JoinColumn(name = "user_id"))
//    @Column(name = "role", nullable = false)
//    private Set<Role> authorities;

}
