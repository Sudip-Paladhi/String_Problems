package H;

//Q21: input: “easy very is java” output: “java is very easy”
public class Q21_RearrangrString {
    public static void main(String[] args) {
        String s = "easy very is java";
        String[] s2 = s.split(" ");
        String s3 = s2[s2.length - 1];
        for (int i = s2.length - 2; i >= 0; i--) {
            s3 = s3 + " " + s2[i];
        }
        System.out.println(s3);
    }
}