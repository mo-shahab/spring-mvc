package com.shahab.example;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class FistController {

    // this is the repository sort of, writing methods and all sorts of thing that
    // are performed against the
    // database, simply put in database actions.
    private final StudentRepository repository;

    public FistController(StudentRepository repository) {
        this.repository = repository;
    }

    // @GetMapping("/hello")
    // public String hello(Model model) {
    // // Add dynamic data to the model
    // model.addAttribute("name", "John");

    // // Return the name of the Thymeleaf template to be rendered
    // return "hello";
    // }

    @PostMapping("/students")
    public Student postMethodName(
            @RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @GetMapping("/students/{student-id}")
    public Student findStudentById(
            @PathVariable("student-id") Integer id) {
        return repository.findById(id)
                .orElse(new Student());
    }

    @GetMapping("/students/search/{student-name}")
    public List<Student> findStudentsByName(
            @PathVariable("student-name") String name) {
        return repository.findAllByFirstnameContaining(name);
    }

    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(
            @PathVariable("student-id") Integer id) {
        repository.deleteById(id);
    }
}
