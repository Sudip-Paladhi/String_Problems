package STRING_40;

//Write a java program to remove space in given String
//without using inbuilt function?
public class Q37_RemoveSpace {
    public static void main(String[] args) {
        String s = "hello my name is sudip paladhi";
        String result = "";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                result += ch[i];
            }
        }
        System.out.println(result);
    }
}