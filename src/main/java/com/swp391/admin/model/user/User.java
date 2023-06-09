package com.swp391.admin.model.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Table(name = "_user")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String imageurl;
    private String role;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate registeredDate;
    private Boolean locked;


}
