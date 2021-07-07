package LOGIN;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class BisaLogin {

    private ArrayList<user> custRak = new ArrayList<user>();

    public user doYourJob() {
        user cust = null;
        while (cust == null) {
            System.out.println("\n==============");
            System.out.println("LOGIN/REGISTER");
            System.out.println("==============\n");
            System.out.print("Please REGISTER (1) / LOGIN (2) before entering the app: ");
            Scanner s = new Scanner(System.in);
            int pilih = s.nextInt();
            if (pilih == 1) {
                register();
            } else {
                cust = login();
                if (cust == null) {
                    System.err.println("Username atau Password yang Anda masukkan salah!");
                }
            }
        }
        return cust;
    }

    public void register() {
        System.out.println("\n===== REGISTER =====");
        Scanner s = new Scanner(System.in);
        System.out.print("Username : ");
        String username = s.nextLine();
        System.out.print("Password : ");
        String pwd = s.nextLine();
        if (username.equals("") || pwd.equals("")) {
            System.err.println("\nInput tidak boleh kosong!\n");
        } else if (pwd.length() < 5) {
            System.err.println("\nPassword tidak boleh < 5 karakter!");
        }
        user newCust = new user();
        newCust.setUsername(username);
        newCust.setPassword(pwd);
        custRak.add(newCust);
    }

    public user login() {
        System.out.println("\n===== LOGIN =====");
        Scanner s = new Scanner(System.in);
        System.out.print("Username : ");
        String username = s.next();
        System.out.print("Password : ");
        String pwd = s.next();
        for (int i = 0; i < custRak.size(); i++) {
            user cust = custRak.get(i);
            if (cust.getUsername().equals(username) && cust.getPassword().equals(pwd)) {
                return cust;
            }
        }
        return null;
    }
}
