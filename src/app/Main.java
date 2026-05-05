package app;

import java.util.Scanner;

import app.model.Produk;
import app.payment.Cash;
import app.payment.Ewallet;
import app.payment.KartuKredit;
import app.service.Kasir;

public class Main {

    public static void main(String[] args) {
        
        var input = new Scanner(System.in);
        var kasir = new Kasir();

        System.out.println("Selamat datang di Kasir");
        System.out.print("Masukkan jumlah belanjaan = ");
        int jumlahBelanja = input.nextInt();
        input.nextLine();
        for (int i = 0; i < jumlahBelanja; i++){
            System.out.print((i+1) + ". Nama produk = ");
            String namaProduk = input.nextLine();
            System.out.print("Harga produk = ");
            String hargaProduk = input.nextLine();
            System.out.println();
        
            tambahProduk(new Produk(namaProduk, hargaProduk));
        }

        System.out.println("Menu pembayaran:");
        System.out.println("1. Cash");
        System.out.println("2. E-Wallet");
        System.out.println("3. Kartu Kredit");
        System.out.print("Pilih: ");
        int mp = input.nextInt();
        input.nextLine();


        switch (mp) {
            case 1:
                
                var cash = new Cash();
                break;
        
            default:
                break;
        }
    }

}
