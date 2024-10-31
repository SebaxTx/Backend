package com.MiCarreraPerfectaBackend.Repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.MiCarreraPerfectaBackend.Entity.Branch;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Cabrera
 */
@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

    @Query("SELECT b FROM Branch b")
    List<Branch> findAllBranches();
    
    @Query("SELECT b FROM Branch b WHERE b.name LIKE %:name%")
    List<Branch> findBranchByName(@Param ("name") String name);
    
    @Query("SELECT b FROM Branch b WHERE b.id_branch = :id_branch")
    Branch findBranchById(@Param ("id_branch") int id_branch);
    
}