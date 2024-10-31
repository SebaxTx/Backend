package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.Student;
import com.MiCarreraPerfectaBackend.Repository.StudentRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tello
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Operation(summary = "Agregar un nuevo estudiante")
    public Student addStudent(Student student) {
        // Convertir el DTO a una entidad
        Student studentEntity = new Student();
        studentEntity.setName(student.getName());
        studentEntity.setEmail(student.getEmail());
        studentEntity.setAge(student.getAge());
        studentEntity.setDate(student.getDate());
        studentEntity.setLon(student.getLon());
        studentEntity.setLat(student.getLat());

        // Guardar la entidad en la base de datos
        studentEntity = studentRepository.save(studentEntity);

        // Convertir la entidad guardada de nuevo a DTO
        student.setId_students(studentEntity.getId_students());
        return student;
    }

    @Operation(summary = "Obtener todos los estudiantes")
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        List<Student> studentEntities = studentRepository.findAll();
        for (Student entity : studentEntities) {
            Student student = new Student();
            student.setId_students(entity.getId_students());
            student.setName(entity.getName());
            student.setEmail(entity.getEmail());
            student.setAge(entity.getAge());
            student.setDate(entity.getDate());
            student.setLon(entity.getLon());
            student.setLat(entity.getLat());
            students.add(student);
        }
        return students;
    }
    
}