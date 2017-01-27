import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

/**
 * Created by David R on 19/12/2016.
 */
public class inArray {
    public static String[] inArray(String[] arr1, String[] arr2) {
        List contiene = new ArrayList<String>();

        for(String palabra1 : arr1){
            for(String palabra2 : arr2){
                if (palabra2.contains(palabra1)&& !contiene.contains(palabra1)){
                    contiene.add(palabra1);
                }
            }
        }

        sort(contiene);
        int length = contiene.size();
        String[] sol = new String[length];
        for (int i=0; i<length; i++){
            sol[i]= (String) contiene.get(i);
        }
        return sol;
    }
}
