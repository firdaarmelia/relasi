public class Matkul {
    private String kode;
    private String nama;
    private int sks;

    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public void display() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", SKS: " + sks);
    }
}
