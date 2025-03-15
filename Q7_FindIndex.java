package H;

//Q7: write a java program to find index value “ash123” where
//key=’s’?

public class Q7_FindIndex {
    public static void main(String[] args) {
        String s = "ash123";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='s') {
                System.out.println(c + " index value is : " + i);
            }
        }
    }
}
