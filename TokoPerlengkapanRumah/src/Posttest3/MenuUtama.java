
package Posttest3;

//import tokoperlengkapanrumah.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUtama {
    static String option, admin;
    static Scanner input = new Scanner(System.in);
    static Furniture F = new Furniture();//OBJEK
    static ArrayList<PerlengkapanRumah> FList;//ARRAYLIST
    static PerlengkapanMasak PM = new PerlengkapanMasak();//OBJEK
    static ArrayList<PerlengkapanRumah> PMList;//ARRAYLIST
    
    public static void menu (){
        Boolean ulang,ulang2;
        System.out.println("\tWELCOME\n");
        ulang = true;
        while (ulang) {
            menuAwal();
            switch (option) {
                case "1":
                ulang2=true;
                while(ulang2){
                Furniture();
                    switch (admin){
                        case "1":
                            F.tambahProduk();
                            break;
                        case "2":
                            F.tampilProduk();
                            break;
                        case "3":
                            F.ubahProduk(FList);
                            break;
                        case "4":
                            F.hapusProduk();
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "2":
                ulang2=true;
                while(ulang2){
                PeralatanMasak();
                    switch (admin){
                        case "1":
                            PM.tambahProduk();
                            break;
                        case "2":
                            PM.tampilProduk();
                            break;
                        case "3":
                            PM.ubahProduk(PMList);
                            break;
                        case "4":
                            PM.hapusProduk();
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "3":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);

                default:
                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                break;
            }
        } 
    }
    public static String Furniture (){
        System.out.println();
        System.out.println("Menu Furniture");
        System.out.println("1. Tambah Produk Furniture");
        System.out.println("2. Tampilkan Produk Furniture");
        System.out.println("3. Edit Produk Furniture");
        System.out.println("4. Hapus Produk Furniture");
        System.out.println("5. Kembali ke Menu Awal");
        System.out.println("6. Exit Program");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    public static String PeralatanMasak (){
        System.out.println();
        System.out.println("Menu Peralatan Masak");
        System.out.println("1. Tambah Produk Peralatan Masak");
        System.out.println("2. Tampilkan Produk Peralatan Masak");
        System.out.println("3. Edit Produk Peralatan Masak");
        System.out.println("4. Hapus Produk Peralatan Masak");
        System.out.println("5. Kembali ke Menu Awal");
        System.out.println("6. Exit Program");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    public static String menuAwal (){
        System.out.println();
        System.out.println("Toko Perlengkapan Rumah");
        System.out.println("1. Produk Furniture");
        System.out.println("2. Produk Peralatan Masak");
        System.out.println("3. Exit Program");
        System.out.print("Masukan Pilihan menu : ");
        option = input.nextLine();
        return option;
    }


    public static void main(String[] args) {
        menu();
    }
}
