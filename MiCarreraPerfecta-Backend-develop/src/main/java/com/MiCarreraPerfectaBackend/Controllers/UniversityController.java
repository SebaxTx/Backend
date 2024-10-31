package com.MiCarreraPerfectaBackend.Controllers;

import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import com.MiCarreraPerfectaBackend.Services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Marisa
 */
@RestController
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    private final UniversityService UniversityService;

    public UniversityController() {
        this.UniversityService = new UniversityService();
    }

    @GetMapping
    public WebApiResponse getAllUniversity() {
        return  WebApiResponse.newResponse(-1, "Status: ", UniversityService.findAll());
    }

    @GetMapping("/name/{name}")
    public WebApiResponse getUniversityByName(@PathVariable String name) {
        return WebApiResponse.newResponse(-1, "Status: ", UniversityService.getUniversityByName(name));
    }

    @GetMapping("/{id}")
    public WebApiResponse getUniversityById(@PathVariable int id) {
        return WebApiResponse.newResponse(-1, "Status: ", UniversityService.getUniversityById(id));
    }

    @GetMapping("/management/{id}")
    public WebApiResponse rgetUniversityByManagement(@PathVariable int id) {
        return WebApiResponse.newResponse(-1, "Status: ", UniversityService.getUniversityByManagement(id));
    }

}