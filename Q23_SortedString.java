package H;

//Q23: input: “ccaabbd” output: “aabbccd” (sort given string)?

public class Q23_SortedString {
    public static void main(String[] args) {
        String s = "ccaabbd";
        char[] ch = s.toCharArray();

        for (int i = 1; i < ch.length; i++) {
            char key = ch[i];
            int j = i - 1;
            while (j >= 0 && ch[j] > key) {
                ch[j + 1] = ch[j];
                j--;
            }
            ch[j + 1] = key;
        }
        //for (char n : ch) {
            System.out.println(ch);
        //}
    }
}
