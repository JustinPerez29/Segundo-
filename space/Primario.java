package space;

import java.util.ArrayList;
import java.util.Comparator;

public class Primario {
	
private ArrayList<User> list;

public Primario() {
		
	list = new ArrayList<User>();
	list.add(new User( 1,"Antonio", "Preciado", 1400000.1));
        list.add(new User(2, "Bruno", "Casas", 1500000.1));
        list.add(new User(10,"Alvaro", "Apita",  700000.1));
        list.add(new User(4,"Alejandro", "Torres",  400000.2));
        list.add(new User(11,"Geraldine", "Gomèz",  600000.2));
        list.add(new User(15,"Jesus", "Fonseca",  500000.6));

	}
	
public ArrayList<User> darLista(){
	return list;
	}
	
public User buscarEmpleado( int id ) {
		
	for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return list.get(i);
			}
		}
	return null;
	}
	
public boolean agregar(int id, String nombre, String apellido, double salario) throws Exception {
	if (buscarEmpleado(id) != null) {
	throw new Exception("Imposible agregarlo, id existente");
		}
	else {
	User nuevo = new User(id, nombre, apellido, salario); 
	list.add(nuevo);
	return true;
		}
	}
	
	
public boolean eliminar( int id) throws Exception{
	User eliminar = buscarEmpleado(id);
	if (eliminar != null) {
	list.remove(eliminar);
	return true;
		}
	else {
	throw new Exception("Error usuario no existente, id incorrecto/usuario borrado");
		}
	
	}
	
	
public boolean modificar(int id, String nombre, String apellido, double salario)throws Exception {
		
	User amodificar = buscarEmpleado(id);
	if (amodificar != null) {
	amodificar.setNombre(nombre);
	amodificar.setApellido(apellido);
	amodificar.setSalario(salario);
	return true;
		}
	else {
	throw new Exception("No existe,imposible continuar");
		}
		
	}
	
public String empleadoMayorSalar() {
	return list.stream()
        .max(Comparator.comparing(User::getSalario))
        .map(User::toString)
        .orElse("Sin empleados");
	}
	
public String empleadoMenorSalar() {
	return list.stream()
        .min(Comparator.comparing(User::getSalario))
        .map(User::toString)
        .orElse("Sin empleados");
	}
	
public String ordenarNombre() {
         String rest = "";
	  rest = list.stream()
        .sorted(Comparator.comparing(User::getNombre))
        .map(User::toString)
        .reduce(" ", (a,b) -> {
        	return a+"\n"+b; 
        });
		
		return rest;
	}
	
public long mostrarTotalDeNombresPorletrA() {
	return list.stream()
        .filter(empleado -> empleado.getApellido().toUpperCase().startsWith("A"))
        .count();
		
	}
	
public String cincoEmpleadosMayorSalar() {
	 return list.stream()
        .sorted(Comparator.comparing(User::getSalario).reversed())
        .map(User::toString)
        .limit(5)
        .reduce(" ", (a,b) -> {
         return a+"\n"+b; 
                });
	}
	
public double sumaSalariosMayorSete() {
	return list.stream().filter((list) -> {
	return list.getSalario() > 700000;
		})
	.map(User::getSalario)
	.reduce(0.0, (a,b) ->{
	return a+b;
		});
	}
	
public String mostrar() {
	String rest  = "";
	for (int i = 0; i < list.size(); i++) {
	rest += list.get(i).toString() + "\n";
		}
	return rest;
	}
}
