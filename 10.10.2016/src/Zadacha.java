import java.io.*;
import java.util.*;

/**
 * Created by Альвидас on 10.10.2016.
 */
public class Zadacha {
    /*
    7 2 4 6
    5 1
    2 3 7 9
    8 2 5 17 20
    ==================
    8 3 7 17 20

    Задана матрица, количество елем не известно, считываем из файла,
    Вывести наибольшей элем из строки.
     */
    public static void main(String[] args) {
        Scanner scan=null;                      //Считаем количество строк.
        int ln = 0;
        try {
            scan = new Scanner(new File("in.txt"));
            while ( scan.hasNext() )
                if (scan.nextLine()!=null) {
                    ++ln;
                }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
            System.exit(1);
        }

        System.out.println("Найдено " + ln + " строки.");
        scan.close();

<<<<<<< HEAD
        String[] line = new String[ln];         // Запись построчно в массив.
=======
        String[] line = new String[ln];// Запись построчно в массив.
>>>>>>> origin/master
        int i = 0;
        try {

            FileReader fr = new FileReader(new File("in.txt"));
            BufferedReader reader = new BufferedReader(fr);
            String lin = reader.readLine();
            while (lin != null) {
                System.out.println(lin);
                line[i] = lin;
                i++;
                lin = reader.readLine();
            }
            fr.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.exit(2);
        } catch (IOException e) {
            System.exit(3);
        }

        int l1[]= new int[ln];
        int matrix[][] = new int[ln][];
        StringTokenizer m1;
        int maxb =0;
        int br[] = new int[ln];
        for(int e=0; e<ln; e++) {           // Разбиваем строку посимвольно.
            m1 = new StringTokenizer(line[e]);
            l1[e] = m1.countTokens();
            br[e] = l1[e];
            if(e<ln) {                      //Находим самую длиную строку.
                if (e==0) {
                    maxb = l1[e];
                }else if(l1[e]>maxb){
                    maxb = l1[e];
                }
            }
        }
        for (int j = 0; j < ln; j++) { //Задаем размер матрицу.
            matrix[j] = new int[br[j]];
        }
        //System.out.println("length = " + matrix.length);
        //System.out.println("[1].length = " + matrix[1].length);

        for(int e=0; e<ln; e++) { //Записываем матрицу.
            m1 = new StringTokenizer(line[e]);
            l1[e] = m1.countTokens();
            int a[] = new int[l1[e]];
            try {
                for (int y = 0; y < l1[e]; y++) {
                    a[y] = Integer.parseInt(m1.nextToken());
                    //System.out.print(a[y] + " ");
                    matrix[e][y] = a[y];
                }
            }catch(NumberFormatException er){
                System.out.println("Вы ввели не число");
                System.exit(4);
            }
        }
        System.out.println(" ");

        for(int row[]:matrix){// Вывод матрицы.
            for(int elem:row){
                System.out.print(elem + " ");
            }
            System.out.println("");
        }

        for(int li=0; li<maxb; li++) {
            System.out.print("==");
        }
        System.out.println("");

        int ch = 0;// Поиск наибольшего числа в строке.
        int max[] = new int[ln];
        for(int h=0; h < matrix.length; h++){
            for(int d=0; d < matrix[h].length; d++){
                ch = matrix[h][d];
                if(ch>max[h]){
                    max[h]=ch;
                }
            }
        }
        for(int el:max) {// Вывод наибольшего числа в строке.

            System.out.print(el + " ");
        }
        System.out.print(" -Наибольшие числа в строке.");
        System.out.println(" ");

        int matrixkv[][] = new int[ln][maxb]; //Прямоугольная матрица.
        for(int h=0; h < matrix.length; h++){
            for(int d=0; d < matrix[h].length; d++){
                matrixkv[h][d] = matrix[h][d];
            }
        }

        int chr = 0; //Поиск наибольшего числа в ряду.
        int maxr[] = new int[maxb];
        for(int hr=0; hr < maxb; hr++){
            for(int dr=0; dr < ln; dr++){
                chr = matrixkv[dr][hr];
                if(chr>maxr[hr]){
                    maxr[hr]=chr;
                }
            }
        }
        for(int el:maxr) {// Вывод наибольшего числа в ряду.

            System.out.print(el + " ");
        }
        System.out.print(" -Наибольшие числа в ряду.");
    }
}
