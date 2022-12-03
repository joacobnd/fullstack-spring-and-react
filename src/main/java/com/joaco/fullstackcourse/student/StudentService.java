package com.joaco.fullstackcourse.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public void addStudent(Student student) {
        //TODO check if email is taken

        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        //TODO check if student exist
        studentRepository.deleteById(studentId);
    }
}
