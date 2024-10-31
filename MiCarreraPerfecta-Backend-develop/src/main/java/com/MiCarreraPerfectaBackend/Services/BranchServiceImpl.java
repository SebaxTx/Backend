package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.Branch;
import com.MiCarreraPerfectaBackend.Repository.BranchRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cabrera
 */
@Service
public class BranchServiceImpl implements BranchService {
    
    @Autowired
    public BranchRepository branchRepository;

    @Override
    public List<Branch> getAllBranches() {  
        return branchRepository.findAllBranches();
    }

    @Override
    public Branch getBranchById(int id) {
        return branchRepository.findBranchById(id);
    }

    @Override
    public List<Branch> getBranchByName(String name) {
        return branchRepository.findBranchByName(name);
    }
    
}