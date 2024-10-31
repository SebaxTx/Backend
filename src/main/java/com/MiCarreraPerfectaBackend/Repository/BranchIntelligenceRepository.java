package com.MiCarreraPerfectaBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MiCarreraPerfectaBackend.Entity.BranchIntelligence;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 
 * @author Martorana
 */
@Repository
public interface BranchIntelligenceRepository extends JpaRepository<BranchIntelligence, Integer> {

    /**
     * Consulta para obtener todos los IDs de Branch.
     *
     * @return una lista de todos los IDs de Branch.
     */
    @Query("SELECT b.idBranch FROM BranchIntelligence b")
    List<Integer> findAllIdBranch();

    /**
     * Consulta para obtener entidades Branch_Intelligence por prioridad.
     *
     * @param priority la prioridad.
     * @return una lista de entidades Branch_Intelligence con la prioridad
     * especificada.
     */
    List<BranchIntelligence> findByPriority(Integer priority);

    /**
     * Consulta para obtener entidades Branch_Intelligence por ID de Branch.
     *
     * @param idBranch el ID de Branch.
     * @return una lista de entidades Branch_Intelligence con el ID de Branch
     * especificado.
     */
    List<BranchIntelligence> findByIdBranch(Integer idBranch);

    /**
     * Consulta para obtener ID de Branch junto con su prioridad.
     *
     * @return una lista de objetos con ID de Branch y prioridad.
     */
    @Query("SELECT b.idBranch, b.priority FROM BranchIntelligence b")
    List<BranchIntelligence> findIdBranchWithPriority();

    /**
     * Consulta para obtener prioridad junto con su ID de Branch.
     *
     * @return una lista de objetos con prioridad e ID de Branch.
     */
    @Query("SELECT b.priority, b.idBranch FROM BranchIntelligence b")
    List<BranchIntelligence> findPriorityWithIdBranch();

    @Query("SELECT bi FROM BranchIntelligence bi WHERE bi.idBranch = :idBranch")
    List<BranchIntelligence> findByBranchId(@Param("idBranch") Integer idBranch);

    @Query("SELECT bi FROM BranchIntelligence bi WHERE bi.idIntelligence = :idIntelligence")
    List<BranchIntelligence> findByIntelligenceId(@Param("idIntelligence") Integer idIntelligence);

}
