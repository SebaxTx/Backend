package com.MiCarreraPerfectaBackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import com.MiCarreraPerfectaBackend.Services.TypeCareerService;

/**
 *
 * @author Fornasari
 */
@RestController
@RequestMapping("/typecareer")
public class TypeCareerController {

    @Autowired
    private TypeCareerService typeCareerService;
    
   
    @GetMapping
    public WebApiResponse getAllTypeCareer(){
        return WebApiResponse.newResponse(-1, "Status: " , typeCareerService.getAllTypeCareer());
    }

    @GetMapping("/{id}")
    public WebApiResponse getTypeCareerByName(int id){
        return WebApiResponse.newResponse(-1, "Status: " , typeCareerService.getTypeCareerById(id));
    }
    
}