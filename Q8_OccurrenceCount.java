package H;

//Q8: input: “AssmnAN” output: A=2, s=2, m=1, n=1, N=1?
public class Q8_OccurrenceCount {
    public static void main(String[] args) {
        String s = "AssmnAN";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if (ch[i] == '\u0000') continue;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\u0000';
                }
            }
            System.out.println(ch[i] + "= " + count);

        }
    }
}
