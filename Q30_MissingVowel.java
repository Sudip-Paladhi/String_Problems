package H;

//Q31: write a java program to print missing vowels in a string?
public class Q30_MissingVowel {
    public static void main(String[] args) {
        String s = "sudippaladhi";
        char[] ch1 = s.toCharArray();
        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < ch.length; i++) {
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (ch1[j] == ch[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(ch[i]);
            }
        }
    }
}