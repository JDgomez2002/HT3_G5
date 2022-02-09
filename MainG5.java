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
import java.io.File;

/**
 * Clase MAIN
 */
public class MainG5{
    public static void main(String[] args) {
        FileReader r = new FileReader();
        int[] i = r.leer_archivo();
        System.out.println("\tDESORDENADO:");
        for(int k = 0; k<i.length ;k++){
            System.out.println((k+1)+" "+i[k]);
        }
        System.out.println();

        //QuickSort
        //QuickSort q = new QuickSort();
        //q.quickSort(i, 10);

        //MergeSort
        //MergeSort m = new MergeSort();
        //m.mergeSort(i, 10);

        //BUBBLE
        //BubbleSort ob = new BubbleSort();
        //int arr[] = i;
        //ob.bubbleSort(arr);
        //System.out.println("Sorted array:");
        //ob.printArray(arr);

        //RadioxSort
        //RadixSort ra = new RadixSort();
        //ra.radixSort(i);
        //ra.printArray(i);

        //GnomeSort
        //GnomeSort g = new GnomeSort();
        //g.gnomeSort(i);
    
    } 
}

class Num_aleatorios{

    public int[] generar_numeros(){
        int[] numeros = new int[3000];
        int n = 0;
        for(int k = 0; k<3000 ;k++){
            boolean encontrado = true;
            while(encontrado){
                Random r = new Random();
                n = r.nextInt(3000);
                if((n>9)&&(n<3000)){
                    numeros[k] = n;
                    encontrado = false;
                }
                
            }
        }
        return numeros;
    }
}

class FileReader{
    
    public int[] leer_archivo(){
        //3000 o 10
        int longitud = 10; 
        int[] ints = new int[longitud];

        try{
            
            String i = "numeros2.txt";
            File myFile = new File(i);
            Scanner scan = new Scanner(myFile);

            String j = "";
            int o = 0;
            int indice = 0;

            while((scan.hasNextLine()&&(indice<longitud))){
                j = scan.nextLine();
                o = Integer.parseInt(j);
                ints[indice] = o;
                indice += 1;
            }

        }
        catch(Exception e){
            String s = "FileReader: leer_numeros(): "+e.getMessage();
            throw new RuntimeException(s);
        }

        return ints;
    }
}