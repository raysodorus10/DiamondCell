package com.example.android.diamondcell;

public class Supplier {
    private String mKode;
    private String mNama;
    private String mAlamat;
    private String mTelp;
    private String mHp;
    private String mEmail;
    private String mKontak;
    private boolean mStatus = false;

    public Supplier (String kode, String nama, String alamat, String telp, String hp, String email, String kontak, boolean status) {
        setKode(kode);
        setNama(nama);
        setAlamat(alamat);
        setTelp(telp);
        setHp(hp);
        setEmail(email);
        setKontak(kontak);
        setStatus(status);
    }

    public String getKode() {
        return mKode;
    }

    public void setKode(String kode) {
        this.mKode = kode;
    }

    public String getNama() {
        return mNama;
    }

    public void setNama(String nama) {
        this.mNama = nama;
    }

    public String getAlamat() {
        return mAlamat;
    }

    public void setAlamat(String alamat) {
        this.mAlamat = alamat;
    }

    public String getTelp() {
        return mTelp;
    }

    public void setTelp(String telp) {
        this.mTelp = telp;
    }

    public String getHp() {
        return mHp;
    }

    public void setHp(String hp) {
        this.mHp = hp;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public String getKontak() {
        return mKontak;
    }

    public void setKontak(String kontak) {
        this.mKontak = kontak;
    }

    public boolean isActive() {
        return mStatus;
    }

    public void setStatus(boolean status) {
        this.mStatus = status;
    }

    public void save() {
        //TODO:Implement method
    }

    public void update() {
        //TODO:Implement method and add parameter
    }

    public void delete() {
        //TODO:Implement method and add parameter
    }

    public void fetch() {
        //TODO:Implement method and add parameter
    }
}
