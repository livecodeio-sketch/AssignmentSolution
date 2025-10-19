package Collections;

import java.util.Iterator;
import java.util.Stack;

public class StringReversal {
    public static void main(String[] args) {
        String str = "Goms";
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }

        String res = "";

        while (!st.empty()){
            res += st.pop();
        }

        System.out.println(res);

    }
}
