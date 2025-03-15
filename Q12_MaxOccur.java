package H;

//Q12: write a java program to maximum occurrence character
//and its count in a string?
//Input: ramana output: a=3?

public class Q12_MaxOccur {
    public static void main(String[] args) {
        String s = "ramana";
        char[] ch = s.toCharArray();
        int maxCount = 0;
        char maxOccur = '\0';

        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if (ch[i] == '\u0000') continue;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\u0000';
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxOccur = ch[i];
            }
        }
        System.out.println(maxOccur + " = " + maxCount);
    }
}
