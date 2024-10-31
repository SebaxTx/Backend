package com.MiCarreraPerfectaBackend.Entity;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;

/**
 *
 * @author Tello
 */
@Entity
@Table(name = "students")
@Schema(description = "Representa un estudiante en la base de datos")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID del estudiante (generado automáticamente)", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id_students;

    @Schema(description = "Nombre del estudiante")
    private String name;

    @Schema(description = "Correo electrónico del estudiante")
    private String email;

    @Schema(description = "Edad del estudiante")
    private Integer age;

    @Schema(description = "Fecha de nacimiento del estudiante")
    private Date date;

    @Schema(description = "Longitud de la ubicación del estudiante")
    private Double lon;

    @Schema(description = "Latitud de la ubicación del estudiante")
    private Double lat;

    // Getters
    public Long getId_students() {
        return id_students;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Date getDate() {
        return date;
    }

    public Double getLon() {
        return lon;
    }

    public Double getLat() {
        return lat;
    }

    // Setters
    public void setId_students(Long id_students) {
        this.id_students = id_students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}
