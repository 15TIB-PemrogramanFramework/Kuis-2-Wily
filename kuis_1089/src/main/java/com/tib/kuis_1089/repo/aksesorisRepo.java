/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1089.repo;

import com.tib.kuis_1089.entity.aksesoris;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Mahasiswa 2
 */
public interface aksesorisRepo extends CrudRepository<aksesoris, Long> {

    @Query("select c from aksesoris_1089 c")
    public List<aksesoris> findAllAksesoris();
}
