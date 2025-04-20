import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------Metodo Busqueda Binaria------------");
        System.out.println("Ingrese la cantidad de personas para el listado : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Persona[] personas = new Persona[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la Persona");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            int edad;
            do {
                System.out.print("Edad: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, ingrese un numero valido.");
                    scanner.next();
                }
                edad = scanner.nextInt();
                scanner.nextLine();

                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa, intente nuevamente.");
                }
            } while (edad < 0);

            personas[i] = new Persona(nombre, edad);
        }

        Arrays.sort(personas, Comparator.comparingInt(Persona::getEdad));
        System.out.println("\nArreglo ordenado por edad:");
        for (Persona p : personas) {
            System.out.print(p.getEdad() + " | ");
        }
        System.out.println();

        System.out.print("\nIngrese el valor de la persona que desea buscar: ");
        int edadBuscar = scanner.nextInt();

        int bajo = 0, alto = personas.length - 1;
        boolean encontrado = false;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].getEdad();

            for (int i = bajo; i <= alto; i++) {
                System.out.print(personas[i].getEdad() + " | ");
            }
            System.out.println();

            System.out.println("Bajo:" + bajo);
            System.out.println("Alto:" + alto);
            System.out.println("Centro:" + centro);
            System.out.println("ValorCentro:" + valorCentro);

            if (valorCentro == edadBuscar) {
                System.out.println("---> Encontrado");
                System.out.println("La persona con la edad " + edadBuscar + " es " + personas[centro].getNombre());
                encontrado = true;
                break;
            } else if (valorCentro < edadBuscar) {
                System.out.println("---> Derecha");
                bajo = centro + 1;
            } else {
                System.out.println("---> Izquierda");
                alto = centro - 1;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ninguna persona con la edad " + edadBuscar);
        }
    }
}

