package H;

//Q9: input:” Ramana” output:” R@m@n@”?
public class Q9_ReplaceString {
    public static void main(String[] args) {
        String s = "Ramana";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') ch[i] = '@';
        }
        System.out.println(new String(ch));
    }
}
