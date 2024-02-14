package com.mapping.run;

import com.mapping.entity.Book;
import com.mapping.entity.Student;
import com.mapping.repository.BookRepository;
import com.mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

Student student = new Student();

student.setSname("shaurabh");


studentRepository.save(student);// save parent object





Book book = new Book();

book.setBnamae("APJ Biography");



book.setStudent(student);  // child object .save (parent object)



bookRepository.save(book); // save child object




 // second student akash

        Student student1 = new Student();
        student1.setSname("akash");
        studentRepository.save(student1);


        Book book1 = new Book();

        book1.setBnamae("wings of fire");



        book1.setStudent(student1);

        bookRepository.save(book1);


        // third student akash

        Student student2 = new Student();
        student2.setSname("abhilash");
        studentRepository.save(student2);


        Book book2 = new Book();

        book2.setBnamae("5 am club");



        book2.setStudent(student2);

        bookRepository.save(book2);








    }
}
