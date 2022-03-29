package com.example.crudoperationwithmongo.repo;
import com.example.crudoperationwithmongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * The interface Student repository.
 */

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
