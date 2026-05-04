package app.service;

import java.util.ArrayList;

import app.model.Produk;
import app.payment.MetodePembayaran;

public class Kasir {

    private double total;
    private ArrayList<Produk> belanja = new ArrayList<>();

    public void tambahProduk(Produk produk){
        this.belanja.add(produk);
        System.out.println(produk.getNama() + " berhasil ditambahkan ke keranjang.");
    }

    public double hitungTotal(){
        for (int i = 0 ; i < belanja.size() ; i++){
            total += this.belanja.get(i).getHarga();
        }
        return total;
    }

    public void lakukanPembayaran(MetodePembayaran mp){
        mp.prosesBayar(this.total);
    }

}
