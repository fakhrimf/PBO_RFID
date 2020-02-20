/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ADITYA
 */
public class DailyDataModel {
    private String id;
    private String tanggal;
    private String waktu_masuk;
    private String waktu_keluar;
    
    public DailyDataModel(){
        
    }
    public DailyDataModel(String waktu_masuk, String waktu_keluar, String id, String tanggal) {
        this.id = id;
        this.tanggal = tanggal;
        this.waktu_masuk = waktu_masuk;
        this.waktu_keluar = waktu_keluar;
    }

    public String getId() {
        return id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getWaktu_masuk() {
        return waktu_masuk;
    }

    public String getWaktu_keluar() {
        return waktu_keluar;
    }
    
    

}
