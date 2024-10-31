package com.MiCarreraPerfectaBackend.Entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

/**
 *
 * @author Fornasari
 */
@Entity
@Table(name = "typecareer")
public class TypeCareer {

    @Id
    @Nonnull

    private int id_type_career;
    private String name;
    private Integer university;

    public TypeCareer() {
    }

    public TypeCareer(int id_type_career, String name, Integer university) {
        this.id_type_career = id_type_career;
        this.name = name;
        this.university = university;
    }

    public int getId_type_career() {
        return id_type_career;
    }

    public String getName() {
        return name;
    }

    public Integer getUniversity() {
        return university;
    }

    public void setId_type_career(int id_type_career) {
        this.id_type_career = id_type_career;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(Integer university) {
        this.university = university;
    }
}
