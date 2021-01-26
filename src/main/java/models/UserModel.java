package models;

/**
 * @author Fakhri MF
 */
public class UserModel {
    private String nama;
    private String username;
    private String password;
    private String rfid_key;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRfid_key() {
        return rfid_key;
    }

    public void setRfid_key(String rfid_key) {
        this.rfid_key = rfid_key;
    }
}
