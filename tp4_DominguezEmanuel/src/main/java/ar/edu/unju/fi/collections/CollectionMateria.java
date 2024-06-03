package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Materia;

@Component
public class CollectionMateria {

	private static List<Materia> materias = new ArrayList<Materia>();
	
	public static List<Materia> getMaterias(){
		if(materias.isEmpty()) {
			System.out.println("La lista de Materias se encuentra vacía, agregue nuevas materias");
		}else {
			//materias.add(new Materia(505, "Introducción a la Economía", "Contaduría", (byte)40, "Virtual", docente, carrera));
			
		}
		return materias;
	}
	
	
}
