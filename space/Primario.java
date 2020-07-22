package space;

import java.util.ArrayList;

public class Primario {
	
private ArrayList<User> list;

public Primario() {
		
	list = new ArrayList<User>();

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
		throw new Exception("No se puede agregar el id ya existe");
		}
	else {
	User nuevo = new User (id, nombre, apellido, salario); 
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
			throw new Exception("No existe, no se puede continuar");
		}
		
	}
	
	
	public String mostrar() {
		String rest  = "";
		for (int i = 0; i < list.size(); i++) {
			rest += list.get(i).toString() + "\n";
		}
		return rest;
	}
}
