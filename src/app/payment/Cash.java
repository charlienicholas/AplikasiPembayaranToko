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
        if (this.uangBayar >= total) {
            System.out.println("Pembayaran tunai sebesar Rp." + total + " berhasil");
        } else {
            System.out.println("Uang anda kurang!!!");
        }
    }

}
