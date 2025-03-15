package H;

// Q5: write a java program to convert string to char array
// without using in build function?
public class Q5ConvertStringToCharArray {
    public static void main(String[] args) {
        String s = "sudip, paladhi";
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        for (char c : ch) {
            System.out.println(c + " ");
        }
    }
}