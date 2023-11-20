package com.example.hajispringdemoboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Leaders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

}
