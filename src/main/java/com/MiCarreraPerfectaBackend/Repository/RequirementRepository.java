package com.MiCarreraPerfectaBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.MiCarreraPerfectaBackend.Entity.Requirement;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Fornasari
 */
@Repository
public interface RequirementRepository extends JpaRepository<Requirement, Integer> {
    
    @Query("SELECT r FROM Requirement r WHERE r.name LIKE %:name%")
    List<Requirement> findRequirementByName(@Param ("name") String name);
    
}