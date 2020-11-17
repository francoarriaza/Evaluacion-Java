package modelo;

public class Administrativo extends Usuario {
	private String area;
	private String experienciaPrevia;
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 * @param area
	 * @param experienciaPrevia
	 */
	public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the experienciaPrevia
	 */
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	/**
	 * @param experienciaPrevia the experienciaPrevia to set
	 */
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println("Area: "+ this.area);
		System.out.println("Experiencia previa: "+ this.experienciaPrevia);
	}

	
}
