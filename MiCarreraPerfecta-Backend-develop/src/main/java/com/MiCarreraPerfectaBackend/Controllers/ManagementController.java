package com.MiCarreraPerfectaBackend.Controllers;

import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import com.MiCarreraPerfectaBackend.Services.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author agustin coria
 */
@RestController
@RequestMapping("/management")
public class ManagementController {

    @Autowired
    private ManagementService managementService;

    @GetMapping
    public WebApiResponse getAllManagement() {
        return WebApiResponse.newResponse(-1, "Status:  ", managementService.getAllManagment());
    }

    @GetMapping("/management/{name}")
    public WebApiResponse getManagement(@PathVariable String name) {
        return WebApiResponse.newResponse(-1, "Status: ", managementService.getSearchManagement(name));
    }
    
    @GetMapping("/university/{management}")
    public WebApiResponse getUniversityForManagement (@PathVariable int management){
        return WebApiResponse.newResponse(-1, "Status: ", managementService.getUniversityForManagement(management));
    }
    
}