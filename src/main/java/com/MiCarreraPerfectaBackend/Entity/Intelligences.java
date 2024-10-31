package com.MiCarreraPerfectaBackend.Entity;

import jakarta.persistence.*;

/**
 *
 * @author Martorana
 */
@Entity
@Table(name = "intelligences")
public class Intelligences {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_intelligences")
    private Integer idIntelligence;

    @Column(name = "name")
    private String name;

    // Getters and setters
    public Integer getIdIntelligence() {
        return idIntelligence;
    }

    public void setIdIntelligence(Integer idIntelligence) {
        this.idIntelligence = idIntelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}