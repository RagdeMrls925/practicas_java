import com.persona.persona;
import com.empleado.empleado;
public class Main {
    public static void main(String[] args) {
       persona persona1 = new persona("josue", 22, 123456789);

       empleado empleado1 = new empleado ("Edgar", 20, 987654321, "0741852963", 5000);

        System.out.println(persona1.toString2());
        System.out.println(empleado1.toString());
        System.out.println(empleado1.toString2());

    }
}