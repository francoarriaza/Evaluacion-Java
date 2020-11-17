/**
 * 
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import interfaces.IAsesoria;

/**
 * @author Los Bucles
 *
 */
public class Contenedor {
	
	private List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();
	private List<IAsesoria> instancias = new ArrayList<IAsesoria>();
	
	/**
	 * Agregamos un elemento al listado.
	 * @param u1
	 */
	public void almacenarCliente(IAsesoria c) {
		instancias.add(c);
	}
	public void almacenarProfesional(IAsesoria p) {
		instancias.add(p);
	}
	
	public void almacenarAdministrativo(IAsesoria a) {
		instancias.add(a);
	}
	
	public void almacenarCapacitacion(Capacitacion ca) {
		capacitaciones.add(ca);
	}
	
	public void eliminarUsuario(int el) {
	
		IAsesoria uBorrar = new Usuario();
		for (IAsesoria usr : instancias) {
			if (((Usuario)usr).getRun() == el) {
				uBorrar = usr;
				
			}
		}
		instancias.remove(uBorrar);
		
		}
		
    public void listarUsuarios() {
  
    	for (IAsesoria usr : instancias) {
			System.out.println(((Usuario)usr).getNombre());
		}
    	
    }
  
    public void listarUsuariosTipo(String tipo) {
 		for (IAsesoria us : instancias) {
 			System.out.println();
			if (tipo=="Profesional" && us instanceof Profesional) {
				System.out.println("Usuario Profesional");
				System.out.println("===================");
				System.out.println(((Profesional)us).getTitulo());
				System.out.println(((Profesional)us).getFechaIngreso());
			
			}
			if (tipo=="Cliente" && us instanceof Cliente) {
				System.out.println("Usuario Cliente");
				System.out.println("===============");
				System.out.println(((Cliente)us).getRut());
				System.out.println(((Cliente)us).getNombres());
				System.out.println(((Cliente)us).getApellidos());
				System.out.println(((Cliente)us).getTelefono());
				System.out.println(((Cliente)us).getAfp());
				System.out.println(((Cliente)us).getSistemaSalud());
				System.out.println(((Cliente)us).getDireccion());
				System.out.println(((Cliente)us).getComuna());
				System.out.println(((Cliente)us).getEdad());
				
				
			
			}
			
			if (tipo=="Administrativo" && us instanceof Administrativo) {
				System.out.println("Usuario Administrativo");
				System.out.println("======================");
				System.out.println(((Administrativo)us).getArea());
				System.out.println(((Administrativo)us).getExperienciaPrevia());
			
			}
			
		}
    }
	public void listarCapacitaciones() {
		for (Capacitacion capa : capacitaciones) {
 			for (IAsesoria us : instancias) {
 	//			if ((((Cliente)us).getRut())== ((Capacitacion)capa).getRutCliente()) {
 			
 					System.out.println((capa).getIdentificacion());
 					//System.out.println((capa).getIdentificacion());				
 	 		//	}
 			
 		
 			}
		}
	}
	
  }
