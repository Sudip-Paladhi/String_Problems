package H;

//Q27: input:”3124” output:3124 without using parseInt?

public class Q26_StringToCharacter {
    public static void main(String[] args) {
        String s = "3124";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = (result * 10) + (s.charAt(i) - '0');
        }
        System.out.println(result);
    }
}