package H;

public class Q3_CountWord {
    public static void main(String[] args) {
        String s = "hello hi good by";
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == ' ') {
                count++;
            }
            if (i == ch.length - 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}