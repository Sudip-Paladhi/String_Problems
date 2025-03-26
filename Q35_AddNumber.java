package STRING_40;

//input: “acb243d10” output:213+10=253?
public class Q35_AddNumber {
    public static void main(String[] args) {
        String s = "acb243d10";
        char[] ch = s.toCharArray();
        int result = 0;
        int sum = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                result = (result * 10) + (ch[i] - '0');
            } else {
                sum += result;
                result = 0;
            }

            if (i == ch.length - 1) {
                sum += result;
            }
        }
        System.out.println(sum);
    }
}