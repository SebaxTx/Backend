package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.University;
import com.MiCarreraPerfectaBackend.Repository.UniversityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marisa
 */
@Service
public class UniversityService {
    @Autowired
    public UniversityRepository UniversityRepository;
     //crear contuscur

    public UniversityService() {
        this.UniversityRepository = new UniversityRepository();
    }
    
    public List<University> findAll(){
        List<University> datos = UniversityRepository.findAll();
        
        return datos;
    }
    
    public List<University> getUniversityByName(String name) {
       List<University> datos = UniversityRepository.findUniversityByName(name);
            
        return datos;
    }
    public List<University> getUniversityById(int id_university) {
       List<University> datos = UniversityRepository.findUniversityById(id_university);
            
        return datos;
    }
    
    public List< University> getUniversityByManagement(int id_management) {
        List<University> datos=UniversityRepository.findUniversityByManagement(id_management);
            
        return datos;
    }
    
}