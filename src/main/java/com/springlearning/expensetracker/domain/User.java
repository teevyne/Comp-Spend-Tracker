package com.springlearning.expensetracker.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
