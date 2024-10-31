package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.Range;
import com.MiCarreraPerfectaBackend.Repository.RangeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementación de la interfaz RangeService. Métodos para obtener datos de la
 * tabla Range de la base de datos.
 * @author Arboit y Martorana
 */
@Service
public class RangeServiceImp implements RangeService {

    @Autowired
    private RangeRepository rangeRepository;

    /**
     * Obtiene una entidad Range por su ID.
     *
     * @param idRange el ID de la entidad Range.
     * @return un Optional que contiene la entidad Range si se encuentra, o
     * vacío si no se encuentra.
     */
    @Override
    public Optional<Range> getIdRange(Integer idRange) {
        return rangeRepository.findByIdRange(idRange);
    }

    /**
     * Obtiene una entidad Range por su nombre.
     *
     * @param name el nombre de la entidad Range.
     * @return un Optional que contiene la entidad Range si se encuentra, o
     * vacío si no se encuentra.
     */
    @Override
    public Optional<Range> getRangeByName(String name) {
        return rangeRepository.findByName(name);
    }

    /**
     * Obtiene los nombres de todos los rangos de carreras existentes en la base
     * de datos.
     *
     * @return Una lista de strings que representan los nombres de los rangos de
     * carreras.
     */
    @Override
    public List<Range> getAllRange() {
        return rangeRepository.findAll();
    }

}