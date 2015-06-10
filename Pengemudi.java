public class Pengemudi {
    private String namaPengemudi;
    private int umurPengemudi;

    public Pengemudi(String namaPengemudi, int umurPengemudi) {
        this.namaPengemudi = namaPengemudi;
        this.umurPengemudi = umurPengemudi;
    }

    public String getNamaPengemudi() {
        return namaPengemudi;
    }

    public void setNamaPengemudi(String namaPengemudi) {
        this.namaPengemudi = namaPengemudi;
    }

    public int getUmurPengemudi() {
        return umurPengemudi;
    }

    public void setUmurPengemudi(int umurPengemudi) {
        this.umurPengemudi = umurPengemudi;
    }

    @Override
    public String toString() {
        return "Pengemudi{" +
                "namaPengemudi='" + namaPengemudi + '\'' +
                ", umurPengemudi=" + umurPengemudi +
                '}';
    }
}
