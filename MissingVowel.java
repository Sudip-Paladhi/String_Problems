package STRING_FINAL;

//Q31: write a java program to print missing vowels in a string?
public class MissingVowel {
    public static void main(String[] args) {
        String s = "sudippaladhi";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] ch = s.toCharArray();
        for (char vowel : vowels) {
            boolean found = false;

            for (char c : ch) {
                if (vowel == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(vowel + " ");
            }
        }
    }
}
