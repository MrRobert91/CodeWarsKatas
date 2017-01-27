import java.util.ArrayList;
import java.util.List;

/**
 * Created by David R on 19/12/2016.
 */
public class SumDigPow {
    public static List<Long> sumDigPow(long a, long b) {

        List<Long> listaFinal = new ArrayList<Long>();

        for (long i=a; i<= b; i++ ){

            List<Long> listaParcial = new ArrayList<Long>() ;
            long nParc = i;

            while (nParc > 0) {

                Long num = nParc % 10;
                listaParcial.add(num);
                nParc= nParc/10;
            }
            int tope = listaParcial.size();
            int exp = listaParcial.size();
            long suma = 0;
            for (int s = 0; s<=tope-1; s++ ){
                //suma = suma + listaParcial.get(s) * (exp);
                suma = (long) (suma + Math.pow(listaParcial.get(s),exp));

                exp--;
            }
            if(suma == i){
                listaFinal.add(suma);
            }

        }
        return listaFinal;
    }
}
