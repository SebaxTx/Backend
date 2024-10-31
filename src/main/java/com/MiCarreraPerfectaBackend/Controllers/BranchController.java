package com.MiCarreraPerfectaBackend.Controllers;

import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import com.MiCarreraPerfectaBackend.Services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Cabrera
 */
@RestController
@RequestMapping("/branch")
public class BranchController {
    
    @Autowired
    private BranchService branchService;
    
    @GetMapping
    public WebApiResponse getAllBranches(){
        return WebApiResponse.newResponse(-1, "Status: ", branchService.getAllBranches());
    }
    
    @GetMapping("/{id}")
    public WebApiResponse getBranchById(@PathVariable int id){
        return WebApiResponse.newResponse(-1, "Status: ", branchService.getBranchById(id));
    }
    
    @GetMapping("/name/{name}")
    public WebApiResponse getBranchByName(@PathVariable String name){
        return WebApiResponse.newResponse(-1, "Status: ", branchService.getBranchByName(name));
    }
    
}