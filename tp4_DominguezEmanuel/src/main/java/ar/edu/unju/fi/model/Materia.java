package ar.edu.unju.fi.model;

public class Materia {

	private String codigo;
	private String nombre;
	private String curso;
	private byte cantidadHoras;
	private Modalidad modalidad;
	private Docente docente;
	private Carrera carrera;
	
	public Materia() {
		
	}

	public Materia(String codigo, String nombre, String curso, byte cantidadHoras, Modalidad modalidad, Docente docente,
			Carrera carrera) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cantidadHoras = cantidadHoras;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public byte getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(byte cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	
}
