package STRING_40;

//input: “abc” output:97+98+99=294?
public class Q36_ConvertToAsciiValueAndAdd {
    public static void main(String[] args) {
        String s = "abc";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = (int) c;
            sum += ascii;
        }
        System.out.println(sum);
    }
}
