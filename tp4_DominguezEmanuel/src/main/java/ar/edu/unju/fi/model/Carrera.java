package ar.edu.unju.fi.model;

public class Carrera {

	private String codigo;
	private String nombre;
	private byte cantidadAnios;
	private String estado;
	
	public Carrera() {
		
	}

	public Carrera(String codigo, String nombre, byte cantidadAnios, String estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidadAnios = cantidadAnios;
		this.estado = estado;
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

	public byte getCantidadAnios() {
		return cantidadAnios;
	}

	public void setCantidadAnios(byte cantidadAnios) {
		this.cantidadAnios = cantidadAnios;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
