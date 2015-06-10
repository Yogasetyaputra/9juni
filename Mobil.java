public class Mobil {
    private String namaMobil;
    private double hargaMobil;
    private int tahunMobil;
    private Pengemudi supirMobil;

    public Mobil(String namaMobil, double hargaMobil, int tahunMobil) {
        this.namaMobil = namaMobil;
        this.hargaMobil = hargaMobil;
        this.tahunMobil = tahunMobil;
        this.supirMobil = supirMobil;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public double getHargaMobil() {
        return hargaMobil;
    }

    public void setHargaMobil(double hargaMobil) {
        this.hargaMobil = hargaMobil;
    }

    public int getTahunMobil() {
        return tahunMobil;
    }

    public void setTahunMobil(int tahunMobil) {
        this.tahunMobil = tahunMobil;
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "namaMobil='" + namaMobil + '\'' +
                ", hargaMobil=" + hargaMobil +
                ", tahunMobil=" + tahunMobil +
                '}';
    }
}

