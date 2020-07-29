package inter;

import javax.swing.JOptionPane;

import space.Primario;

public class aplicacion {

public static void main(String[] args) {
        
Primario p = new Primario();

    int numero = -1;
    try {
    while (numero != 0) {
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite su acciôn" + "\n" + "1: Agreg.Empleado"
    + "\n" + "2: Suprimir empleado" + "\n" + "3: Modific.Empleado" + "\n" + "4: Visualizar Empleados" + "\n" + "5: Empl.mayor salario"
           + "\n" + "6: Emple.menor salario        " + "7: Ord.nombre la lista"  + "\n" +  "8:Apellidos por la letra 'A'        " +   "9: 5 emple.mayor salario" + "\n" + "10: Suma.salarios mayores a 700.000"));

       switch (numero) {
       case 1:
       try {
       int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id"));
       String nombre = JOptionPane.showInputDialog("Ingresar Nombre");
       String apellido = JOptionPane.showInputDialog("Ingresar Apellido");
       double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresar salario"));

        if (p.agregar(id, nombre, apellido, salario)) {
        JOptionPane.showMessageDialog(null, "Agregado");
                            }
        break;
        } catch (Exception x) {
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
          } catch (Exception x) {
        JOptionPane.showMessageDialog(null, x.getMessage());
                        }
        break;

        case 3:
        try {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id"));
        String nombre = JOptionPane.showInputDialog("Ingresar Nombre");
        String apellido = JOptionPane.showInputDialog("Ingresar Apellido");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresar salario"));

        if (p.modificar(id, nombre, apellido, salario)) {
        JOptionPane.showMessageDialog(null, "Modificado");
                            }
        break;
        } catch (Exception x) {
        JOptionPane.showMessageDialog(null, x.getMessage());
                        }
        break;

        case 4:
        try {
        JOptionPane.showMessageDialog(null, p.mostrar());
        break;
        } catch (Exception x) {
        JOptionPane.showMessageDialog(null, x.getMessage());
                        }
        break;

        case 5:
         try {
        JOptionPane.showMessageDialog(null, p.empleadoMayorSalar());
        } catch (Exception x) {

                        }
         break;

        case 6:
        try {
        JOptionPane.showMessageDialog(null, p.empleadoMenorSalar());
        } catch (Exception x) {
        JOptionPane.showMessageDialog(null, "Error, algo salio mal");
                        }
        break;

        case 7:
        try {
        JOptionPane.showMessageDialog(null, p.ordenarNombre());
        } catch (Exception x) {
        JOptionPane.showMessageDialog(null, "Error, algo salio mal");
                        }
        break;

        case 8:
        try {
        JOptionPane.showMessageDialog(null, p.mostrarTotalDeNombresPorletrA());
        } catch (Exception x) {
        JOptionPane.showMessageDialog(null, "Error, algo salio mal");
                        }
        break;

       case 9:
       try {
       JOptionPane.showMessageDialog(null, p.cincoEmpleadosMayorSalar());
       } catch (Exception x) {
       JOptionPane.showMessageDialog(null, "Error, algo salio mal");
                        }
        break;

        case 10:
        try {
        JOptionPane.showMessageDialog(null, p.sumaSalariosMayorSete());
        } catch (Exception x) {
        JOptionPane.showMessageDialog(null, "Error, algo salio mal");
                        }
                }
            }
       } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "FAIL, REVISAR LA ACCIÔN REALIZADA");
        }
    }
}

