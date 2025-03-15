package H;

//Q28: String = I love python Input: - “java” REPLACE WITH
//“python” Output: - I love java?
public class Q27_ExchangeWord {
    public static void main(String[] args) {
        String s = "I love python";
        String[] s2 = s.split(" ");
        for (int i = 0; i < s2.length; i++) {
            if (s2[i].equals("python")) {
                s2[i] = "java";
            }
        }
        for (int i = 0; i < s2.length; i++) {
            System.out.print(s2[i]);
            if (i != s2.length - 1) System.out.print(" ");
        }
    }
}
