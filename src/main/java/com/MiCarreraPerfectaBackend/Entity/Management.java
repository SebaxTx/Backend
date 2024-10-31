package com.MiCarreraPerfectaBackend.Entity;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author agustin coria
 */
@Entity
@Table(name = "management")
public class Management implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_management")
    private int id_management;

    @Column(name = "name_management")
    private String name_management;
    
    @Column(name = "_public")
    private short _public; 
    
    public Management() {
    }

    public Management(int id_management, String name_management) {
        this.id_management = id_management;
        this.name_management = name_management;
    }

    public void setId_management(int id_management) {
        this.id_management = id_management;
    }

    public void setName_management(String name_management) {
        this.name_management = name_management;
    }

    public short getPublic() {
        return _public;
    }

    public void setPublic(short _public) {
        this._public = _public;
    }

    public int getId_management() {
        return id_management;
    }

    public String getName_management() {
        return name_management;
    }

}
