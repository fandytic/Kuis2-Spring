/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fandy.Kuis1025.repo;

import com.fandy.Kuis1025.entity.Nilai_1025;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface Nilai_1025Repo extends CrudRepository<Nilai_1025, Long>{
    
    @Query("select p from Product p")
    public List<Nilai_1025> findAllProduct();
    
    @Query("select p from Product p where p.category.id= :id")
    public List<Nilai_1025> findByCategory(@Param("id") Long id);
    
    @Query("select p from Product p where LOWER(p.name) LIKE LOWER(:name)")
    public List<Nilai_1025> findByName(@Param("name") String name);
}
