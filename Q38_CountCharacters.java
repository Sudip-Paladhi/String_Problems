package STRING_40;

//Write a java program to count number of characters
//available in each word of a given String?
//Input:- “java is easy” Output:- java=4 is=2 easy=4
public class Q38_CountCharacters {
    public static void main(String[] args) {
        String s = "java is easy";
        char[] ch = s.toCharArray();
        int start = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                find(ch, start, i - 1);
                start = i + 1;
            }
            if (i == ch.length - 1) {
                find(ch, start, i);
            }
        }
    }

    static void find(char[] ch, int i, int j) {
        int count = 0;
        for (int k = i; k <= j; k++) {
            count++;
            System.out.print(ch[k]);
        }
        System.out.println(" = " + count);
    }
}