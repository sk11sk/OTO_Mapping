package com.mapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "student_tab")  // one to many  and many to one  relation
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   int sid;

    private  String sname ;


    @OneToOne(mappedBy = "student",cascade =CascadeType.ALL,orphanRemoval = true)
    private Book book;

    // one student has  one book



}