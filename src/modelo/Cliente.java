package modelo;

import modelo.Usuario;

public class Cliente extends Usuario {

	private int rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;
	
     
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 */
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 * @param rut
	 * @param nombres
	 * @param apellidos
	 * @param telefono
	 * @param afp
	 * @param sistemsaSalud
	 * @param direccion
	 * @param comuna
	 * @param edad
	 */
    
	public Cliente(String nombre, String fechaNacimiento, int run, int rut, String nombres, String apellidos,
			String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, run);
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 */
	
	
	public int getRut() {
		return rut;
	}
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 */
	public Cliente(String nombre, String fechaNacimiento, int run) {
		super(nombre, fechaNacimiento, run);
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	public void setSistemsaSalud(int sistemsaSalud) {
		this.sistemaSalud = sistemsaSalud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		
		System.out.println("Nombre Usuario: "+ getNombre());
		System.out.println("Run Usuario: "+ getRun());
		System.out.println("Direccion: "+ this.direccion);
		System.out.println("Comuna: "+ this.comuna);
		
		
	}
	
	public void obtenerNombre() {
		// TODO Auto-generated method stub
		
		System.out.println("Nombre Cliente: "+ this.nombres+" "+this.apellidos);
		
		
	}
	
	public void  obtenerSistemaSalud() {
		// TODO Auto-generated method stub
		if (this.sistemaSalud==1) {
			System.out.println("Tiene Fonasa");
		} else { 
			System.out.println("Tiene Isapre");
		}
		
	}
	

}
