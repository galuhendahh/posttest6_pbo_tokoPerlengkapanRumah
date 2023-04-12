package Posttest3;

public class PerlengkapanRumah {
    protected String nama, ukuran, stok,bahan;
    public int hargaBeli;
    protected long noKode;
    
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
    
}
