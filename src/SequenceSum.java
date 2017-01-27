/**
 * Created by David R on 11/01/2017.
 */
public class SequenceSum{

    public static String showSequence(int value){

        StringBuilder sb = new StringBuilder("");
        int total = 0;
        if (value<0){
            sb.append(value+"<0");
        }
        if(value==0){
            sb.append(value+"=0");
        }
        else {

            for (int i = 1; i <= value; i++) {
                total += i;
                sb.append(i);
                if (i < value) {
                    sb.append("+");
                } else {
                    sb.append(" = ");
                    sb.append(total);
                }
            }
        }

        return sb.toString();
    }

  /*public static void main(String args[]){
    int param=Integer.ParseInt(args[0]);
    SequenceSum.showSequence(param);
  }*/
}
