package com.MiCarreraPerfectaBackend.Entity;

import jakarta.persistence.*;

/**
 *
 * @author Marisa
 */
@Entity
@Table(name = "university")
public class University {
    
    @Id
    @Column(name = "id_university")
    private Integer id_university;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "id_management") 
    private Integer id_management;

    public int getId() {
        return id_university;
    }

    public void setId(int id) {
        this.id_university = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getId_management() {
        return id_management;
    }

    public void setId_management(int id_management) {
        this.id_management = id_management;
    }
    
}
