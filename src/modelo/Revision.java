/**
 * 
 */
package modelo;

/**
 * @author Los Bucles
 *
 */
public class Revision {
	private int identificadorRevision;
	private int identificadorVisitaTerreno;
	private String nombreAlusivoRevision;
	private String detalle;
	private int estado;
	
	
	/**
	 * @param identificadorRevision
	 * @param identificadorVisitaTerreno
	 * @param nombreAlusivoRevision
	 * @param detalle
	 * @param estado
	 */
	public Revision(int identificadorRevision, int identificadorVisitaTerreno, String nombreAlusivoRevision,
			String detalle, int estado) {
		this.identificadorRevision = identificadorRevision;
		this.identificadorVisitaTerreno = identificadorVisitaTerreno;
		this.nombreAlusivoRevision = nombreAlusivoRevision;
		this.detalle = detalle;
		this.estado = estado;
	}
	public int getIdentificadorRevision() {
		return identificadorRevision;
	}
	public void setIdentificadorRevision(int identificadorRevision) {
		this.identificadorRevision = identificadorRevision;
	}
	public int getIdentificadorVisitaTerreno() {
		return identificadorVisitaTerreno;
	}
	public void setIdentificadorVisitaTerreno(int identificadorVisitaTerreno) {
		this.identificadorVisitaTerreno = identificadorVisitaTerreno;
	}
	public String getNombreAlusivoRevision() {
		return nombreAlusivoRevision;
	}
	public void setNombreAlusivoRevision(String nombreAlusivoRevision) {
		this.nombreAlusivoRevision = nombreAlusivoRevision;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	

}
