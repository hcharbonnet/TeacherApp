package net.javaguides.springmvc.service;

import java.util.List;

import net.javaguides.springmvc.entity.Student;

public interface StudentService {

    public List<Student> getStudents();

    public void saveStudent(Student theStudent);

    public Student getStudent(int theId);

    public void deleteStudent(int theId);

}