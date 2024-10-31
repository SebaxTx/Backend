package com.MiCarreraPerfectaBackend.Entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

/**
 *
 * @author Fornasari
 */
@Entity
@Table(name = "requirement")
public class Requirement {
    
    @Id
    @Nonnull
    private int id_requirement;
    private String name;
    private int eliminatory;
    
    public Requirement(){
       
    }
    
    public Requirement(int id_requirement, String name, int eliminatory) {
        this.id_requirement = id_requirement;
        this.name = name;
        this.eliminatory = eliminatory;
    }
    
    public int getId_requirement() {
        return id_requirement;
    }

    public void setId_requirement(int id_requirement) {
        this.id_requirement = id_requirement;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getEliminatory() {
        return eliminatory;
    }

    public void setEliminatory(int eliminatory) {
        this.eliminatory = eliminatory;
    }
    
}
