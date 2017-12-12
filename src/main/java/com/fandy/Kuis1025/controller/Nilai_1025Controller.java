/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fandy.Kuis1025.controller;

import com.fandy.Kuis1025.entity.Nilai_1025;
import com.fandy.Kuis1025.repo.Nilai_1025Repo;
import com.fandy.Kuis1025.service.Nilai_1025Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/product")
public class Nilai_1025Controller {
    
    @Autowired
    private Nilai_1025Service productService;
    
    @RequestMapping(method = RequestMethod.POST)
    public Nilai_1025 insertOrUpdate(@RequestBody Nilai_1025 product){
        return productService.insertOrUpdate(product);
    }
  
}
