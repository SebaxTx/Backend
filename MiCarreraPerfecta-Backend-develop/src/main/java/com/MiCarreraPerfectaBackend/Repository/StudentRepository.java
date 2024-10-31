package com.MiCarreraPerfectaBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MiCarreraPerfectaBackend.Entity.Student;

/**
 * Repositorio para realizar operaciones CRUD sobre estudiantes.
 * @author Tello
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}