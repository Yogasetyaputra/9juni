public class TestMobil {
    public static void main (String[] args) {
        Pengemudi yoga = new Pengemudi ("Yoga Setya Putra",20,"Avanza");
        System.out.println("Semua data : " + yoga.toString());
        System.out.println("Nama pengemudi : " + yoga.getNamaPengemudi());
        System.out.println("Umur pengemudi : " + yoga.getUmurPengemudi());
        System.out.println("Jenis Mobil : " + yoga.getNamaMobil());
    }
}
