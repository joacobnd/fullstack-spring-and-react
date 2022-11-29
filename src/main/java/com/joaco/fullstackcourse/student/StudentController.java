package com.joaco.fullstackcourse.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return Arrays.asList(
                new Student(
                1L,
                "Apu",
                "apppuu@qweasd.com",
                Gender.MALE),
                new Student(
                        2L,
                        "Jamila",
                        "jamila@gmail.com",
                        Gender.FEMALE));
    }
}
