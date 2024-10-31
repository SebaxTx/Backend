package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.Management;
import com.MiCarreraPerfectaBackend.Entity.University;
import java.util.List;

/**
 * @author agustin coria 
 */
public interface ManagementService {
    
    public List<Management> getAllManagment ();
    public List<Management> getSearchManagement (String name);
    public List<University> getUniversityForManagement(int management);
    
}
