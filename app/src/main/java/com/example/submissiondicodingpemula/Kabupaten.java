package com.example.submissiondicodingpemula;

import android.os.Parcel;
import android.os.Parcelable;

public class Kabupaten implements Parcelable {
    private String name;
    private String remarks;
    private String photo;
    private String ultah;



    public static final Creator<Kabupaten> CREATOR = new Creator<Kabupaten>() {
        @Override
        public Kabupaten createFromParcel(Parcel in) {
            return new Kabupaten(in);
        }

        @Override
        public Kabupaten[] newArray(int size) {
            return new Kabupaten[size];
        }
    };

    public String getUltah() {
        return ultah;
    }

    public void setUltah(String ultah) {
        this.ultah = ultah;
    }

    public String getPenduduk() {
        return penduduk;
    }

    public void setPenduduk(String penduduk) {
        this.penduduk = penduduk;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    private String penduduk;
    private String keterangan;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.ultah);
        dest.writeString(this.keterangan);
        dest.writeString(this.penduduk);

    }

    Kabupaten(){

    }
    protected Kabupaten(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        ultah = in.readString();
        penduduk = in.readString();
        keterangan = in.readString();
    }



}
