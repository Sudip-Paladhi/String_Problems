package STRING_40;

import java.util.Scanner;

public class Q42_RearrangeLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int start = 0;
        int current = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                current = i + 1;
                ch[start] = ch[current];
                start = i + 1;
            }
        }
        System.out.println(new String(ch));
    }
}