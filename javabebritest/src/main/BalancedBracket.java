package main;

import java.util.Stack;

public class BalancedBracket {

	// Method untuk memeriksa apakah kurung dalam string seimbang
    public static String isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        // Iterasi setiap karakter dalam string
        for (char c : str.toCharArray()) {
            // Jika karakter adalah kurung buka, tambahkan ke stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // Jika karakter adalah kurung tutup
            else if (c == ')' || c == ']' || c == '}') {
                // Jika stack kosong atau kurung buka yang sesuai tidak ada di stack
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                    return "NO";
                }
            }
        }

        // Jika stack kosong pada akhir iterasi, berarti semua kurung seimbang
        return "YES";
    }

    // Method untuk memeriksa apakah pasangan kurung sesuai
    private static boolean isMatching(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '[' && closing == ']') ||
               (opening == '{' && closing == '}');
    }

    public static void main(String[] args) {
        String str1 = "{ [ ( ) ] }";
        String str2 = "{ [ ( ] ) }";
        String str3 = " { ( ( [ ] ) [ ] ) [ ] }";

        System.out.println("String "+str1+" seimbang: " + isBalanced(str1));
        System.out.println("String "+str2+" seimbang: " + isBalanced(str2));
        System.out.println("String "+str3+" seimbang: " + isBalanced(str3));
    }
}
