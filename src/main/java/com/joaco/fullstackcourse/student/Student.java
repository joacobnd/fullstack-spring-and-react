package com.joaco.fullstackcourse.student;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "student_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    @NotBlank
    @Column(nullable = false)
    private String name;
    @Email(regexp = "^(.+)@(.+)$")
    @Column(nullable = false, unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(nullable = false)
    private Gender gender;

    public Student(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
