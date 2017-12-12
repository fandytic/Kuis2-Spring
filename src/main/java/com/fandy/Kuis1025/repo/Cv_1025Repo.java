/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fandy.Kuis1025.repo;

import com.fandy.Kuis1025.entity.Cv_1025;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Cv_1025Repo extends CrudRepository<Cv_1025, Long> {

    @Query("select c from cv_1025 c")
    public List<Cv_1025> findAllCv_1025();
}
