/**
 * Created by David R on 19/12/2016.
 */
public class CharCount {
    public static int charCount(String str, char c) {
        // your code here
        int count = 0;
        int length = str.length();

        for (int i =0; i<length; i++){
            char letra = str.charAt(i);
            if (Character.toLowerCase(letra)==Character.toLowerCase(c)){
                count++;
            }
        }
        return count;
    }
}
