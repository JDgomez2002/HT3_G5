//Universidad del Valle de Guatemala
//Algoritmos y Estructura de Datos
//Catedrático Douglas Barrios
//Primer Semestre 2022
//José Daniel Gómez Cabrera 21429
//Sofía Lam Méndez 21548
//Lourdes María Saavedra Monterroso 21333
//Sección 41
//Actividad: Hoja de Trabajo 3 
//GRUPO 5

import java.util.*;
import java.io.*;

public class MainG5 {
    public static void main(String[] args) {

        File_Reader r = new File_Reader();
        int[] i = r.leer_archivo(10);
        int longitud = i.length;


        System.out.println("\nDESORDENADO:");
        for(int k = 0; k<longitud ;k++){
            System.out.println(" "+i[k]);
        }
        System.out.println();

        // QuickSort
         QuickSort q = new QuickSort();
         q.quickSort(i, longitud);

        //MergeSort
         MergeSort m = new MergeSort();
         m.mergeSort(i, longitud);

        //BUBBLE SORT
         BubbleSort ob = new BubbleSort();
         int arr[] = i;
         ob.bubbleSort(arr);
         ob.printArray(arr);

        //RadixSort
         RadixSort ra = new RadixSort();
         ra.radixSort(i);
         ra.printArray(i);

        //GnomeSort
         GnomeSort g = new GnomeSort();
         g.gnomeSort(i);

        System.out.println();

    }
}

class File_Reader{

    public int[] leer_archivo(int longitud){
        //3000 o 10
        int indice, num_actual;
        indice = 0;
        int[] lista_ints = new int[longitud];

        try{
            String i = "C:\\Users\\José Daniel Gómez\\Desktop\\UVG\\03 Tercer Semestre\\01 Cursos\\03 Algoritmos y Estructuras de Datos\\HT\\03\\src\\numeros2.txt";
            File myFile = new File(i);
            Scanner scan = new Scanner(myFile);

            String num = "";

            while((scan.hasNextLine())&&(indice<longitud)){
                num_actual = scan.nextInt();
                lista_ints[indice] = num_actual;
                indice ++;
            }
        }
        catch(Exception e){
            String s = "FileReader: leer_numeros(): "+e.getMessage();
            throw new RuntimeException(s);
        }

        return lista_ints;
    }
}
