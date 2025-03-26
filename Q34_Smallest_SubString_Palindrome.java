package STRING_40;

//write a java program smallest substring palindrome in a
//given string?

public class Q34_Smallest_SubString_Palindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        String smallest = s;
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(s, i, j)) {
                    String result = s.substring(i, j + 1);
                    if (!found || result.length() < smallest.length()) {
                        smallest = result;
                        found = true;
                    }
                }
            }
        }
        if (found) {
            System.out.println(smallest);
        } else {
            System.out.println("not a palindrome number");
        }
    }

    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
