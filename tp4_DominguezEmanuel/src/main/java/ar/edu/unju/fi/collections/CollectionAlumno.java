package ar.edu.unju.fi.collections;

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
	
	//Listar Alumnos
	public static List<Alumno> getAlumnos() {
		if(alumnos.isEmpty()) {
			return null;
		}else {
			return alumnos;
		}
	}
	
	//Agregar Alumno
	public static void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	//Eliminar Alumno
	public static void eliminarAlumno(String lu) {
		Iterator<Alumno> iterator = alumnos.iterator();
		while(iterator.hasNext()) {
			Alumno alum = iterator.next();
			if (alum.getLu().equals(lu)) {
				iterator.remove();
			}
		}
	}
	
	//Modificar Alumno
	public static void modificarAlumno(Alumno alumno) {
		for(Alumno alum : alumnos) {
			if(alum.getLu().equals(alumno.getLu())) {
				alum.setDni(alumno.getDni());
				alum.setNombre(alumno.getNombre());
				alum.setApellido(alumno.getApellido());
				alum.setEmail(alumno.getEmail());
				alum.setTelefono(alumno.getTelefono());
				alum.setFechaNacimiento(alumno.getFechaNacimiento());
				alum.setDomicilio(alumno.getDomicilio());
			}else {
				System.out.println("No se encontró al alumno");
			}
		}
	}
	
	//Buscar Alumno
	public static Alumno buscarAlumno(String lu) {
		Predicate<Alumno> filterCodigo = a -> a.getLu().equals(lu);
		Optional<Alumno> alumno = alumnos.stream().filter(filterCodigo).findFirst();
		if(alumno.isPresent()) {
			return alumno.get();
		}else {
			return null;
		}
	}
}
