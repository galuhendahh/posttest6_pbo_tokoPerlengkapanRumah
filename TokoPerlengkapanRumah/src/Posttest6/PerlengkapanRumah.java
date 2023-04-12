package Posttest6;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class PerlengkapanRumah {
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
    
    public abstract void tambahProduk();
    public abstract void tampilProduk();
    public abstract ArrayList<PerlengkapanRumah> ubahProduk(ArrayList<PerlengkapanRumah> PRList);
    public abstract ArrayList<PerlengkapanRumah> hapusProduk(ArrayList<PerlengkapanRumah> PRlist);
}
