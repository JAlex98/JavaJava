import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int idCounter = 1;

        while (true) {
            System.out.println(" nombre del producto:");
            String nombre = scanner.nextLine();

            System.out.println(" marca del producto:");
            String marca = scanner.nextLine();

            System.out.println(" precio del producto:");
            double precio = Double.parseDouble(scanner.nextLine());

            Producto producto = new Producto(idCounter++, nombre, marca, precio);
            productos.add(producto);

            System.out.println("¿agregar otro producto? (s/n):");
            String continuar = scanner.nextLine();
            if (continuar.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Productos registrados:");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}
