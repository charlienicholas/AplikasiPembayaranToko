package app.payment;

public class Cash extends MetodePembayaran {

    private double uangBayar;

    public double getUangBayar() {
        return uangBayar;
    }

    public void setUangBayar(double bayar){
        this.uangBayar = bayar;
    }

    public void prosesBayar(double total){
        System.out.println("Pembayaran tunai sebesar Rp." + total + " berhasil");
    }

}
