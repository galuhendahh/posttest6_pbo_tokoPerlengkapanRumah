package Posttest6;
import java.util.ArrayList;
import java.util.Scanner;

public class Furniture extends PerlengkapanRumah {
    private final String kodeF = "F"; // Variabel Final
    private long noKodeF;
    
    
    Furniture(String nama, String ukuran, String stok, String bahan, int hargaBeli, long noKode){
        super(nama,ukuran,stok,bahan,hargaBeli,noKode);
    }
    
    Furniture() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    
    Furniture F;
    ArrayList<PerlengkapanRumah> FList = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    @Override
    public void tambahProduk (){// OVERRIDE 1
        boolean ulang=true;
        System.out.println("\nMenambahkan Produk Furniture\n");
        System.out.print("Nama Furniture : ");
        nama = inp.nextLine();
        System.out.print("Ukuran Furniture : ");
        ukuran = inp.nextLine();
        System.out.print("Stok Furniture : ");
        stok = inp.nextLine();
        System.out.print("Bahan Furniture : ");
        bahan = inp.nextLine();
        while(ulang){
            System.out.print("Harga Beli Furniture : ");
            String strHarga=inp.nextLine();
            if (strHarga.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }
            else{
                try{
                    hargaBeli = (Integer.parseInt(strHarga));
                    noKodeF++;
                    System.out.println("No Kode Produk : " + kodeF + noKodeF);
                    F = new Furniture(nama, ukuran, stok, bahan, hargaBeli, noKodeF); // OBJEK ke - 1
                    FList.add(F);
                    System.out.println("\n>> Tambah Data Furniture Berhasil <<");
                    ulang=false;
                }catch(Exception e){
                    System.err.println("Data Yang anda masukkan tidak sesuai");
                }
            }
        }
    }
    @Override
    public final void tampilProduk(){//OVERRIDE 2 // Methode Final
        System.out.println("\nMenampilkan Produk Furniture\n");
        for (int i=0; i<FList.size(); i++){
            System.out.println("No Kode Produk : " + kodeF + FList.get(i).getNoKode());
            System.out.println("Nama Furniture : " + FList.get(i).getNama());
            System.out.println("Ukuran Furniture : " + FList.get(i).getUkuran());
            System.out.println("Harga Beli Produk : Rp" + FList.get(i).hargaBeli);
            System.out.println("Harga Jual Produk : Rp" +
            (FList.get(i).hargaBeli+(FList.get(i).hargaBeli*0.2)));
            System.out.println("Stok Furniture : " + FList.get(i).getStok());
            System.out.println("Bahan Furniture : " + FList.get(i).getBahan());
            System.out.println(" ");
        }
    }
    @Override
    public ArrayList<PerlengkapanRumah> hapusProduk(ArrayList<PerlengkapanRumah> Flist) {//OVERLOADING 1
        System.out.println("\nMenghapus Produk Furniture\n");
        for (int i=0; i<FList.size(); i++){
            System.out.println("No Kode Produk : " + kodeF +
            FList.get(i).getNoKode());
            System.out.println("Nama Furniture : " + FList.get(i).getNama());
            System.out.println(" ");
            // System.out.println("Index ["+i+"] Nama Produk : " + arrMakan.get(i).nama);
        }
        int hapus;
        System.out.print("\nInput No Kode untuk Hapus [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        FList.remove(hapus);
        System.out.println("\n>> Hapus Produk Furniture Berhasil <<\n");
        return FList;
    }
    @Override
    public ArrayList<PerlengkapanRumah> ubahProduk(ArrayList<PerlengkapanRumah> Flist) {// OVERLOADING 2
        int ubah = -1;
        System.out.println("\nMengubah Data Produk Furniture\n");
        if (FList.size() == 0){
            System.out.print("\nDATA KOSONG\n");
        }else if( FList.size() == 1){
            ubah = 0;
        }
        else {
            for (int i=0; i<FList.size(); i++){
                System.out.println("No Kode Produk : " + kodeF +
                FList.get(i).getNoKode());
                System.out.println("Nama Peralatan : " + FList.get(i).getNama());
                System.out.println(" ");
                // System.out.println("Index ["+i+"] Nama Produk : " + arrMakan.get(i).nama);
            }
            System.out.print("\nInput No Kode untuk Edit [Input Angka Belakang] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        if (ubah != -1){
            System.out.print("\nNama Baru : ");
            FList.get(ubah).nama = (inp.nextLine());
            System.out.print("Ukuran Baru : ");
            FList.get(ubah).ukuran = inp.nextLine();
            System.out.print("Stok Baru : ");
            FList.get(ubah).stok = inp.nextLine();
            System.out.print("Bahan Baru : ");
            FList.get(ubah).bahan = inp.nextLine();
            System.out.print("Harga Baru : ");
            FList.get(ubah).hargaBeli = inputInt.nextInt();
            System.out.println("\n>> Edit Data Produk Furniture Berhasil <<\n");
        }
        return FList;
    }
}