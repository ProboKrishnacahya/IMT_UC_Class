package ALAY;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class GetterSetter {

    String nama;
    String jurusan;
    String hobi;
    int NIM;

    //getter
    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getHobi() {
        return hobi;
    }

    public int getNIM() {
        return NIM;
    }

    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public void setNIM(int value) {
        NIM = value;
    }

//    public static String jadiAlay(String kalimatAsli) {
//        char[] huruf = new char[kalimatAsli.length()];
//        for (int i = 0; i < kalimatAsli.length(); i++) {
//            if (kalimatAsli.charAt(i) == 'a' || kalimatAsli.charAt(i) == 'A') {
//                huruf[i] = '4';
//            } else if (kalimatAsli.charAt(i) == 'e' || kalimatAsli.charAt(i) == 'E') {
//                huruf[i] = '3';
//            } else if (kalimatAsli.charAt(i) == 's' || kalimatAsli.charAt(i) == 'S') {
//                huruf[i] = '$';
//            } else if (kalimatAsli.charAt(i) == 'i' || kalimatAsli.charAt(i) == 'I') {
//                huruf[i] = '!';
//            } else if (kalimatAsli.charAt(i) == 'l' || kalimatAsli.charAt(i) == 'L') {
//                huruf[i] = '£';
//            } else {
//                huruf[i] = kalimatAsli.charAt(i);
//            }
//        }
//        String alay = new String(huruf);
//        return alay;
//    }
//
//    public void tampilAlay() {
//        System.out.println("Kalimat alay : " + jadiAlay("aaaa"));
//    }
}
