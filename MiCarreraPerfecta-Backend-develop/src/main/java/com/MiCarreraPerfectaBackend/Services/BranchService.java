package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.Branch;
import java.util.List;

/**
 *
 * @author Cabrera
 */
public interface BranchService {
    
    public List<Branch> getAllBranches();
    
    public Branch getBranchById(int id);
    
    public List<Branch> getBranchByName(String name);
    
}