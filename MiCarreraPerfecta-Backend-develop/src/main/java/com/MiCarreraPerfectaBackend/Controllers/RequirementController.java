package com.MiCarreraPerfectaBackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import com.MiCarreraPerfectaBackend.Services.RequirementService;

/**
 *
 * @author Fornasari
 */
@RestController
@RequestMapping("/requirement")
public class RequirementController {
    
    @Autowired
    private RequirementService requirementService;
    
    @GetMapping
    public WebApiResponse getRequirementEntities(){
        return WebApiResponse.newResponse(-1, "Status: ",requirementService.getAllRequirement());
    }
    
    @GetMapping("/{id}")
    public WebApiResponse getBranchById(@PathVariable int id){
        return WebApiResponse.newResponse(-1, "Status: ", requirementService.getRequirementById(id));
    }

    @GetMapping("/name/{name}")
    public WebApiResponse getRequirementNames(String name){
        return WebApiResponse.newResponse(-1, "Status: " , requirementService.getRequirementByName(name));
    }
    
}