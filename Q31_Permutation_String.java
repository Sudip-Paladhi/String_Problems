package STRING_40;

//Q35: write all permutation of string “abc” output: “abc”,
//“acb”, “bac”, “bca”, “cba”, “cab”?

public class Q31_Permutation_String {
    public static void main(String[] args) {
        String s = "abc";
        permutation(s, 0, s.length() - 1);
    }

    public static void permutation(String s, int start, int end) {
        if (start == end) {
            System.out.println(s);
            return;
        }

        for (int i = start; i <= end; i++) {
            String s1 = swap(s, start, i);
            permutation(s1, start + 1, end);
        }
    }

    public static String swap(String s, int i, int j) {
        char[] ch = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
}