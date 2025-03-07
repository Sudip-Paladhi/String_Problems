package STRING_FINAL;

// input:”3124”
// output:3124 without using parseInt?
public class StringToInteger {
    public static void main(String[] args) {
        String s = "3124";
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int digit = ch - '0';
            value = (value * 10) + digit;
        }
        System.out.println(value);
    }
}