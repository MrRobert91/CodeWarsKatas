import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by David R on 20/12/2016.
 */
public class DirReduction {
    public static boolean oposite (String dir1, String dir2){
        if((dir1.equals("NORTH") && dir2.equals("SOUTH") )|| (dir1.equals("SOUTH") && dir2.equals("NORTH"))){
            return true;
        }
        if((dir1.equals("EAST") && dir2.equals("WEST")) || (dir1.equals("WEST") && dir2.equals("EAST"))){
            return true;
        }

        return false;
    }
    public static int countMovesNS (String dir1, int sumNS){

        if((dir1.equals("NORTH"))){
            return (sumNS+1);
        }
        if((dir1.equals("SOUTH"))){
            return (sumNS-1);
        }
        else return sumNS;

    }
    public static int countMovesEW (String dir1, int sumWS){

        if((dir1.equals("EAST"))){
            return (sumWS+1);
        }
        if((dir1.equals("WEST"))){
            return (sumWS-1);
        }
        else return sumWS;

    }


    //Reduce el numero de direcciopnes a las minimas imprescindibles
    //para llegar al mismo destino que las originales, sin importar el camino
    public static String[] superDirReduc(String[] arr) {

        int sumNS = 0;
        int sumEW = 0;

        ArrayList<String> dirList= new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> resultadoList= new ArrayList<>();
        /*
        for (int i=0; i<dirList.size()-1; i++){
            for (int j=0; j<dirList.size()-1; j++){
                if(oposite(dirList.get(i),dirList.get(j)) && (j!=i)){
                    dirList.remove(i);
                    dirList.remove(j);

                }
            }
        }*/
        for (int i=0; i<=dirList.size()-1; i++){

            if(dirList.get(i).equals("NORTH") || dirList.get(i).equals("SOUTH")){
                sumNS = countMovesNS(dirList.get(i),sumNS);
            }
            else if(dirList.get(i).equals("EAST") || dirList.get(i).equals("WEST")){
                sumEW = countMovesEW(dirList.get(i),sumEW);
            }

        }
        System.out.println("sumNS: "+sumNS);
        System.out.println("sumEW: "+sumEW);



        if((sumNS>0)){
            for(int i=0;i<sumNS; i++){
                resultadoList.add("NORTH");
            }
        }
        else if((sumNS<0)){
            for(int i=0;i<Math.abs(sumNS); i++){
                resultadoList.add("SOUTH");
            }
        }

        if((sumEW>0)){
            for(int i=0;i<sumEW; i++){
                resultadoList.add("EAST");
            }
        }
        else if((sumEW<0)){
            for(int i=0;i<Math.abs(sumEW); i++){
                resultadoList.add("WEST");
            }
        }

        String[] arrayResultado = resultadoList.toArray(new String[0]);

        return arrayResultado;



    }

    public static String[] dirReduc(String[] arr) {


        ArrayList<String> dirList= new ArrayList<>(Arrays.asList(arr));

        boolean done = false;
        int indice = 0;

        while (done == false ){
            if(oposite(dirList.get(indice),dirList.get(indice+1)) && indice+1<=dirList.size()-1){
                dirList.remove(indice);
                dirList.remove(indice);//Se ha borrado el anterior, y el indice es uno menos
                indice = 0;
            }
            else{
                indice=indice+1;
            }

            int longitud = dirList.size();
            if(indice >= longitud-1){
                done = true;
            }
        }

        String[] arrayResultado = dirList.toArray(new String[0]);

        return arrayResultado;



    }




    public static void main(String [] args) {

        System.out.println("Heyyy");

        String [] direction = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String [] result = dirReduc(direction);

        for (String dir : result){
            System.out.println(dir);
        }



    }
    }
