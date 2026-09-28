package com.LaraFauzia_F52124015.aplikasi_uts;

public class TemanModel {
    private String nama;
    private String nim;
    private  String hobi;
    private int foto;

    public TemanModel(String nama, String nim, String hobi, int foto){
        this.nama = nama;
        this.nim = nim;
        this.hobi = hobi;
        this.foto = foto;
    }

    public String getNama() { return nama; }
    public String getNim() { return nim;}
    public String getHobi() { return hobi;}
    public int getFoto() {return foto; }

}
