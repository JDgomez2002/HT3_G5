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
import java.util.Vector;
public class RadixSort{
    public static int digit(int n, int d){
        if(d==0) return n % 10;
        else return digit(n/10, d-1);
    }
    public static void bucketPass(int data[], int d){
        int i, j;
        int value;
        Vector<Vector<Integer>> bucket = new Vector<Vector<Integer>>(10);
        bucket.setSize(10);
        for (j = 0; j < 10; j++) bucket.set(j,new Vector<Integer>());
        int n = data.length;
        for (i = 0; i < n; i++)
            {
                value = data[i];
                 j = digit(value,d);
                 bucket.get(j).add(value);
        }
        i = n;
        for (j = 9; j >= 0; j--)
        {
            // unload all values in bucket j
            while (!bucket.get(j).isEmpty())
            {
                i--;
                value = bucket.get(j).remove(j);
                data[i] = value;
            }
        }
    }
     public static void radixSort(int data[]) {
        for (int i = 0; i < 6; i++)
        {
            bucketPass(data,i);
        }
    }
}