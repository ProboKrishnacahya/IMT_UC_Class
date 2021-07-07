package sistemakademik;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class LoginRegister {

    private ArrayList<Mahasiswa> mhsRak = new ArrayList<Mahasiswa>();

    public Mahasiswa run() {
        Mahasiswa mhs = null;
        while (mhs == null) {
            System.out.println("==============");
            System.out.println("LOGIN/REGISTER");
            System.out.println("==============");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Pilih: ");
            Scanner scan = new Scanner(System.in);
            int pilih = scan.nextInt();
            if (pilih == 1) {
                register();
            } else {
                mhs = login();
                if (mhs == null) {
                    System.out.println("Login Invalid!");
                }
            }
        }
        return mhs;
    }

    public void register() {
        System.out.println("===Register===");
        Scanner scan = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scan.next();
        System.out.print("Password: ");
        String pwd = scan.next();
        Mahasiswa newMhs = new Mahasiswa();
        newMhs.setUsername(username);
        newMhs.setPassword(pwd);
        mhsRak.add(newMhs);

    }

    public Mahasiswa login() {
        System.out.println("===Login===");
        Scanner scan = new Scanner(System.in);
        System.out.print("Username:");
        String username = scan.next();
        System.out.print("Password: ");
        String pwd = scan.next();
        for (int i = 0; i < mhsRak.size(); i++) {
            Mahasiswa mhs = mhsRak.get(i);
            if (mhs.getUsername().equals(username) && mhs.getPassword().equals(pwd)) {
                return mhs;
            }
        }
        return null;
    }
}
