/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1089.repo;

import com.tib.kuis_1089.entity.mobil;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface mobilRepo extends CrudRepository<mobil, Long> {

    @Query("select c from mobil_1089 c")
    public List<mobil> findAllMobil();
}
