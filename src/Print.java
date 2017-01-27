/**
 * Created by David R on 19/12/2016.
 */
public class Print {
    public static String print(int n) {
        // TODO your code here

        StringBuilder sbuilder = new StringBuilder();
        String ln = System.getProperty("line.separator");
        if (n>0 && (n%2)==1){
            for (int i=0; i <n; i=i+2){
                for (int j = (i+1)/2 ; j<n/2; j++){
                    sbuilder = sbuilder.append(" ");
                }
                for (int j = 0; j<=i; j++){
                    sbuilder = sbuilder.append("*");
                }
                sbuilder = sbuilder.append(ln);
            }
            for (int i=n-2; i >=0; i=i-2){
                for (int j = 0; j<=n-i-2; j=j+2){
                    sbuilder = sbuilder.append(" ");
                }
                for (int j = i ; j>=1; j--){
                    sbuilder = sbuilder.append("*");
                }
                sbuilder = sbuilder.append(ln);
            }
        }
        else{
            return null;

        }
        return sbuilder.toString();
    }
}
