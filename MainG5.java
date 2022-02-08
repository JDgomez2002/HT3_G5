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
        Num_aleatorios n = new Num_aleatorios();
        int[] i = n.generar_numeros();
        for(int k = 0; k<i.length ;k++){
            System.out.println((k+1)+" "+i[k]);
        }
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
        int[] ints = new int[3000];

        try{
            
            String i = "numeros.txt";
            File myFile = new File(i);
            Scanner scan = new Scanner(myFile);

            String j = "";
            int o = 0;
            int indice = 0;

            while((scan.hasNextLine()&&(indice<3000))){
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