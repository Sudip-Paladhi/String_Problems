package H;

//Q10: write a java program to count vowel characters in a
//string?
public class Q10_CountVowel {
    public static void main(String[] args) {
        String s = "sudippaladhi";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Total " + count + " Vowel present in this String.");
    }
}
