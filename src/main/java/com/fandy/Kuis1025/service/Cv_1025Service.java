/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fandy.Kuis1025.service;

import com.fandy.Kuis1025.entity.Cv_1025;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fandy.Kuis1025.repo.Cv_1025Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("cv_1025Service")
@Transactional
public class Cv_1025Service {

    @Autowired
    private Cv_1025Repo repo;

    public Cv_1025 insert(Cv_1025 cv_1025) {
        return repo.save(cv_1025);
    }
    
    public Cv_1025 update(Cv_1025 cv_1025) {
        return repo.save(cv_1025);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Cv_1025 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Cv_1025> getAll(){
        return repo.findAllCv_1025();
    }
}
