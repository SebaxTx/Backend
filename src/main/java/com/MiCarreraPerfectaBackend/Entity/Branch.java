package com.MiCarreraPerfectaBackend.Entity;

import jakarta.persistence.*;

/**
 *
 * @author Cabrera
 */
@Entity
@Table(name = "branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_branch;
    private String name;
    private String description;

    public Branch() {

    }

    public Branch(int id_branch, String name, String description) {
        this.id_branch = id_branch;
        this.name = name;
        this.description = description;
    }

    public int getId_branch() {
        return id_branch;
    }

    public void setId_branch(int id_branch) {
        this.id_branch = id_branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}