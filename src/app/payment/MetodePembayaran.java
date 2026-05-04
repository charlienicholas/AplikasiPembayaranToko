package app.payment;

public abstract class MetodePembayaran {

    private String namaMetode;

    public String getNamaMetode() {
        return namaMetode;
    }   

    public void setNamaMetode(String namaMetode) {
        this.namaMetode = namaMetode;
    }

    abstract void prosesBayar(double total);

}
