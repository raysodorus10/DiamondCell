package com.example.android.diamondcell;

import android.os.Parcel;
import android.os.Parcelable;

public class Supplier implements Parcelable {
    private String mKode;
    private String mNama;
    private String mAlamat;
    private String mTelp;
    private String mHp;
    private String mEmail;
    private String mKontak;
    private boolean mStatus = false;

    public Supplier() {
    }

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

    protected Supplier(Parcel in) {
        mKode = in.readString();
        mNama = in.readString();
        mAlamat = in.readString();
        mTelp = in.readString();
        mHp = in.readString();
        mEmail = in.readString();
        mKontak = in.readString();
        mStatus = in.readByte() != 0;
    }

    public static final Creator<Supplier> CREATOR = new Creator<Supplier>() {
        @Override
        public Supplier createFromParcel(Parcel in) {
            return new Supplier(in);
        }

        @Override
        public Supplier[] newArray(int size) {
            return new Supplier[size];
        }
    };

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

    public String getStatusAsString(){
        if (mStatus){
            return "Aktif";
        }else if (!mStatus){
            return "Tidak Aktif";
        }else return "Unkown";
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeString(mKode);
        parcel.writeString(mNama);
        parcel.writeString(mAlamat);
        parcel.writeString(mTelp);
        parcel.writeString(mHp);
        parcel.writeString(mEmail);
        parcel.writeString(mKontak);
        parcel.writeByte((byte) (mStatus ? 1 : 0));
    }
}
