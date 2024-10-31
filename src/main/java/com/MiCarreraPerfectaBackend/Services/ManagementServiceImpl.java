package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.Management;
import com.MiCarreraPerfectaBackend.Entity.University;
import com.MiCarreraPerfectaBackend.Repository.ManagementRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author agustin coria
 */
@Service
public class ManagementServiceImpl implements ManagementService {

    @Autowired
    private ManagementRepository managementRepository;

    @Override
    public List<Management> getAllManagment() {
        List<Management> management = managementRepository.findAll();
        return management;
    }

    @Override
    public List<Management> getSearchManagement(String name) {
        return managementRepository.findManagementByName(name);
    }

    @Override
    public List<University> getUniversityForManagement(int management) {
        List <University> universitys = managementRepository.findUniversityForManagement(management);
        return universitys; 
    }

}
