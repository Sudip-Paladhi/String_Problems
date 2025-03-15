package H;

//Q17: input: “java is very easy” output: avaj si yrev ysae”
public class Q18_ReverseString {
    public static void main(String[] args) {
        String s = "java is very easy";
        int start = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == ' ') {
                reverse(ch, start, i - 1);
                start = i + 1;
            }

            if (i == ch.length - 1) {
                reverse(ch, start, i);
            }
        }
        System.out.println(new String(ch));
    }

    static void reverse(char[] ch, int i, int j) {
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}
