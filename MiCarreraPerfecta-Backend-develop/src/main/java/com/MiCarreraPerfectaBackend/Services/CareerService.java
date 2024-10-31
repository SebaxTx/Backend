package com.MiCarreraPerfectaBackend.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MiCarreraPerfectaBackend.Entity.Career;
import com.MiCarreraPerfectaBackend.Repository.CareerRepository;

/**
 *
 * @author Arboit
 */
@Service
public class CareerService {

    @Autowired
    private final CareerRepository repository;

    public CareerService() {
        this.repository = new CareerRepository();
    }

    public Career getCareerById(int id) {
        Optional<Career> c = repository.findById(id);
        if (c.isPresent())
            return c.get();
        return null;
    }

    public List<Career> getAllCareers() {
        return repository.findAll();
    }

    public List<Career> getByDuration(int duration) {
        return repository.findByDuration_months(duration);
    }

    public List<Career> getByDurationGreater(int duration) {
        return repository.findByDurationGraterThan(duration);
    }

    public List<Career> getByName(String name) {
        return repository.findByName(name);
    }

    public long count() {
        return repository.count();
    }

    public long countByName(String name) {
        return repository.countByName(name);
    }

    public List<Career> getByTypeId(int typeId) {
        return repository.findById_type_career(typeId);
    }

    public List<Career> getByBranchId(int branchId) {
        return repository.findById_branch(branchId);
    }

    public List<Career> getByRangeId(int rangeId) {
        return repository.findById_range(rangeId);
    }

    public List<Career> getByModalityId(int modalityId) {
        return repository.findById_modality(modalityId);
    }

    public List<Career> getByTitleIntermediate(int title) {
        return repository.findByTitleIntermediate(title);
    }
    
}