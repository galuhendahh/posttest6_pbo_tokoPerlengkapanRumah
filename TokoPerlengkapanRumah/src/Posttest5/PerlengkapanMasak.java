package Posttest5;
import java.util.ArrayList;
import java.util.Scanner;

public class PerlengkapanMasak extends PerlengkapanRumah{
    private final String kodePM = "PM"; // Variabel Final
    private long noKodePM;
    
    
    PerlengkapanMasak(String nama, String ukuran, String stok, String bahan, int hargaBeli, long noKode){
        super(nama,ukuran,stok,bahan,hargaBeli,noKode);
    }
    
    PerlengkapanMasak() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    
    PerlengkapanMasak PM;
    ArrayList<PerlengkapanRumah> PMList = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    @Override
    public void tambahProduk (){
        boolean ulang=true;
        System.out.println("\nMenambahkan Produk Perlengkapan Masak\n");
        System.out.print("Nama Perlengkapan Masak : ");
        nama = inp.nextLine();
        System.out.print("Ukuran Perlengkapan Masak : ");
        ukuran = inp.nextLine();
        System.out.print("Stok Perlengkapan Masak : ");
        stok = inp.nextLine();
        System.out.print("Bahan Perlengkapan Masak : ");
        bahan = inp.nextLine();
        while(ulang){
            System.out.print("Harga Beli Perlengkapan Masak : ");
            String strHarga=inp.nextLine();
            if (strHarga.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }
            else{
                try{
                    hargaBeli = (Integer.parseInt(strHarga));
                    noKodePM++;
                    System.out.println("No Kode Produk : " + kodePM + noKodePM);
                    PM = new PerlengkapanMasak(nama, ukuran, stok, bahan, hargaBeli, noKodePM); // OBJEK ke - 1
                    PMList.add(PM);
                    System.out.println("\n>> Tambah Data Perlengkapan Masak Berhasil <<");
                    ulang=false;
                }catch(NumberFormatException e){
                    System.err.println("Data Yang anda masukkan tidak sesuai");
                }
            }
        }
    }
    @Override
    public final void tampilProduk(){ // Methode Final
        System.out.println("\nMenampilkan Produk Perlengkapan Masak\n");
        for (int i=0; i<PMList.size(); i++){
            System.out.println("No Kode Produk : " + kodePM + PMList.get(i).getNoKode());
            System.out.println("Nama Perlengkapan Masak : " + PMList.get(i).getNama());
            System.out.println("Ukuran Perlengkapan Masak : " + PMList.get(i).getUkuran());
            System.out.println("Harga Beli Produk : Rp" + PMList.get(i).hargaBeli);
            System.out.println("Harga Jual Produk : Rp" +
            (PMList.get(i).hargaBeli+(PMList.get(i).hargaBeli*0.2)));
            System.out.println("Stok Perlengkapan Masak : " + PMList.get(i).getStok());
            System.out.println("Bahan Perlengkapan Masak : " + PMList.get(i).getBahan());
            System.out.println(" ");
        }
    }
    @Override
    public ArrayList<PerlengkapanRumah> hapusProduk(ArrayList<PerlengkapanRumah> PMlist) {
        System.out.println("\nMenghapus Produk Furniture\n");
        for (int i=0; i<PMList.size(); i++){
            System.out.println("No Kode Produk : " + kodePM +
            PMList.get(i).getNoKode());
            System.out.println("Nama Furniture : " + PMList.get(i).getNama());
            System.out.println(" ");
            // System.out.println("Index ["+i+"] Nama Produk : " + arrMakan.get(i).nama);
        }
        int hapus;
        System.out.print("\nInput No Kode untuk Hapus [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        PMList.remove(hapus);
        System.out.println("\n>> Hapus Produk Perlengkapan Masak Berhasil <<\n");
        return PMList;
    }
    @Override
    public ArrayList<PerlengkapanRumah> ubahProduk(ArrayList<PerlengkapanRumah> PMlist) {
        int ubah = -1;
        System.out.println("\nMengubah Data Produk Peralatan Masak\n");
        if(PMList.isEmpty()) {
            System.out.print("\nDATA KOSONG\n");
        }
        else if (PMList.size() == 1){
            ubah = 0;
        } else {
            for (int i=0; i<PMList.size(); i++){
                System.out.println("No Kode Produk : " + kodePM +
                PMList.get(i).getNoKode());
                System.out.println("Nama Peralatan : " + PMList.get(i).getNama());
                System.out.println(" ");
                // System.out.println("Index ["+i+"] Nama Produk : " + arrMakan.get(i).nama);
            }
            System.out.print("\nInput No Kode untuk Edit [Input Angka Belakang] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        if (ubah != -1) {
            System.out.print("\nNama Baru : ");
            PMList.get(ubah).nama = (inp.nextLine());
            System.out.print("Ukuran Baru : ");
            PMList.get(ubah).ukuran = inp.nextLine();
            System.out.print("Stok Baru : ");
            PMList.get(ubah).stok = inp.nextLine();
            System.out.print("Bahan Baru : ");
            PMList.get(ubah).bahan = inp.nextLine();
            System.out.print("Harga Baru : ");
            PMList.get(ubah).hargaBeli = inputInt.nextInt();
            System.out.println("\n>> Edit Data Produk Peralatan Masak Berhasil <<\n");
        }
        return PMList;
    }
}
