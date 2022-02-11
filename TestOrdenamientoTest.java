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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOrdenamientoTest {

	//variables
	RadixSort r = new RadixSort();
	QuickSort q = new QuickSort();
	MergeSort m = new MergeSort();
	BubbleSort b = new BubbleSort();
	GnomeSort g = new GnomeSort();
	
	int[] i = {1,4,7,3,6,2,5};
	
	int[] orden = {1,2,3,4,5,6,7};

	//pruebas de cada método principal
	@Test
	void testRadixSort() {
		
		r.radixSort(i);
		assertArrayEquals(orden, i);
	}
	
	@Test
	void testGnomeSort() {
		
		g.gnomeSort(i);
		assertArrayEquals(orden,i);
	}	

	@Test
	void testBubbleSort() {
		
		b.bubbleSort(i);
		assertArrayEquals(orden,i);
	}
	
	@Test
	void testMergeSort() {
		
		m.mergeSort(i, 7);
		assertArrayEquals(orden,i);
	}
	
	@Test
	void testQuickSort() {
		
		q.quickSort(i, 7);
		assertArrayEquals(orden,i);
	}
}

