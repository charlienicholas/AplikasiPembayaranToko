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
            double hargaProduk = input.nextDouble();
            input.nextLine();
            kasir.tambahProduk(new Produk(namaProduk, hargaProduk));
            System.out.println();

        }

        kasir.hitungTotal();

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
                System.out.print("Bayar Tunai\nMasukkan jumlah uang = ");
                cash.setUangBayar(input.nextDouble());
                kasir.lakukanPembayaran(cash);
                break;
            case 2:
                var ewallet = new Ewallet();
                System.out.print("E-wallet\nJumlah saldo = ");
                ewallet.setSaldo(input.nextDouble());
                kasir.lakukanPembayaran(ewallet);
                break;
            case 3:
                var kk = new KartuKredit();
                System.out.println("Kartu Kredit");
                kasir.lakukanPembayaran(kk);
                break;
            default:
                break;
        }

        input.close();
    }

}
