package H;

//Q26: write a java program to find missing alphabet in a string
//?
//Input: “abc” output:”d e f g h I j k l……….”

public class Q25_FindMissingAlphabet {
    public static void main(String[] args) {
        String s = "abc";
        char[] ch = s.toCharArray();
        for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
            boolean flag = false;
            for (char n : ch) {
                if (n == ch1) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(ch1);
            }
        }
    }
}