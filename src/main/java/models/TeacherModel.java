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
    private String name,password,rfid_key,username;
    
    public TeacherModel(){
        
    }
    public TeacherModel(String name, String password, String rfid_key, String username) {
        this.name = name;
        this.password = password;
        this.rfid_key = rfid_key;
        this.username = username;
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
