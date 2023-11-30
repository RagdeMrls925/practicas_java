import com.persona.persona;
import com.empleado.empleado;
import com.asesor.asesor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //El programa creara un arreglo de empleados y un arreglo de asesores

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa que crea arreglos de empleados y asesores de una empresa");
        System.out.print("Ingresa el numero de empleados que deseas crear: ");
        int numemp = scanner.nextInt();

        empleado [] empleadosarray = new empleado[numemp];

        for (int i = 0; i<numemp; i++) {
            System.out.print("Ingresa el nombre del empleado: ");
            String nombre = scanner.next();

            System.out.println("Ingresa la edad del empleado: ");
            int edad = scanner.nextInt();

            System.out.print("Ingresa el telefono del empleado: ");
            int telefono = scanner.nextInt();

            System.out.println("Ingresa la DNI del empleado: ");
            String dni = scanner.next();

            System.out.println("Ingresa el sueldo del empleado: ");
            int sueldo = scanner.nextInt();

            System.out.print("Ingresa el puesto del empleado: ");
            String puesto = scanner.next();

            System.out.println("Ingresa el departamento del empleado: ");
            String departamento = scanner.next();

        empleadosarray[i] = new empleado(nombre,edad,telefono,dni,sueldo,puesto,departamento);


    }

        System.out.print("Ingresa el numero de asesores que deseas crear: ");
        int numasc = scanner.nextInt();
        asesor[] asesorarray = new asesor[numasc];

        for (int i = 0; i<numasc; i++) {

            System.out.print("Ingresa el nombre del Asesor: ");
            String nombre = scanner.next();

            System.out.println("Ingresa la edad del Asesor: ");
            int edad = scanner.nextInt();

            System.out.print("Ingresa el telefono del Asesor: ");
            int telefono = scanner.nextInt();

            System.out.println("Ingresa el ID del Asesor: ");
            int id = scanner.nextInt();

            System.out.println("Ingresa el nombre de la empresa del Asesor: ");
            String empresa = scanner.next();

            System.out.println("Ingresa las horas trabajdas del Asesor: ");
            int horas_trabajadas = scanner.nextInt();

            asesorarray [i] = new asesor (nombre, edad, telefono, id, empresa, horas_trabajadas);
            asesorarray [i].asignarsueldo();



        }
        for (int i= 0; i<numasc; i++){
            System.out.println(asesorarray[i].detallesase());
           // System.out.println(asesorarray[i].toStringpersona());
    }
}
}
