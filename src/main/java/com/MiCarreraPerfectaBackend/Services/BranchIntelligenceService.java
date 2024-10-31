package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.BranchIntelligence;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de servicio para gestionar entidades de tipo Branch_Intelligence.
 * Proporciona métodos para obtener y gestionar entidades Branch_Intelligence.
 * @author Martorana
 */
public interface BranchIntelligenceService {

    Optional<BranchIntelligence> getById(Integer id);
    
    Optional<BranchIntelligence> getIdBranch(Integer idBranch);

    Optional<BranchIntelligence> getIdBranchIntelligence(Integer idBranchIntelligence);

    Optional<BranchIntelligence> getIdIntelligence(Integer idIntelligence);
    
    List<Integer> getAllIdBranch();
    
    List<BranchIntelligence> findByPriority(Integer priority);

    List<BranchIntelligence> getAllBranchIntelligence();

    List<BranchIntelligence> getBranchAndIntelligenceNamesByBranchId(Integer idBranch);

    List<BranchIntelligence> getBranchAndIntelligenceNamesByIntelligenceId(Integer idIntelligence);

}
