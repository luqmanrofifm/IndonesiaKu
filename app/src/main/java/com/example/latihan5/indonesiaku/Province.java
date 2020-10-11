package com.example.latihan5.indonesiaku;

public class Province {

    private String provinceName;
    private String ibuKota;
    private String luas;
    private String tanggalLahir;
    private String letakPosisi;
    private String jumlahJiwa;
    private String detailLogo;

    private int gambarLogo;
    private int gambarPeta;

    public int getGambarPeta() {
        return gambarPeta;
    }

    public void setGambarPeta(int gambarPeta) {
        this.gambarPeta = gambarPeta;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDetailLogo() {
        return detailLogo;
    }

    public void setDetailLogo(String detailLogo) {
        this.detailLogo = detailLogo;
    }

    public int getGambarLogo() {
        return gambarLogo;
    }

    public void setGambarLogo(int gambarLogo) {
        this.gambarLogo = gambarLogo;
    }

    public String getIbuKota() {
        return ibuKota;
    }

    public void setIbuKota(String ibuKota) {
        this.ibuKota = ibuKota;
    }

    public String getLuas() {
        return luas;
    }

    public void setLuas(String luas) {
        this.luas = luas;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getLetakPosisi() {
        return letakPosisi;
    }

    public void setLetakPosisi(String letakPosisi) {
        this.letakPosisi = letakPosisi;
    }

    public String getJumlahJiwa() {
        return jumlahJiwa;
    }

    public void setJumlahJiwa(String jumlahJiwa) {
        this.jumlahJiwa = jumlahJiwa;
    }
}
