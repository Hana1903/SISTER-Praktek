/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uashana.pajak.service;

import com.uashana.pajak.repository.PajakRepository;
import com.uashana.pajak.entity.Pajak;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */

@Service
public class PajakService {
    @Autowired
    private PajakRepository pajakRepository;
    
    public void insert(Pajak pajak) {
        Optional<Pajak> pajakOptional = 
                pajakRepository.findPajakById(pajak.getNopolisi());
        if (pajakOptional.isPresent()) {
            throw new IllegalStateException("NoPolisi sudah ada");
        }
        pajakRepository.save(pajak);
    }

    public List<Pajak> getAll(){
        return pajakRepository.findAll();
    }
    
    public Pajak getPajakById(Long id){
        return pajakRepository.findById(id).get();
    }
    
    public void delete(Long id){
        pajakRepository.deleteById(id);
    }
    
    
}