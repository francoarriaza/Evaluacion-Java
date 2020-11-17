package modelo;


import interfaces.IAsesoria;

public class Usuario implements IAsesoria {
	private String nombre;
	private String fechaNacimiento;
	private int run;
	
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 */
	public Usuario(String nombre, String fechaNacimiento, int run) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	
		
	public Usuario() {
	}


	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		
		System.out.println("Nombre Usuario: "+ this.nombre);
		System.out.println("Run Usuario: "+ this.run);
		
	}
	public void  mostrarEdad() {
		System.out.println("Edad: ");
	}
}
