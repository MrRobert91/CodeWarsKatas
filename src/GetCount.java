/**
 * Created by David R on 19/12/2016.
 */
public class GetCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        int length = str.length();

        for (int i = 0; i<length; i++){
            char letra = str.charAt(i);
            //if (letra == 'a') ;
            if (Character.toString(letra).matches("[aeiou]")){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
