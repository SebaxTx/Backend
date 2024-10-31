package com.MiCarreraPerfectaBackend.Services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MiCarreraPerfectaBackend.Entity.TypeCareer;
import com.MiCarreraPerfectaBackend.Repository.TypeCareerRepository;
import java.util.Optional;

/**
 *
 * @author Fornasari
 */
@Service
public class TypeCareerServiceImpl implements TypeCareerService{
    
 @Autowired
    private TypeCareerRepository typeCareerRepository;

 @Override
    public ArrayList<TypeCareer> getAllTypeCareer(){
        return(ArrayList<TypeCareer>) typeCareerRepository.findAll();
    }

 @Override
    public Optional<TypeCareer> getTypeCareerById(int id){
        return typeCareerRepository.findById(id);
    }
    
}
