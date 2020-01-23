package models;

/**
 * @author Fakhri MF
 */
public class SiswaModel {
    private String nis;
    private String nama;
    private String kelas;
    private String gender;
    private String agama;
    private String rfidKey;

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getRfidKey() {
        return rfidKey;
    }

    public void setRfidKey(String rfidKey) {
        this.rfidKey = rfidKey;
    }
}
