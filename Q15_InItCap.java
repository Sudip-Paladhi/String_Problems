package H;

//Q15: input: RaMana output: rAmANA?
public class Q15_InItCap {
    public static void main(String[] args) {
        String s = "RaMana";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        System.out.println(new String(ch));
    }
}
