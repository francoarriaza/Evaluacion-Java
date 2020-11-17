package app;

import java.sql.Time;
import modelo.Contenedor;
import java.time.LocalTime;
import java.util.Date;

import interfaces.IAsesoria;
import modelo.Administrativo;
import modelo.Capacitacion;
import modelo.Cliente;
import modelo.Profesional;
import modelo.Usuario;
import modelo.Contenedor;

public class App {

	public static void main(String[] args) {
		Contenedor listado = new Contenedor();
		
		Cliente c1 = new Cliente("Prueba","20/06/1995",11111,22222,"Prueba2","Prueba3","2222222","Modelo",1,"Aqui mismo","Hell",24);
		Profesional p1 = new Profesional("Miguel", "01/05/1970", 3333,"Ingeniero","20/11/2021");
		Administrativo a1 = new Administrativo("Juan", "01/02/1969", 4444,"Contabilidad","No hice bien la contabilidad");
		Capacitacion ca1 = new Capacitacion(111, 3333,"sabado","00:00","En mi casa","una Hora",10);
		int el=3333;
	    String tipoUsuarios="Administrativo";
		
//		listadoddlmacenarCliente(u1);
		listado.almacenarCliente(c1);
		//System.out.println(c1.getNombre());
		
		listado.almacenarProfesional(p1);
		//System.out.println(p1.getNombre());
		
		listado.almacenarAdministrativo(a1);
	//	System.out.println(a1.getNombre());
		
		listado.almacenarCapacitacion(ca1);
	//	System.out.println(ca1.getLugar());
//		listado.analizaTodo();
		
		listado.listarUsuarios();
	    listado.eliminarUsuario(el);
		System.out.println();
		listado.listarUsuarios();
		listado.listarUsuariosTipo(tipoUsuarios);
		listado.listarCapacitaciones();
	}

}
