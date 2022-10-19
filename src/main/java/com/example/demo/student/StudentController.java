package com.example.demo.student;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/students")
public class StudentController {

  private final StudentService studentService;

  @GetMapping
  public List<Student> getAllStudents() {

    return studentService.getAllStudents();

    //    List<Student> students = Arrays.asList(
    //        new Student(
    //            1L,
    //            "Jamila",
    //            "jamila@amigoscode.edu",
    //            Gender.FEMALE),
    //        new Student(
    //            2L,
    //            "Alex",
    //            "alex@amigoscode.edu",
    //            Gender.MALE)
    //    );
    //    return students;
  }
}
