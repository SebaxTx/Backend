package com.MiCarreraPerfectaBackend.Entity;

import org.springframework.lang.NonNull;
import jakarta.persistence.*;

/**
 *
 * @author Arboit
 */
@Entity
@Table(name = "career")
public class Career {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_career;

    @SuppressWarnings("null")
    public Career() {
    }

    public Career(Integer id_career, String name, Integer title_intermediate, String description,
            Integer duration_months, Integer id_type_career, Integer id_modality, Integer id_branch, Integer id_range) {
        this.id_career = id_career;
        this.name = name;
        this.title_intermediate = title_intermediate;
        this.description = description;
        this.duration_months = duration_months;
        this.id_type_career = id_type_career;
        this.id_modality = id_modality;
        this.id_branch = id_branch;
        this.id_range = id_range;
    }

    @NonNull
    private String name;

    private Integer title_intermediate;

    @NonNull
    private String description;

    @NonNull
    private Integer duration_months;

    @NonNull
    private Integer id_type_career;

    @NonNull
    private Integer id_modality;

    @NonNull
    private Integer id_branch;

    @NonNull
    private Integer id_range;

    public Integer getId_career() {
        return id_career;
    }

    public void setId_career(Integer id_career) {
        this.id_career = id_career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTitle_intermediate() {
        return title_intermediate;
    }

    public void setTitle_intermediate(Integer title_intermediate) {
        this.title_intermediate = title_intermediate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration_months() {
        return duration_months;
    }

    public void setDuration_months(Integer duration_months) {
        this.duration_months = duration_months;
    }

    public Integer getId_type_career() {
        return id_type_career;
    }

    public void setId_type_career(Integer id_type_career) {
        this.id_type_career = id_type_career;
    }

    public Integer getId_modality() {
        return id_modality;
    }

    public void setId_modality(Integer id_modality) {
        this.id_modality = id_modality;
    }

    public Integer getId_branch() {
        return id_branch;
    }

    public void setId_branch(Integer id_branch) {
        this.id_branch = id_branch;
    }

    public Integer getId_range() {
        return id_range;
    }

    public void setId_range(Integer id_range) {
        this.id_range = id_range;
    }

}
