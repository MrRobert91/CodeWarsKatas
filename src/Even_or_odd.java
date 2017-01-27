/**
 * Created by David R on 19/12/2016.
 */
public class Even_or_odd {
    public static String even_or_odd(int number) {
        //Place code here
        String sol;
        if ((number % 2) == 0) {
            sol = "Even";
        }
        else{
            sol="Odd";
        }
        return sol;

    }
}
