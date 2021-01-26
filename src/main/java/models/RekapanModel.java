package models;

import java.util.Date;

/**
 * @author Fakhri MF
 */
public class RekapanModel {
    private int idKelas;
    private int idMatpel;
    private String waktuRekap;
    private Date tanggal;
    private int idUser;

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public int getIdMatpel() {
        return idMatpel;
    }

    public void setIdMatpel(int idMatpel) {
        this.idMatpel = idMatpel;
    }

    public String getWaktuRekap() {
        return waktuRekap;
    }

    public void setWaktuRekap(String waktuRekap) {
        this.waktuRekap = waktuRekap;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
