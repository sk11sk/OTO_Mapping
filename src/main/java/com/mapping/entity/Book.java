package com.mapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "book_tab")
public class Book { // parent entity

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int bid;
    private  String bnamae;

    @OneToOne
    @JoinColumn(name  = "student_id_dFK")
    private Student student;



}
