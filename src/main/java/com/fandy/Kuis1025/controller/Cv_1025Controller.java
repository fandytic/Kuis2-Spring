/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fandy.Kuis1025.controller;

import com.fandy.Kuis1025.entity.Cv_1025;
import com.fandy.Kuis1025.service.Cv_1025Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/cv_1025")
public class Cv_1025Controller {

    @Autowired
    private Cv_1025Service cv_1025Service;

    @RequestMapping(method = RequestMethod.POST)
    public Cv_1025 insert(@RequestBody Cv_1025 cv_1025) {
        return cv_1025Service.insert(cv_1025);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Cv_1025 update(@RequestBody Cv_1025 cv_1025) {
        return cv_1025Service.update(cv_1025);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1025Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Cv_1025 getById(@PathVariable("id") Long id){
        return cv_1025Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Cv_1025> getAll(){
        return cv_1025Service.getAll();
    }
}
