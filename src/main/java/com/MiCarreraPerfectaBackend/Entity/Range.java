package com.MiCarreraPerfectaBackend.Entity;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

/**
 * Entidad que representa la tabla Range en la base de datos.
 * @author Arboit y Martorana
 */
@Entity
@Table(name = "`range`")
public class Range {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_range")
    private Integer idRange;
    /**
     * Establece el ID de la entidad Range.
     *
     * @param idRange el nuevo ID de la entidad Range.
     */
    @Column(name = "name")
    private String name;

    public Integer getIdRange() {
        return idRange;
    }

    /**
     * Establece el ID de la entidad Range.
     *
     * @param idRange el nuevo ID de la entidad Range.
     */
    public void setIdRange(Integer idRange) {
        this.idRange = idRange;
    }

    /**
     * Obtiene el nombre de la entidad Range.
     *
     * @return el nombre de la entidad Range.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la entidad Range.
     *
     * @param name el nuevo nombre de la entidad Range.
     */
    public void setName(String name) {
        this.name = name;
    }
    
}