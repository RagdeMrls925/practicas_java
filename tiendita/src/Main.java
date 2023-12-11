import com.tienda.producto;
public class Main {
    public static void main(String[] args) {

        producto producto1 = new producto(14, "galletas", "emperador", 15.50);
        producto producto2 = new producto(39, "productos de limpieza", "pinol", 20);

        System.out.println(producto1.toString());
        System.out.println(producto2.toString());
    }
}