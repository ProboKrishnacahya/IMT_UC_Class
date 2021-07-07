package sistemakademik;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class SistemAkademik {

    private Mahasiswa currentMhs;

    public void doYourJob() {

        LoginRegister lr = new LoginRegister();
        currentMhs = lr.run();

        int pilih = 0;

        System.out.println("================================");
        System.out.println("SISTEM AKADEMIK UNIVERSITAS XYZ");
        System.out.println("================================");

        while (pilih < 6) {
            //tampilkan menu
            System.out.println("Silakan pilih menu berikut : ");
            System.out.println("1. Tambah Mata Kuliah");
            System.out.println("2. Ubah Mata Kuliah");
            System.out.println("3. Hapus Mata Kuliah");
            System.out.println("4. Lihat Daftar Mata Kuliah");
            System.out.println("5. Hitung Indeks Prestasi Kumulatif");
            System.out.println("6. Keluar");
            System.out.print("Pilih : ");
            Scanner s = new Scanner(System.in);
            pilih = s.nextInt();
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.println("===== Tambah Mata Kuliah =====");
                    //buat objek matkul baru
                    MataKuliah mkbaru = new MataKuliah();

                    Scanner baru = new Scanner(System.in);
                    System.out.print("Nama Mata Kuliah : ");
                    String nama = baru.nextLine();
                    mkbaru.setNama(nama);

                    System.out.print("Jumlah SKS : ");
                    int sks = baru.nextInt();
                    mkbaru.setSKS(sks);

                    System.out.print("Nilai: ");
                    String nilai = baru.next().toUpperCase() + s.nextLine();
                    mkbaru.setNilai(nilai);

                    //mkRak.add(mkbaru);
                    currentMhs.addMataKuliah(mkbaru);

                    System.out.println("Mata kuliah berhasil ditambahkan");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("===== Ubah Mata Kuliah =====");

                    //cek apakah sudah ada mata kuliah yg disimpan
                    //Disimpan == dimasukkan dalam Arraylist
                    if (currentMhs.countMataKuliah() > 0) {
                        currentMhs.lihatMataKuliah();
                    } else {
                        System.out.println("Belum ada Mata Kuliah yang disimpan");
                    }
                    System.out.println("Pilih nomor yang ingin diubah");
                    Scanner ubahScan = new Scanner(System.in);
                    int ubah = ubahScan.nextInt() - 1;

                    MataKuliah mk = currentMhs.getMataKuliah(ubah);

                    System.out.println("Nama Nata Kuliah : " + mk.getNama());
                    System.out.print("Nama Mata Kuliah Baru : ");
                    ubahScan = new Scanner(System.in);
                    String newNama = ubahScan.nextLine();
                    mk.setNama(newNama);
                    //sa.namaMK.set(ubah, newNama);

                    System.out.println("SKS Nata Kuliah : " + mk.getSKS());
                    System.out.print("sks Mata Kuliah Baru : ");
                    ubahScan = new Scanner(System.in);
                    int newSKS = ubahScan.nextInt();
                    mk.setSKS(newSKS);

                    System.out.println("Nilai Nata Kuliah : " + mk.getNilai());
                    System.out.print("Nilai Mata Kuliah Baru : ");
                    ubahScan = new Scanner(System.in);
                    String newNilai = ubahScan.nextLine();
                    mk.setNilai(newNilai);
                    currentMhs.editMataKuliah(ubah, mk);

                    //double newSkor = sa.hitungSkor(a, newSKS);
                    // sa.skorMK.set(ubah, newSkor);
                    System.out.println("Data berhasil diubah");
                    System.out.println("");

                    break;
                case 3:
                    System.out.println("===== Hapus Mata Kuliah =====");
                    //cek apakah sudah ada mata kuliah yg disimpan
                    //Disimpan == dimasukkan dalam Arraylist
                    if (currentMhs.countMataKuliah() > 0) {
                        currentMhs.lihatMataKuliah();
                    } else {
                        System.out.println("Belum ada Mata Kuliah yang disimpan");
                    }
                    System.out.print("Pilih nomor yang ingin diubah");
                    ubahScan = new Scanner(System.in);
                    int hapus = ubahScan.nextInt() - 1;

                    //hapus dari arraylist
//                    sa.namaMK.remove(hapus);
//                    sa.sksMK.remove(hapus);
//                    sa.nilaiMK.remove(hapus);
//                    sa.skorMK.remove(hapus);
                    //mkRak.remove(hapus);
                    currentMhs.deleteMataKuliah(hapus);
                    System.out.println("Data berhasil dihapus");
                    System.out.println("");

                    break;
                case 4:
                    System.out.println("===== Lihat Daftar Mata Kuliah =====");

                    //cek apakah sudah ada mata kuliah yg disimpan
                    //Disimpan == dimasukkan dalam Arraylist
                    if (currentMhs.countMataKuliah() > 0) {
                        currentMhs.lihatMataKuliah();
                        System.out.println("");
                    } else {
                        System.out.println("Belum ada Mata Kuliah yang disimpan");
                    }
                    break;
                case 5:
                    System.out.println("===== Indeks Prestasi Kumulatif =====");

                    double ipk = currentMhs.hitungIPK();
                    System.out.println("IPK = " + ipk);
                    System.out.println("");
                    break;
            }
            System.out.println("");

        }
        System.out.println("Terima kasih telah menggunakan aplikasi ini");
    }

    public double hitungSkor(String newNilai, int newSKS) {
        double newSkor = 0;
        switch (newNilai) {
            case "A":
                newSkor = 4 * newSKS;
                break;
            case "A-":
                newSkor = 3.75 * newSKS;
                break;
            case "B+":
                newSkor = 3.5 * newSKS;
                break;
            case "B":
                newSkor = 3 * newSKS;
                break;
            case "B-":
                newSkor = 2.75 * newSKS;
                break;
            case "C+":
                newSkor = 2.5 * newSKS;
                break;
            case "C":
                newSkor = 2 * newSKS;
                break;
            case "D":
                newSkor = 1 * newSKS;
                break;
            case "E":
                newSkor = 0 * newSKS;
                break;
        }
        return newSkor;
    }
}
