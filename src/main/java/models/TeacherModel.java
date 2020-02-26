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
public class TeacherModel {

    private String name, password, rfid_key, username, gnrs = "Testing";
    private int jml_masuk = 0;
    
    public TeacherModel() {

    }
    public TeacherModel(String name, String password, String rfid_key, String username, String gnrs,int jml_masuk) {
        this.name = name;
        this.password = password;
        this.rfid_key = rfid_key;
        this.username = username;
        this.gnrs = gnrs;
        this.jml_masuk = jml_masuk;
    }

    public String getGnrs() {
        return gnrs;
    }

    public int getJml_masuk() {
        return jml_masuk;
    }

    public void setJml_masuk(int jml_masuk) {
        this.jml_masuk = jml_masuk;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRfid_key() {
        return rfid_key;
    }

    public String getUsername() {
        return username;
    }

}
