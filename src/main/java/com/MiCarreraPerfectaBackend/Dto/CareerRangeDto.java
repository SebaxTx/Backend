package com.MiCarreraPerfectaBackend.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;

/**
 *
 * @author Arboit
 */
@Schema(description = "Representa un rango de carrera (DTO)")
public class CareerRangeDto {
    
    @Schema(description = "ID del rango", example = "1")
    private Long idRange;

    @Schema(description = "Nombre del rango", example = "Salario alto")
    private String name;

    @Schema(description = "ID del usuario que creó el rango", example = "123")
    private Long idUserCreate;

    @Schema(description = "ID del usuario que actualizó el rango", example = "456")
    private Long idUserUpdate;

    @Schema(description = "Fecha de creación del rango (formato: yyyy-MM-dd HH:mm:ss)", example = "2023-12-25 14:30:00")
    private Date fcreate;

    @Schema(description = "Fecha de última actualización del rango (formato: yyyy-MM-dd HH:mm:ss)", example = "2024-01-10 09:15:30")
    private Date fupdate;

    // Getters
    public Long getIdRange() {
        return idRange;
    }

    public String getName() {
        return name;
    }

    public Long getIdUserCreate() {
        return idUserCreate;
    }

    public Long getIdUserUpdate() {
        return idUserUpdate;
    }

    public Date getFcreate() {
        return fcreate;
    }

    public Date getFupdate() {
        return fupdate;
    }

    // Setters
    public void setIdRange(Long idRange) {
        this.idRange = idRange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdUserCreate(Long idUserCreate) {
        this.idUserCreate = idUserCreate;
    }

    public void setIdUserUpdate(Long idUserUpdate) {
        this.idUserUpdate = idUserUpdate;
    }

    public void setFcreate(Date fcreate) {
        this.fcreate = fcreate;
    }

    public void setFupdate(Date fupdate) {
        this.fupdate = fupdate;
    }
    
}