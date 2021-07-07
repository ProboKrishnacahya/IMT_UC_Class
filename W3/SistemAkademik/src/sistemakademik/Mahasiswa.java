package sistemakademik;

import java.util.ArrayList;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class Mahasiswa {

    private ArrayList<MataKuliah> mkRak = new ArrayList<MataKuliah>();
    private String username, password;
    private String nim, nama;

    //getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    //setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String value) {
        password = value;
    }

    public void setNama(String value) {
        nama = value;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    //membuat method unntuk mengakses mkRak
    //nambah mk
    public void addMataKuliah(MataKuliah mk) {
        mkRak.add(mk);
    }

    //mengambil/membaca sebuah MataKuliah
    public MataKuliah getMataKuliah(int index) {
        return mkRak.get(index);
    }

    //jumlah koleksi MataKuliah
    public int countMataKuliah() {
        return mkRak.size();
    }

    //hapus sebuah matakuliah dari rak/koleksi
    public void deleteMataKuliah(int index) {
        mkRak.remove(index);
    }

    //mengubah nilai sebuah matakuliah
    public void editMataKuliah(int index, MataKuliah mk) {
        mkRak.set(index, mk);
    }

    public double hitungIPK() {
        double sumSkor = 0;
        int sumSks = 0;
        for (int i = 0; i < mkRak.size(); i++) {
            MataKuliah mk = mkRak.get(i);
            sumSkor += mk.getSkor();
            sumSks += mk.getSKS();
        }

        return sumSkor / sumSks;
    }

    public void lihatMataKuliah() {
        //loop menampilkan daftar  Mata Kuliah
        for (int i = 0; i < mkRak.size(); i++) {
            //mengambil objek dari mkRak ke-i
            MataKuliah mk = mkRak.get(i);
            System.out.println((i + 1) + ". " + mk.getNama() + " [" + mk.getSKS() + " sks]");
            System.out.println("   " + "Grade : " + mk.getNilai() + "   Score : " + mk.getSkor());
        }
        System.out.println("");
    }
}
