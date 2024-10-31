package com.MiCarreraPerfectaBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MiCarreraPerfectaBackend.Entity.Range;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Repositorio para gestionar las operaciones CRUD de las entidades Range.
 * @author Arboit y Martorana
 */
@Repository
public interface RangeRepository extends JpaRepository<Range, Integer> {

    /**
     * Consulta para obtener una entidad Range por su ID. Consulta nativa y con
     * comillas invertidas en "range" ya que es una palabra reservada para
     * MySQL.
     *
     * @param id el ID de la entidad Range.
     * @return un Optional que contiene la entidad Range si se encuentra, o
     * vacío si no se encuentra.
     */
    @Query("SELECT r FROM Range r WHERE r.idRange = :id")
    Optional<Range> findByIdRange(@Param("id") Integer id);

    /**
     * Consulta para obtener una entidad Range por su nombre.
     *
     * @param name el nombre de la entidad Range.
     * @return un Optional que contiene la entidad Range si se encuentra, o
     * vacío si no se encuentra.
     */
    @Query( "SELECT r FROM Range r WHERE r.name = :name")
    Optional<Range> findByName(@Param("name") String name);

}
