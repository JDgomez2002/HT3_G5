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

//import java.util.Arrays;

public class GnomeSort {
   
    public void gnomeSort(int[] nums) {
    int i=1;
    int j=2;
    
    while(i < nums.length) {
        if ( nums[i-1] <= nums[i] ) 
        {
            i = j; j++;
        } else {
            int tmp = nums[i-1];
            nums[i-1] = nums[i];
            nums[i--] = tmp;
            i = (i==0) ? j++ : i;
        }
    }
    printArray(nums);
    }

    public void printArray(int arr[])
    { 
        System.out.println("ORDENADO");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println((i+1)+" "+arr[i] + " ");
        System.out.println();
    }
}
