package STRING_FINAL;
// input: “java is very easy”
// output: avaj si yrev ysay”

public class RearrangeString {
    public static void main(String[] args) {
        String s = "java is very easy";
        char[] ch = s.toCharArray();
        int start = 0;
        for (int i = 0; i <= ch.length; i++) {
            if (i == ch.length || ch[i] == ' ') {
                reversChar(ch, start, i - 1);
                start = i + 1;
            }
        }
        String s1 = new String(ch);
        System.out.println(s1);
    }

    static void reversChar(char[] ch, int i, int j) {
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}
