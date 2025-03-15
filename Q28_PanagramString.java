package H;

//Q29: Write a java program to check two strings are Panagram
//or not?
public class Q28_PanagramString {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        if (inPanagram(s)) {
            System.out.println("Given string is a panagram String");
        } else {
            System.out.println("Given string is not a panagram String");
        }
    }

    static boolean inPanagram(String s) {
        s = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) return false;
        }
        return true;
    }
}
