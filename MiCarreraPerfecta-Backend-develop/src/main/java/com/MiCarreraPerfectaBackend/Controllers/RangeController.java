package com.MiCarreraPerfectaBackend.Controllers;

import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import com.MiCarreraPerfectaBackend.Services.RangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para gestionar las operaciones relacionadas con las
 * entidades Range.
 * @author Arboit y Martorana
 */
@RestController
@RequestMapping("/range")
public class RangeController {

    @Autowired
    private RangeService rangeService;

    @GetMapping
    public WebApiResponse getAllRange() {

        return WebApiResponse.newResponse(-1, "Status: ", rangeService.getAllRange());
        
    }
    
     /**
     * Endpoint para obtener una entidad Range por su ID.
     *
     * @param id el ID de la entidad Range.
     * @return una respuesta de la API que contiene la entidad Range si se
     * encuentra, o un mensaje de error si no se encuentra.
     */
    @GetMapping("/{id}")
    public WebApiResponse getRangeById(@PathVariable Integer id) {
        return WebApiResponse.newResponse(-1, "Status: ", rangeService.getIdRange(id));
    }
    
    @GetMapping("/name/{name}")
    public WebApiResponse getRangeByName(@PathVariable String name) {
        return WebApiResponse.newResponse(-1, "Status: ", rangeService.getRangeByName(name));
    }

}