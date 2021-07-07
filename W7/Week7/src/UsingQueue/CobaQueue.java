package UsingQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class CobaQueue {

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        String again = "y";
        while (again.equalsIgnoreCase("y")) {
            Scanner s = new Scanner(System.in);
            System.out.print("Masukkan angka : ");
            String input = s.next();
            q.add(input);
            System.out.print("Lagi? ");
            again = s.next();
        }
        while (q.isEmpty() == false) {
            String output = String.valueOf(q.poll());
            System.out.println(output);
        }
    }
}
