package H;

//Q22: write a java program to print words in a given string,
//input: “Java Is Very Easy”
//Output: Java
//Is
//Very
//Easy
public class Q22_PrintWord {

    public static void main(String[] args) {
        String s = "Java Is Very Easy";
        String[] s2 = s.split(" ");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
    }

}
