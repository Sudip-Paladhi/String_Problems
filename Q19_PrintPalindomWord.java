package H;

//Q18: write a java program to print palindrome words in a
//string?
//Input: eye level car boy? output: eye, level
public class Q19_PrintPalindomWord {
    public static void main(String[] args) {
        String s = "eye level car boy";
        String [] s2=s.split(" ");

        for (int i = 0; i < s2.length; i++) {
            if(isPalindrom(s2[i])){
                System.out.println(s2[i]);
            }

        }
    }

    static boolean isPalindrom(String s) {
        s = s.toLowerCase();
        int i=0;
        int j= s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}