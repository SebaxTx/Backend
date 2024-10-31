package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.Requirement;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Cabrera
 */
public interface RequirementService {
    
    public List<Requirement> getAllRequirement();
    
    public Optional<Requirement> getRequirementById(Integer id);
    
    public List<Requirement> getRequirementByName(String name);
    
}
