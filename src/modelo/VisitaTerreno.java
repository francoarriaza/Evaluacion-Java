/**
 * 
 */
package modelo;

import java.sql.Date;
import java.sql.Time;

/**
 * @author Los Blucles
 *
 */
public class VisitaTerreno {
	private int identificadorVisitaTerreno;
	private int rutCliente;
	private Date dia;
	private Time hora;
	private String lugar;
	private String comentario;
	
	
	/**
	 * @param identificadorVisitaTerreno
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param comentario
	 */
	public VisitaTerreno(int identificadorVisitaTerreno, int rutCliente, Date dia, Time hora, String lugar,
			String comentario) {
		this.identificadorVisitaTerreno = identificadorVisitaTerreno;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentario = comentario;
	}
	public int getIdentificadorVisitaTerreno() {
		return identificadorVisitaTerreno;
	}
	public void setIdentificadorVisitaTerreno(int identificadorVisitaTerreno) {
		this.identificadorVisitaTerreno = identificadorVisitaTerreno;
	}
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	public Date getDia() {
		return dia;
	}
	public void setDia(Date dia) {
		this.dia = dia;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
