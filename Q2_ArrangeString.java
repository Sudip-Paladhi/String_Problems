package H;

//write a java program to arrange a character in a string?
//Input:” ram#123”  output:”123#ram”

public class Q2_ArrangeString {

    public static void main(String[] args) {
        String s= "ram#123";
        String character="";
        String specialCharacter="";
        String number="";
        char [] ch= s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='0' && ch[i]<='9'){
                number+=ch[i];
            }else if(ch[i]>='a' && ch[i]<='z'){
                character+=ch[i];
            }else{
                specialCharacter+=ch[i];
            }
        }
        String s2= number+specialCharacter+character;
        System.out.println(s2);

    }
}