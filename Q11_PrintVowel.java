package H;

//Q11: write a java program to print vowel character in a string?
public class Q11_PrintVowel {
    public static void main(String[] args) {
        String s="sudippaladhi";
        char [] ch= s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' ||ch[i]=='o'|| ch[i]=='u'){
                System.out.println(ch[i]);
            }
        }
    }
}
