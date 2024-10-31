package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.BranchIntelligence;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MiCarreraPerfectaBackend.Repository.BranchIntelligenceRepository;

/**
 * Implementación de la interfaz Branch_IntelligenceService. Proporciona métodos
 * para obtener y gestionar entidades Branch_Intelligence de la base de datos.
 * @author Martorana
 */
@Service
public class BranchIntelligenceServiceImp implements BranchIntelligenceService {

    @Autowired
    private BranchIntelligenceRepository branchIntelligenceRepository;

    @Override
    public List<BranchIntelligence> getAllBranchIntelligence() {
        return branchIntelligenceRepository.findAll();
    }

    @Override
    public Optional<BranchIntelligence> getById(Integer id) {
        return branchIntelligenceRepository.findById(id);
    }

    @Override
    public List<Integer> getAllIdBranch() {
        return branchIntelligenceRepository.findAllIdBranch();
    }

    @Override
    public Optional<BranchIntelligence> getIdBranch(Integer idBranch) {
        return branchIntelligenceRepository.findById(idBranch);
    }

    @Override
    public Optional<BranchIntelligence> getIdBranchIntelligence(Integer idBranchIntelligence) {
        return branchIntelligenceRepository.findById(idBranchIntelligence);
    }

    @Override
    public Optional<BranchIntelligence> getIdIntelligence(Integer idIntelligence) {
        return branchIntelligenceRepository.findById(idIntelligence);
    }

    public Optional<BranchIntelligence> getPriority(Integer priority) {
        return branchIntelligenceRepository.findById(priority);
    }

    @Override
    public List<BranchIntelligence> getBranchAndIntelligenceNamesByBranchId(Integer idBranch) {
        return branchIntelligenceRepository.findByBranchId(idBranch);
    }

    @Override
    public List<BranchIntelligence> findByPriority(Integer priority) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<BranchIntelligence> getBranchAndIntelligenceNamesByIntelligenceId(Integer idIntelligence) {
        return branchIntelligenceRepository.findByIntelligenceId(idIntelligence);
    }

}
