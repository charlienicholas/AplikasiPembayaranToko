package app.payment;

public class Ewallet extends MetodePembayaran {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void prosesBayar(double total){
        if (this.saldo >= total){
            this.saldo -= total;
            System.out.println("Pembayaran berhasil, saldo berkurang Rp." + total + ". Tersisa Rp." + this.saldo);
        } else {
            System.out.println("Pembayaran gagal, saldo anda tidak cukup!!!");
        }
    }

}
