package H;

//Q16: write a java program for initcap of string  input:
//india that is bharat
//output: India That Is Bharat
public class Q16_InItCapString {
    public static void main(String[] args) {
        String s = "india that is bharat ";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 || ch[i - 1] == ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) (ch[i] - 32);
                }
            }
        }
        System.out.println(new String(ch));
    }
}
