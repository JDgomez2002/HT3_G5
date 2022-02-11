import java.sql.Time;

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

public class TimeCounter{
    
    private long startTime;
    private long stopTime;
    private long tiempo_total;

    public TimeCounter(){
        tiempo_total = 0;
    }

    public void iniciar(){
        this.startTime = System.currentTimeMillis();;
    }

    public long finalizar(){
        this.stopTime = System.currentTimeMillis();
        this.tiempo_total = (this.stopTime - this.startTime);
        return this.tiempo_total;
    }


}
