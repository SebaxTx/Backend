package com.MiCarreraPerfectaBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MiCarreraPerfectaBackend.Entity.TypeCareer;

/**
 *
 * @author Fornasari
 */
@Repository
public interface TypeCareerRepository extends JpaRepository<TypeCareer, Integer> {
    
}