/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uashana.pajak.repository;

import com.uashana.pajak.entity.Pajak;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */

@Repository
public interface PajakRepository extends JpaRepository<Pajak, Long>{

    public Optional<Pajak> findPajakByNoPolisi(String nopolisi);

    public Optional<Pajak> findPajakById(String nopolisi);
    
}