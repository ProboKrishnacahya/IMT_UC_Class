package sistemakademik;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class MataKuliah {

    private String nama;
    private int sks;
    private String nilai;
    private double skor;

    //getter
    public String getNama() {
        return nama;
    }

    public int getSKS() {
        return sks;
    }

    public String getNilai() {
        return nilai;
    }

    public double getSkor() {
        return skor;
    }

    //setter
    public void setNama(String value) {
        nama = value;
    }

    public void setSKS(int value) {
        if (value > 0) {
            sks = value;
        } else {
            System.out.println("Nilai sks harus lebih besar 0");
        }
    }

    public void setNilai(String value) {
        switch (value) {
            case "A":
                nilai = value;
                hitungSkor();
                break;
            case "A-":
                nilai = value;
                hitungSkor();
                break;
            case "B+":
                nilai = value;
                hitungSkor();
                break;
            case "B":
                nilai = value;
                hitungSkor();
                break;
            case "B-":
                nilai = value;
                hitungSkor();
                break;
            case "C+":
                nilai = value;
                hitungSkor();
                break;
            case "C":
                nilai = value;
                hitungSkor();
                break;
            case "D":
                nilai = value;
                hitungSkor();
                break;
            case "E":
                nilai = value;
                hitungSkor();
                break;
            default:
                System.out.println("Nilai tidak dikenali!");
                break;
        }
    }

    private void hitungSkor() {
        //double newSkor = 0;
        switch (nilai) {
            case "A":
                skor = 4 * sks;
                break;
            case "A-":
                skor = 3.75 * sks;
                break;
            case "B+":
                skor = 3.5 * sks;
                break;
            case "B":
                skor = 3 * sks;
                break;
            case "B-":
                skor = 2.75 * sks;
                break;
            case "C+":
                skor = 2.5 * sks;
                break;
            case "C":
                skor = 2 * sks;
                break;
            case "D":
                skor = 1 * sks;
                break;
            case "E":
                skor = 0 * sks;
                break;
        }
        //return newSkor;
    }
}
