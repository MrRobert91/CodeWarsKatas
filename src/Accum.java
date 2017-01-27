/**
 * Created by David R on 19/12/2016.
 */
public class Accum {
    public static String accum(String s) {
        // your code
        int length = s.length();
        String acum = "";
        for (int i = 0; i < length; i++){
            for (int j = 0; j<= i; j++) {

                char c = s.charAt(i);
                if (j == 0){
                    char fUpper = Character.toUpperCase(c);
                    acum = acum + fUpper;
                }
                else{
                    char fLower = Character.toLowerCase(c);
                    acum = acum + fLower;
                }
            }
            acum = acum + "-";
        }
        acum = acum.substring(0, acum.length()-1);
        return acum;
    }
}
