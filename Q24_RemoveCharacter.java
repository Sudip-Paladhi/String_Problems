package H;

//Q25: input: “ramana” output: rmn?
public class Q24_RemoveCharacter {
    public static void main(String[] args) {
        String s="ramana";
        StringBuilder s2= new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='a'){
                s2.append(s.charAt(i));
            }
        }
        System.out.println(s2);
    }
}
