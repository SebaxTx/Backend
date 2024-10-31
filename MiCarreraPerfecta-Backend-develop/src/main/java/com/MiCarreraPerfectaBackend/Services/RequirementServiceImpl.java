package com.MiCarreraPerfectaBackend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MiCarreraPerfectaBackend.Entity.Requirement;
import com.MiCarreraPerfectaBackend.Repository.RequirementRepository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Fornasari
 */
@Service
public class RequirementServiceImpl implements RequirementService {
    
    @Autowired
    private RequirementRepository requirementRepository;

    @Override
    public List<Requirement> getAllRequirement(){
        return requirementRepository.findAll();
    }
    
    @Override
    public Optional<Requirement> getRequirementById(Integer id){
    
        return requirementRepository.findById(id);
    
    }

    @Override
    public List<Requirement> getRequirementByName(String name){
        
        return requirementRepository.findRequirementByName(name);
        
    }
    
}
