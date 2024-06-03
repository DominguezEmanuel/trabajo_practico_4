package ar.edu.unju.fi.collections;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Alumno;

@Component
public class CollectionAlumno {

	private static List<Alumno> alumnos = new ArrayList<Alumno>();
	
	public static List<Alumno> getAlumnos() {
		if(alumnos.isEmpty()) {
			alumnos.add(new Alumno(45253761, "Emanuel", "Dominguez", "dmanu401@gmail.com", "388-5081562", LocalDate.of(2003, 10, 22), "18 Hectáreas", "FCE-005"));
			alumnos.add(new Alumno(44257951, "Martin", "Dominguez", "martincapo10@gmail.com", "388-500741", LocalDate.of(2002, 11, 12), "18 Hectáreas", "FCE-606"));
		}
		return alumnos;
	}
	
	public static void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
}
