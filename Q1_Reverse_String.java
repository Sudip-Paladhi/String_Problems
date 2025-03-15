package H;

public class Q1_Reverse_String {
    public static void main(String[] args) {
        String s= "sudippaladhi";
        char [] ch= s.toCharArray();
        int i=0;
        int j= ch.length-1;
        while (i<j){
            char ch1= ch[i];
            ch[i]=ch[j];
            ch[j]=ch1;
            i++;
            j--;
        }

        String s1= new String(ch);
        System.out.println(s1);
    }
}