package modelo;

import java.sql.Date;

public class Profesional extends Usuario {
	private String titulo;
	private String fechaIngreso;
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 */
	public Profesional(String nombre, String fechaNacimiento, int run) {
		super(nombre, fechaNacimiento, run);
	}


	

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println("Titulo: "+ this.titulo);
		System.out.println("Fecha de Ingreso: "+ this.fechaIngreso);
	}
	
	
	
	
}
