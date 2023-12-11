import com.auto.auto;


public class Main {
    public static void main(String[] args) {


    auto auto1 = new auto("chevrolet", "sd", 150000, "azul", 5);

    auto auto2 = new auto("df", "df", 150000.50, "rojo", 5);

    auto auto3 = new auto("chevrolet", "sd", 150000, "azul", 5);

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());
    }
}