package UsingStack;

import java.util.ArrayList;

/**
 *
 * @author Probo Krishnacahya (0706012010039)
 */
public class Stack {

    private ArrayList data = new ArrayList();
    private int top = -1; //indeks dari objek teratas di dalam data

    //method untuk menambahkan data ke dalam stack
    public void push(Object item) {
        data.add(item);
        top++;
    }

    public Object peek() {
        if (top > -1) {
            return data.get(top);
        } else {
            return "Stack is Empty";
        }
    }

    public Object pop() {
        Object temp = data.remove(top);
        top--;
        return temp;
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
