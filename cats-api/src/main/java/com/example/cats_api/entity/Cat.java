package com.example.cats_api.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;



import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Cat {
    @Id
    private String id;
    private String name;
    private LocalDate birthDay;
    private LocalDateTime createdAt;
}
