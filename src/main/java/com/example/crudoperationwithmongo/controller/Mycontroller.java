package com.example.crudoperationwithmongo.controller;
import com.example.crudoperationwithmongo.model.Student;
import com.example.crudoperationwithmongo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * The type Mycontroller.
 */
@RestController
@RequestMapping("/student")
public class Mycontroller {
    @Autowired
    private StudentRepository StudentRepository;

    /**
     * Add student response entity.
     *
     * @param student the student
     * @return the response entity
     */
    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        Student save = this.StudentRepository.save(student);
        return ResponseEntity.ok(save);
    }

    /**
     * Gets student.
     *
     * @return the student
     */
    @GetMapping("/get")
    public ResponseEntity<?> getStudent() {
    return ResponseEntity.ok(this.StudentRepository.findAll());
    }

    /**
     * Delete student string.
     *
     * @param id the id
     * @return the string
     */
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        StudentRepository.deleteById(id);
        return "book deleted with id : " + id;
    }

    /**
     * Update student response entity.
     *
     * @param id      the id
     * @param student the student
     * @return the response entity
     */
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody Student student) {
        StudentRepository.deleteById(id);
        Student save = this.StudentRepository.save(student);
        return ResponseEntity.ok(save);

    }
}
