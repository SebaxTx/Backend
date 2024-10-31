package com.MiCarreraPerfectaBackend.Entity;

import jakarta.persistence.*;

/**
 * 
 * @author Martorana
 */
@Entity
@Table(name = "branch_intelligence")
public class BranchIntelligence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_branch_intelligence")
    private Integer idBranchIntelligence;

    @Column(name = "id_branch")
    private Integer idBranch;

    @Column(name = "id_intelligence")
    private Integer idIntelligence;

    @Column(name = "priority")
    private Integer priority;

    // Getters and setters
    public Integer getIdBranchIntelligence() {
        return idBranchIntelligence;
    }

    public void setIdBranchIntelligence(Integer idBranchIntelligence) {
        this.idBranchIntelligence = idBranchIntelligence;
    }

    public Integer getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(Integer idBranch) {
        this.idBranch = idBranch;
    }

    public Integer getIdIntelligence() {
        return idIntelligence;
    }

    public void setIdIntelligence(Integer idIntelligence) {
        this.idIntelligence = idIntelligence;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    
}