/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.google.firebase.database.DataSnapshot;

/**
 *
 * @author angga
 */
public class PresensiModel {
    private String waktu_masuk, status, id_rfid, name;

    public PresensiModel() {
    
    }

    public PresensiModel(String waktu_masuk, String status, String id_rfid, String name) {
        this.waktu_masuk = waktu_masuk;
        this.status = status;
        this.id_rfid = id_rfid;
        this.name = name;
    }

    public String getId_rfid() {
        return id_rfid;
    }

    public void setId_rfid(String id_rfid) {
        this.id_rfid = id_rfid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PresensiModel(DataSnapshot waktu_masuk, String asdasdasd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  
    public String getWaktu_masuk() {
        return waktu_masuk;
    }

    public void setWaktu_masuk(String waktu_masuk) {
        this.waktu_masuk = waktu_masuk;
    }  
}