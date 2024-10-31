package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.TypeCareer;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Cabrera
 */
public interface TypeCareerService {
    
    public List<TypeCareer> getAllTypeCareer();
    
    public Optional<TypeCareer> getTypeCareerById(int id);
    
}
