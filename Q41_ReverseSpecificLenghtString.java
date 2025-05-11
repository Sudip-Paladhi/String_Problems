package STRING_40;

public class Q41_ReverseSpecificLenghtString {
    public static void main(String[] args) {
        String s = "hello java is powerful language";
        String[] s2 = s.split(" ");
        String finalResult = "";
        int n = 5;
        for (int i = 0; i < s2.length; i++) {
            if (s2[i].length() >= n) {
                finalResult += reverse(s2[i]);
            } else {
                finalResult += s2[i];
            }

            if (i != s2.length - 1) {
                finalResult += " ";
            }
        }

        System.out.println(finalResult);
    }

    static String reverse(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String s2 = new String(ch);
        return s2;
    }
}
