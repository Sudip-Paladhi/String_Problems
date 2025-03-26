package STRING_40;

//write a java program to find missing alphabet in a string
//by using indexOf method?
public class Q40_FindMissingAlphabet {
    public static void main(String[] args) {
        String s = "abc";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                System.out.println(ch);
            }
        }
    }
}
