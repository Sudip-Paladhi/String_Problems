package STRING_40;

//input: “happy happy birthday” output: “happy
//birthday”?
public class Q33_Remove_repeatWord {
    public static void main(String[] args) {
        String s = "happy happy birthday";
        String[] s2 = s.split(" ");
        String result = s2[0];
        for (int i = 1; i < s2.length; i++) {
            if (!s2[i].equals(s2[i - 1])) {
                result += " " + s2[i];
            }
        }
        System.out.println(result);
    }
}