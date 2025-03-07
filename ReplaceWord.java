package STRING_FINAL;

//Q28: String = I love python Input: - “java” REPLACE WITH
//“python” Output: - I love java?
public class ReplaceWord {
    public static void main(String[] args) {
        String s = "I Love Python";
        String[] s2 = s.split(" ");
        String s3 = "";
        for (int i = 0; i < s2.length; i++) {
            if (s2[i].equals("Python")) {
                s2[i] = "java";
            }
            s3 += s2[i];
            if (i < s2.length - 1) s3 += " ";
        }
        System.out.println(s3);
    }
}
