/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author angga
 */
public class PresensiModel {
    private String nama;
    private String nomor_absen;
    private String status;
    private String waktu;

    public PresensiModel() {
    }
    
    public PresensiModel(String nama, String nomor_absen, String status, String waktu) {
        this.nama = nama;
        this.nomor_absen = nomor_absen;
        this.status = status;
        this.waktu = waktu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor_absen() {
        return nomor_absen;
    }

    public void setNomor_absen(String nomor_absen) {
        this.nomor_absen = nomor_absen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
    
    
}