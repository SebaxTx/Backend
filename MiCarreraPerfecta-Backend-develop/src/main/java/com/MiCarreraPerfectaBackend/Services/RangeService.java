package com.MiCarreraPerfectaBackend.Services;

import com.MiCarreraPerfectaBackend.Entity.Range;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de servicio para gestionar la entidad Range.
 * Métodos para obtener entidades Range por ID y nombre.
 * @author Arboit y Martorana
 */
public interface RangeService {
  
    public Optional<Range> getIdRange(Integer idRange);
    public Optional<Range> getRangeByName(String name);
    public List<Range> getAllRange();
    
}