package com.MiCarreraPerfectaBackend.Repository;

import com.MiCarreraPerfectaBackend.Entity.Management;
import com.MiCarreraPerfectaBackend.Entity.University;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author agustin coria 
 */
@Repository
public interface ManagementRepository extends JpaRepository<Management, Integer> {
    
    @Query("Select m FROM Management m")
    List<Management> findAllManagement();

    @Query ("SELECT m FROM Management m WHERE m.name_management LIKE CONCAT('%', :name, '%')")
    List<Management> findManagementByName(@Param("name") String name);
    
    @Query ("SELECT u FROM University u WHERE u.id_management = :management")
    List<University> findUniversityForManagement(@Param ("management") int management);
    
}