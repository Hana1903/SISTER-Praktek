/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uashana.pajak.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */

@Entity
@Table
public class Pajak {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String nopolisi;
    private String jeniskendaraan;
    private String tarifpajak;
    private String terlambat;
    private String denda;
    private String total;
    
    
    public Pajak() {
    }

    public Pajak(Long id, String nopolisi, String jeniskendaraan, String tarifpajak, String terlambat, String denda, String total) {
    this.id = id;
    this.nopolisi = nopolisi;
    this.jeniskendaraan = jeniskendaraan;
    this.tarifpajak = tarifpajak;
    this.terlambat = terlambat;
    this.denda = denda;
    this.total = total;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNopolisi() {
        return nopolisi;
    }

    public void setNopolisi(String nopolisi) {
        this.nopolisi = nopolisi;
    }

    public String getJeniskendaraan() {
        return jeniskendaraan;
    }

    public void setJeniskendaraan(String jeniskendaraan) {
        this.jeniskendaraan = jeniskendaraan;
    }

    public String getTarifpajak() {
        return tarifpajak;
    }

    public void setTarifpajak(String tarifpajak) {
        this.tarifpajak = tarifpajak;
    }

    public String getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(String terlambat) {
        this.terlambat = terlambat;
    }

    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        this.denda = denda;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pajak{" + "id=" + id + ", nopolisi=" + nopolisi + ", jeniskendaraan=" + jeniskendaraan + ", tarifpajak=" + tarifpajak + ", terlambat=" + terlambat + ", denda=" + denda + ", total=" + total + '}';
    }
    
}
