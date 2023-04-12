package Posttest4;

import java.util.ArrayList;
import java.util.Scanner;

public class PerlengkapanRumah {
    protected String nama, ukuran, stok,bahan;
    public int hargaBeli;
    protected long noKode;
    String kode = "PR";
    
    PerlengkapanRumah(String nama, String ukuran, String stok, String bahan, int hargaBeli, long noKode){
        this.nama = nama;
        this.ukuran = ukuran;
        this.stok = stok;
        this.bahan = bahan;
        this.hargaBeli = hargaBeli;
        this.noKode = noKode;
    }
    
    PerlengkapanRumah() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    
    public String getNama() {
        return nama;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getStok() {
        return stok;
    }

    public String getBahan() {
        return bahan;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }
    
    public long getNoKode() {
        return noKode;
    }
    PerlengkapanRumah PR;
    ArrayList<PerlengkapanRumah> PRList = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    public void tambahProduk(){
        System.out.println("\nMenambahkan Produk\n");
    }
    public void tampilProduk(){
        System.out.println("\nMenampilkan Produk\n");
    }
    public ArrayList<PerlengkapanRumah> ubahProduk(ArrayList<PerlengkapanRumah> PRList) {
        return PRList;
    }
    public ArrayList<PerlengkapanRumah> hapusProduk(ArrayList<PerlengkapanRumah> PRlist) {//OVERLOADING 1
        System.out.println("\nMenghapus Produk\n");
        return PRlist;
    }
}
