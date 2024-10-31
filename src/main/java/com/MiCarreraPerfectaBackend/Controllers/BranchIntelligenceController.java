package com.MiCarreraPerfectaBackend.Controllers;

import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.MiCarreraPerfectaBackend.Services.BranchIntelligenceService;

/**
 * Controlador REST para gestionar las operaciones relacionadas con las
 * entidades Branch_Intelligence.
 * @author Martorana
 */
@RestController
@RequestMapping("/branchintelligence")
public class BranchIntelligenceController {

    @Autowired
    private BranchIntelligenceService branchIntelligenceService;

    /**
     * Endpoint para obtener una entidad BranchIntelligence por su ID.
     *
     * @param id el ID de la entidad Branch_Intelligence.
     * @return una respuesta de la API que contiene la entidad
     * Branch_Intelligence si se encuentra, o un mensaje de error si no se
     * encuentra.
     */
    @GetMapping("/{id}")
    public WebApiResponse getBranchById(@PathVariable int id) {
        return WebApiResponse.newResponse(-1, "Status: ", branchIntelligenceService.getIdBranch(id));
    }

    @GetMapping("/branchandintelligence/{id}")
    public WebApiResponse getBranchAndIntelligenceByBranchId(@PathVariable int id) {
        return WebApiResponse.newResponse(-1, "Status: ", branchIntelligenceService.getBranchAndIntelligenceNamesByBranchId(id));
    }

    @GetMapping("/intelligence/{id}")
    public WebApiResponse getBranchAndIntelligenceByIntelligenceId(@PathVariable int id) {
        return WebApiResponse.newResponse(-1, "Status: ", branchIntelligenceService.getBranchAndIntelligenceNamesByIntelligenceId(id));
    }
    
}