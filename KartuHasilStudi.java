    import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private List<Matakuliah> matakuliahList;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.matakuliahList = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah mk) {
        matakuliahList.add(mk);
    }

    public void display() {
        System.out.println("Semester: " + semester);
        for (Matakuliah mk : matakuliahList) {
            mk.display();
        }
    }

    public double hitungIPS() {
        // Placeholder
        return 0.0;
    }
}

