import conexionDB.conexion;

import java.util.List;
import java.util.Scanner;
import modelos.empleado;
import modelos.producto;
import DAO.empleadoDAO;
import DAO.productoDAO;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        empleado empleado = new empleado();
        conexion conexion = new conexion();
        empleadoDAO empleadoDAO = new empleadoDAO(conexion);

        producto producto = new producto();
        conexion conexion1 = new conexion();
        productoDAO productoDAO = new productoDAO(conexion);

        //***
        int opcion;
        do {
            //
            System.out.println("··················································");
            System.out.println("···················TIENDA IVES····················");
            System.out.println("··················································");
            System.out.println("Ingresa una de las opciones del menú");
            System.out.println("1)Registrar empleados");
            System.out.println("2)Ver/mostrar empleados");
            System.out.println("3)Registrar productos");
            System.out.println("4)Ver/mostrar productos");
            System.out.println("5)Salir");
            System.out.println("Ingresa la opcion: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("SELECCIONASTE LA OPCION REGISTRAR EMPLEADO: ");

                    System.out.println("Ingresa el id del empleado: ");
                    empleado.setId_empleado(scanner.nextInt());

                    System.out.println("Ingresa el nombre del empleado: ");
                    empleado.setNombre_empleado(scanner.next());

                    System.out.println("Ingresa el apellido del empleado: ");
                    empleado.setApellidos(scanner.next());

                    System.out.println("Ingresa el telefono del empleado: ");
                    empleado.setTelefono(scanner.next());

                    System.out.println("Ingresa el puesto del empleado: ");
                    empleado.setPuesto(scanner.next());

                    System.out.println("Ingresa el sueldo del empleado: ");
                    empleado.setSueldo(scanner.nextFloat());

                    System.out.println("Ingresa el tipo de empleado: ");
                    empleado.setTipo_empleado(scanner.next());

                    boolean respuesta = empleadoDAO.RegistrarEmpleado(empleado);

                    if(respuesta){
                        System.out.println("EL EMPLEADO SE REGISTRO EXITOSAMENTE");
                    }else {
                        System.out.println("NO SE PUDO REGISTRAR EL EMPLEADO");
                    }
                    break;

                case 2:
                    List<empleado> empleadoList = empleadoDAO.mostrar_empleados();
                    for (empleado empleado1 : empleadoList){
                        System.out.println("··················································");
                        System.out.println("···············DATOS DEL EMPLEADOS" + empleado1.getId_empleado()+ "·················");
                        System.out.println("··················································");
                        System.out.println("Nombre: " +empleado1.getNombre_empleado());
                        System.out.println("Apellidos: " +empleado1.getApellidos());
                        System.out.println("Telefono: " +empleado1.getTelefono());
                        System.out.println("Puesto: " +empleado1.getPuesto());
                        System.out.println("Sueldo: " +empleado1.getSueldo());
                        System.out.println("Tipo de empleado: "+ empleado1.getTipo_empleado() + "\n");

                    }
                    break;

                case 3:
                    System.out.println("Programa para registrar producto");

                    System.out.println("Ingresa el id del producto: ");
                    producto.setId_producto(scanner.nextInt());

                    System.out.println("Ingresa el nombre del producto: ");
                    producto.setNombre_producto(scanner.next());

                    System.out.println("Ingresa el costo del producto: ");
                    producto.setCosto(scanner.nextFloat());

                    System.out.println("Ingresa la descripcion del producto: ");
                    producto.setDescripcion(scanner.next());

                    boolean respuesta1 = productoDAO.RegistrarProducto(producto);

                    if(respuesta1){
                        System.out.println("EL PRODUCTO SE REGISTRO EXITOSAMENTE");
                    }else {
                        System.out.println("NO SE PUDO REGISTRAR EL PRODUCTO");
                    }

                    break;

                case 4:
                    List<producto> productoList = productoDAO.mostrar_producto();
                    for (producto producto1 : productoList){
                        System.out.println("··················································");
                        System.out.println("···············DATOS DEL PRODUCTO" + producto1.getId_producto()+ "·················");
                        System.out.println("··················································");
                        System.out.println("Nombre: " +producto1.getNombre_producto());
                        System.out.println("Costo: " +producto1.getCosto());
                        System.out.println("Descripcion: " +producto1.getDescripcion()+ "\n");


                    }
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Escribe una opcion correcta");


            }

        }while (opcion != 3);
    }
}

