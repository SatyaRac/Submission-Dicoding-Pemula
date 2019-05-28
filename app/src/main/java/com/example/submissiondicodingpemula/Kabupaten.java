package com.example.submissiondicodingpemula;

public class Kabupaten {
    private String name;
    private String remarks;
    private String photo;
    private String ultah;

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
}
