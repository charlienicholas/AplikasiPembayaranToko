package app.payment;

public class KartuKredit extends MetodePembayaran {

    public void prosesBayar(double total){
        double admin = total/100*2;
        total += admin;

        System.out.println("Pembayaran berhasil dengan total Rp." + total + ". Dengan biaya admin Rp." + admin + ".");
    }

}
