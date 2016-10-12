import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Альвидас on 10.10.2016.
 */
public class CLW {
    public static void main(String[] arg){
        int a1[] = {21, 7, 15, 12};
        Arrays.sort(a1);
        for(int el:a1) {
            System.out.print(el + " ");
        }

        Integer a2[] = {21, 7, 15, 12};
        Arrays.sort(a2, Collections.reverseOrder());
        for(int el:a2) {
            System.out.print(el + " ");
        }

        int m1[][] = {{3,7,2},{8,4}};
        for(int i=0; i<m1.length;i++){
            for(int j=0; j<m1[i].length; j++){
                System.out.println(m1[i][j] + " ");
                System.out.println(i + " " + j + " ");
            }
            System.out.println("");
        }

        for(int row[]:m1){
            for(int elem:row){
                System.out.print(elem + " ");
            }
            System.out.println("");
        }

        int m2[][];
        //...
        m2 = new int[2][];
        //...
        for(int i=0; i<m2.length; i++){
            m2[i] = new int[3];
        }


    }
}
