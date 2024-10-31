package com.MiCarreraPerfectaBackend.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;

/**
 *
 * @author Tello
 */
@Schema(description = "Representa un estudiante (DTO)") 
public class StudentDto {
    
    @Schema(description = "ID del estudiante", example = "1")
    private Long id_students;

    @Schema(description = "Nombre del estudiante", example = "Juan Pérez")
    private String name;

    @Schema(description = "Correo electrónico del estudiante", example = "juan@example.com")
    private String email;

    @Schema(description = "Edad del estudiante", example = "25")
    private Integer age;

    @Schema(description = "Fecha de nacimiento del estudiante (formato: yyyy-MM-dd)", example = "2000-01-01")
    private Date date;

    @Schema(description = "Longitud de la ubicación del estudiante", example = "-58.3816")
    private Double lon;

    @Schema(description = "Latitud de la ubicación del estudiante", example = "-34.6037")
    private Double lat;
    // Constructor por defecto
    public StudentDto() {}

    // Getters y Setters
    public Long getId_students() {
        return id_students;
    }

    public void setId_students(Long id_students) {
        this.id_students = id_students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
    
}