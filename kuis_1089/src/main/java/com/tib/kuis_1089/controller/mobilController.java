/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1089.controller;

import com.tib.kuis_1089.entity.mobil;
import com.tib.kuis_1089.service.mobilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahasiswa 2
 */
@RestController
@RequestMapping("/mobil")
public class mobilController {
    
    @Autowired
    private mobilService mobilService;

    @RequestMapping(method = RequestMethod.POST)
    public mobil insert(@RequestBody mobil mobil) {
        return mobilService.insert(mobil);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public mobil update(@RequestBody mobil mobil) {
        return mobilService.update(mobil);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return mobilService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public mobil getById(@PathVariable("id") Long id){
        return mobilService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<mobil> getAll(){
        return mobilService.getAll();
    }
}
