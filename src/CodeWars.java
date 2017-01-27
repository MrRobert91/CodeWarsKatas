
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

/**
 * Created by David R on 17/12/2016.
 */

public class CodeWars {
    public static Double multiply(Double a, Double b) {
        return a * b;
    }


    public static void main(String [] args)
    {

        String[] s = {"EAST", "WEST", "NORTH", "WEST"};

        String[] w = {"NORTH", "SOUTH", "EAST", "WEST"};

        String[] r = {"NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"};
        String[] t = {"NORTH", "SOUTH", "NORTH", "WEST", "EAST", "SOUTH", "WEST", "WEST", "WEST"};

        String [] array = DirReduction.dirReduc(t);
        for(String str : array){
            System.out.println(str);
        }
        //System.out.println(SequenceSum.showSequence(0));

        /*
        //System.out.println(even_or_odd(7));
        String[] a ={"lively", "alive", "harp", "sharp", "armstrong", "robot"};
        String[] b ={"arp", "live", "strong","bot" };
        String [] c =inArray.inArray(b,a);

        String[] e ={"lively", "alive", "harp", "sharp", "armstrong"};
        String[] f ={ };
        String [] g =inArray.inArray(e,f);

        int length = c.length;
        for(String palabra: c ){
            System.out.println(palabra);
        }
        System.out.println("----------------");
        int length2 = g.length;
        for(String palabra2: g ){
            System.out.println(palabra2);
        }
        */


    }

}
