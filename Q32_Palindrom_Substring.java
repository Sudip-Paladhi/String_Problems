package STRING_40;

//write a java program to find palindrome substring in a
//program?
//Input: “Malayalam”
//Output: ala, aya, layal, Malayalam

public class Q32_Palindrom_Substring {
    public static void main(String[] args) {
        String s= "malayalam";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(isPalindrom(s,i,j)){
                    System.out.println(s.substring(i,j+1));
                }
            }
        }
    }

    static boolean isPalindrom(String s, int i, int j){
        s=s.toLowerCase();
        while (i<j){
            if(s.charAt(i) !=s.charAt(j))return false;
            i++;
            j--;
        } return true;
    }
}
