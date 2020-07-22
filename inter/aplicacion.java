package inter;

import javax.swing.JOptionPane;

import space.Primario;

public class aplicacion {

public static void main(String[] args) {
		
Primario p = new Primario();
		
    int numero = 0;
    while(numero != 5) {
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite su acciôn" + "\n" + "1: Agreg.Empleado"
    + "\n" + "2: Suprimir empleado" + "\n" + "3: Modific.Empleado" + "\n" + "4: Visualizar Empleados" + "\n" + "5: salir"));
			
	switch (numero) {
	case 1:
	try {
	int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id"));
	String nombre = JOptionPane.showInputDialog("Ingresar Nombre");
	String apellido = JOptionPane.showInputDialog("Ingresar Apellido");
	double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresar salario"));
					
	if(p.agregar(id, nombre, apellido, salario)) {
	JOptionPane.showMessageDialog(null, "Agregado");
					}
	break;
				}
	catch (Exception x) {
	JOptionPane.showMessageDialog(null, x.getMessage());
				}
	break;
				
	case 2:
	try {
	int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id"));
	    if (p.eliminar(id)) {
	    JOptionPane.showMessageDialog(null, "Eliminado");
					}
	break;
				}
	catch (Exception x) {
	JOptionPane.showMessageDialog(null, x.getMessage());
				}
	break;
				
	case 3:
	try {
	int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id"));
	String nombre = JOptionPane.showInputDialog("Ingresar Nombre");
	String apellido = JOptionPane.showInputDialog("Ingresar Apellido");
	double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresar salario"));
					
	if(p.modificar(id, nombre, apellido, salario)) {
	JOptionPane.showMessageDialog(null, "Modificado" );
					}
	break;
				}
	catch (Exception x) {
	JOptionPane.showMessageDialog(null, x.getMessage());
				}
	break;
			
	case 4:
	try {
	JOptionPane.showMessageDialog(null, p.mostrar());
	break;
				}
	catch (Exception x) {
	JOptionPane.showMessageDialog(null, x.getMessage());
				}
	break;
				
	case 5:
	break;
			}
		}

	}

}
