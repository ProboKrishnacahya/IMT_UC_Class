package UsingStack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class ReverseWords {

    public static void main(String[] args) {
        //1. minta input
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan input sebuah kalimat : ");
        String input = scan.nextLine();
        //2. masukkan input ke stack
        Stack stack = new Stack();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        //3. print isi stack
        while (stack.isEmpty() == false) {
            String output = String.valueOf(stack.pop());
            System.out.print(output);
        }
        System.out.println("");
    }
}
