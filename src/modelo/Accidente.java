/**
 * 
 */
package modelo;

import java.sql.Date;
import java.sql.Time;

/**
 * @author Los Bucles
 *
 */
public class Accidente {
	private int identificadorAccidente;
	private int rutCliente;
	private Date dia;
	private Time hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	/**
	 * @param identificadorAccidente
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param origen
	 * @param consecuencias
	 */
	public Accidente(int identificadorAccidente, int rutCliente, Date dia, Time hora, String lugar, String origen,
			String consecuencias) {
		this.identificadorAccidente = identificadorAccidente;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}
	public int getIdentificadorAccidente() {
		return identificadorAccidente;
	}
	public void setIdentificadorAccidente(int identificadorAccidente) {
		this.identificadorAccidente = identificadorAccidente;
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
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getConsecuencias() {
		return consecuencias;
	}
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}
	
	

}
