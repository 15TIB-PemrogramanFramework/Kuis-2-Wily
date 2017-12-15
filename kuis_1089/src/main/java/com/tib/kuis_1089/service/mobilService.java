/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1089.service;

import com.tib.kuis_1089.entity.mobil;
import com.tib.kuis_1089.repo.mobilRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahasiswa 2
 */
@Service("mobilService")
@Transactional
public class mobilService {

    @Autowired
    private mobilRepo repo;

    public mobil insert(mobil mobil) {
        return repo.save(mobil);
    }

    public mobil update(mobil mobil) {
        return repo.save(mobil);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public mobil getById(Long id) {
        return repo.findOne(id);
    }

    public List<mobil> getAll() {
        return repo.findAllMobil();
    }
    
}
