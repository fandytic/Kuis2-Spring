/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fandy.Kuis1025.service;

import com.fandy.Kuis1025.entity.Nilai_1025;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fandy.Kuis1025.repo.Nilai_1025Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("productService")
@Transactional
public class Nilai_1025Service {

    @Autowired
    private Nilai_1025Repo repo;

    public Nilai_1025 insertOrUpdate(Nilai_1025 product) {
        return repo.save(product);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Nilai_1025> findAll() {
        return repo.findAllProduct();
    }

    public List<Nilai_1025> findByCategory(Long nilaiId) {
        return repo.findByCategory(nilaiId);
    }

    public List<Nilai_1025> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}
