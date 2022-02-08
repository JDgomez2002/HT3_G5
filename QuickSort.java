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

public class QuickSort{

    public void quickSort(int data[], int n)
    // post: the values in data[0..n-1] are in ascending order
    {
        quickSortRecursive(data,0,n-1);
    }
    
    public static void swap(int data[], int i, int j)
    // pre: 0 <= i,j < data.length
    // post: data[i] and data[j] are exchanged
    {
    int temp;
    temp = data[i];
    data[i] = data[j];
    data[j] = temp;
    }


    private static int partition(int data[], int left, int right)
    // pre: left <= right
    // post: data[left] placed in the correct (returned) location
    {
        while (true)
        {
        // move right "pointer" toward left
        while (left < right && data[left] < data[right]) right--;
        if (left < right) swap(data,left++,right);
        else return left;
        // move left pointer toward right
        while (left < right && data[left] < data[right]) left++;
        if (left < right) swap(data,left,right--);
        else return right;
        }
    }

    private static void quickSortRecursive(int data[],int left,int right)
    // pre: left <= right
    // post: data[left..right] in ascending order
    {
        int pivot; // the final location of the leftmost value
        if (left >= right) return;
        pivot = partition(data,left,right); /* 1 - place pivot */
        quickSortRecursive(data,left,pivot-1); /* 2 - sort small */
        quickSortRecursive(data,pivot+1,right);/* 3 - sort large */
    }
}