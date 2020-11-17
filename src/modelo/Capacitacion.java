/**
 * 
 */
package modelo;

import java.sql.Time;
import java.time.LocalTime;

import interfaces.IAsesoria;

/**
 * @author Los Bucles
 *
 */
public class Capacitacion {
		private int identificacion;
		private int rutCliente;
		private String dia;
		private String hora;
		private String lugar;
		private String duracion;
		private int cantidadAsistentes;
		
		
		/**
		 * @param identificacion
		 * @param rutCliente
		 * @param dia
		 * @param localTime
		 * @param lugar
		 * @param duracion
		 * @param cantidadAsistentes
		 */
			
		public Capacitacion() {
		}

		public Capacitacion(int identificacion, int rutCliente, String dia, String hora, String lugar,
				String duracion, int cantidadAsistentes) {
			this.identificacion = identificacion;
			this.rutCliente = rutCliente;
			this.dia = dia;
			this.hora = hora;
			this.lugar = lugar;
			this.duracion = duracion;
			this.cantidadAsistentes = cantidadAsistentes;
		}

		public int getIdentificacion() {
			return identificacion;
		}
		public void setIdentificacion(int identificacion) {
			this.identificacion = identificacion;
		}
		public int getRutCliente() {
			return rutCliente;
		}
		public void setRutCliente(int rutCliente) {
			this.rutCliente = rutCliente;
		}
		public String getDia() {
			return dia;
		}
		public void setDia(String dia) {
			this.dia = dia;
		}
		public String getHora() {
			return hora;
		}
		public void setHora(String hora) {
			this.hora = hora;
		}
		public String getLugar() {
			return lugar;
		}
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}
		public String getDuracion() {
			return duracion;
		}
		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}
		public int getCantidadAsistentes() {
			return cantidadAsistentes;
		}
		public void setCantidadAsistentes(int cantidadAsistentes) {
			this.cantidadAsistentes = cantidadAsistentes;
		}
		
		public void mostrarDetalle() {
			System.out.println("La capacitacion sera en: "+this.lugar+" a las "+ this.hora+" del Dia "+this.dia+" y durara "+this.duracion);
			
		}
		public void almacenarCapacitacion() {
			
		}


		public void analizarUsuario() {
			// TODO Auto-generated method stub
			
		}

}