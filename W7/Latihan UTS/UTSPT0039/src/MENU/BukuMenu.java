package MENU;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class BukuMenu {

    private ArrayList<Snack> snack = new ArrayList<Snack>();
    private ArrayList<MakanBesar> makanBesar = new ArrayList<MakanBesar>();
    private ArrayList<Minuman> minuman = new ArrayList<Minuman>();

    public void doYourJob() {

        Scanner s = new Scanner(System.in);

        int loop = 1;
        int jenis;
        int pilihanmu;
        long harga;
        String nama;

        while (loop < 3) {
            System.out.println("\n=== SELAMAT DATANG - RUMAH MAKANKU ===");
            System.out.println("-------------------");
            System.out.println("1. Lihat Buku Menu");
            System.out.println("2. Tambah Menu");
            System.out.println("3. Keluar");
            System.out.println("-------------------\n");
            System.out.print("Pilihanmu: ");
            pilihanmu = s.nextInt();
            switch (pilihanmu) {
                case 1:
                    System.out.println("\n===BUKU MENU===");
                    System.out.println("SNACK: ");
                    for (int i = 0; i < snack.size(); i++) {
                        Snack sn = snack.get(i);
                        System.out.println((i + 1) + ". " + sn.getNama() + " - " + sn.getHarga());
                    }
                    System.out.println("MAKAN BESAR: ");
                    for (int i = 0; i < makanBesar.size(); i++) {
                        MakanBesar ma = makanBesar.get(i);
                        System.out.println((i + 1) + ". " + ma.getNama() + " - " + ma.getHarga());
                    }
                    System.out.println("MINUMAN: ");
                    for (int i = 0; i < minuman.size(); i++) {
                        Minuman mi = minuman.get(i);
                        System.out.println((i + 1) + ". " + mi.getNama() + " - " + mi.getHarga());
                    }
                    break;
                case 2:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("\n===TAMBAH MENU===");
                    System.out.print("Nama menu: ");
                    nama = scan.next();
                    System.out.print("Jenis menu ");
                    System.out.print("(1. Snack, 2. Makan Besar, 3. Minuman): ");
                    jenis = scan.nextInt();
                    System.out.print("Harga: ");
                    harga = scan.nextLong();
                    if (jenis == 1) {
                        Snack sn = new Snack();
                        sn.setNama(nama);
                        sn.setHarga(harga);
                        snack.add(sn);
                    } else if (jenis == 2) {
                        MakanBesar ma = new MakanBesar();
                        ma.setNama(nama);
                        ma.setHarga(harga);
                        makanBesar.add(ma);
                    } else {
                        Minuman mi = new Minuman();
                        mi.setNama(nama);
                        mi.setHarga(harga);
                        minuman.add(mi);
                    }
                    System.out.println(">> Selamat! Menu sudah ditambahkan <<");
                    break;
                case 3:
                    System.out.println("\nTerima kasih telah menggunakan RUMAH MAKANKU :) \n");
                    System.exit(0);
            }
        }
    }
}
