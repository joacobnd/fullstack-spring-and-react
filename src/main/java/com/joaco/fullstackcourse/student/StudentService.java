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
}
