import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Mahasiswa mahasiswa;
    private List<KartuHasilStudi> khsList;
    private Date tglCetak;
    private double ipk;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.khsList = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void addKHS(KartuHasilStudi khs) {
        khsList.add(khs);
    }

    public double hitungIPK() {
        // Placeholder
        return 0.0;
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak);
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : khsList) {
            khs.display();
        }
    }
}
