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
    private String waktu_keluar;
    private String waktu_masuk;

    public DailyDataModel(String id, String tanggal, String waktu_keluar, String waktu_masuk) {
        this.id = id;
        this.tanggal = tanggal;
        this.waktu_keluar = waktu_keluar;
        this.waktu_masuk = waktu_masuk;
    }
    
    public DailyDataModel(){
        
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
