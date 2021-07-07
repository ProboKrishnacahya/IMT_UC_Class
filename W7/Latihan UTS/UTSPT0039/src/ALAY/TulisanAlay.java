package ALAY;

import java.util.Scanner;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class TulisanAlay {

    public void doYourJob() {

        Scanner s = new Scanner(System.in);

        int loop = 1;
        int NIM;
        int exit;
        String nama;
        String jurusan;
        String hobi;

        while (loop == 1) {
            System.out.println("\n=====================");
            System.out.println("KONVERSI TULISAN ALAY");
            System.out.println("=====================\n");
            System.out.print("Masukkan NIM: ");
            NIM = s.nextInt();
            System.out.print("Masukkan Nama: ");
            nama = s.next();
            System.out.print("Masukkan Jurusan: ");
            jurusan = s.next();
            System.out.print("Masukkan Hobi: ");
            hobi = s.next();
            
            System.out.println("\n= = = Kalimat Asli = = =");
            System.out.println("Mahasiswa jurusan " + jurusan + " bernama " + nama + " dengan NIM " + NIM + " memiliki hobi " + hobi);
            System.out.println("\n= = = K4£!m4t 4£4y = = =");
            System.out.println("M4h4$!$w4 juru$4n " + jurusan + " b3rn4m4 " + nama + " d3ng4n N!m " + NIM + " m3m!£!k! hob! " + hobi);
            
            System.out.print("\nPilih --> 1. Konversi Lagi  /  0. Exit : ");
            exit = s.nextInt();
            if (exit == 0) {
                System.out.println("\nTerima kasih telah menggunakan KONVERSI TULISAN ALAY :) \n");
                System.exit(0);
            }
        }
    }
}
