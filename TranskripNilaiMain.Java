public class TranskripNilaiMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("2423040121", "Firda Armelia");

        Matakuliah mk1 = new Matakuliah("IF101", "Pemrograman Dasar", 3);
        Matakuliah mk2 = new Matakuliah("IF102", "Struktur Data", 3);

        KartuHasilStudi khs1 = new KartuHasilStudi("Semester 4");
        khs1.addMatakuliah(mk1);
        khs1.addMatakuliah(mk2);

        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs1);
        transkrip.display();
    }
}
