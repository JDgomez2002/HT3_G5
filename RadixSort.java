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

import java.util.ArrayList;
import java.util.List;

public class RadixSort{

    public void radixSort(int[] input) { 

        final int RADIX = 10; 
        // declare and initialize bucket[] 
        List<Integer>[] bucket = new ArrayList[RADIX]; 
        for (int i = 0; i < bucket.length; i++) { 
            bucket[i] = new ArrayList<Integer>(); 
        } 
        // sort 
        boolean maxLength = false; 
        int tmp = -1, placement = 1; 
        while (!maxLength) { 
            maxLength = true; 
            // split input between lists 
            for (Integer i : input) { 
                tmp = i / placement; 
                bucket[tmp % RADIX].add(i); 
                if (maxLength && tmp > 0) { 
                    maxLength = false; } } 
                    // empty lists into input array 
                    int a = 0; for (int b = 0; b < RADIX; b++) { 
                        for (Integer i : bucket[b]) { input[a++] = i;
                        } 
                        bucket[b].clear();
                    } 
                    // move to next digit 
                    placement *= RADIX;
                }
            } 

    public void printArray(int arr[])
    { 
        System.out.println("RADIXSORT");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println((i+1)+" "+arr[i] + " ");
        System.out.println();
    }
}
