import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class menuDeClientes {

    public menuDeClientes(String[] args){

        Scanner scanner = new Scanner (System.in);

        int menuCl = 0, numClientes = 0;
        Cliente[] clientes = new Cliente[10];

            // Carga de clientes en el arreglo
            clientes[numClientes++] = new Cliente("Juan", "Perez", 45766545, 1, 5);
            clientes[numClientes++] = new Cliente("Maria", "Gomez", 38876612, 0, 1);
            clientes[numClientes++] = new Cliente("Carlos", "Lopez", 49987654, 1, 0);
            clientes[numClientes++] = new Cliente("Ana", "Martinez", 37654321, 0, 14);
            clientes[numClientes++] = new Cliente("Luis", "Hernandez", 34567890, 1, 15);
            clientes[numClientes++] = new Cliente("Laura", "Fernandez", 41234567, 0, 2);


        do{           // Menu clientes
            System.out.println("----Menu Clientes----");
            System.out.println("1: Lista de clientes");
            System.out.println("2: Cargar Cliente");
            System.out.println("3: Eliminar Cliente");
            System.out.println("4: Lista de clientes con libros en poder");
            System.out.println("5: Top de clientes");
            System.out.println("6: Salir");
            System.out.print("Ingrese a continuacion la opcion: ");

            menuCl = scanner.nextInt();

            switch (menuCl) {                                                //Eleccion de menu
                case 1:                                                           //Caso 1 Lista de clientes
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.println("\nClientes cargados:");
                    for (int i = 0; i < numClientes; i++) {
                        System.out.println("Cliente n° " + (i + 1) + ": " + clientes[i]);
                                                          }
                    System.out.println("---------------------------------------------------------------------------------------------");
                    break;
    
                case 2:                                                           //Caso 2 Cargar clientes
                    System.out.println("---------------------------------------------------------------------------------------------");

                    System.out.println("Ingrese el número de clientes adicionales a cargar:");
                    int numClientesAdicionales = scanner.nextInt();
                    scanner.nextLine(); //Salto de linea

                    for (int i = 0; i < numClientesAdicionales; i++) {
                        System.out.println("Ingrese los datos del cliente " + (numClientes + 1) + ":");

                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Apellido: ");
                        String apellido = scanner.nextLine();

                        System.out.print("DNI: ");
                        int dni = scanner.nextInt();
                        scanner.nextLine(); //Salto de linea

                        System.out.print("Libro en poder (1 para sí, 0 para no): ");
                        int libroEnPoder = scanner.nextInt();
                        scanner.nextLine(); //Salto de linea

                        System.out.println("¿Cuantos libros ha pedido?");
                        int librosPedidos = scanner.nextInt();
                        scanner.nextLine();

                        clientes[numClientes++] = new Cliente(nombre, apellido, dni, libroEnPoder, librosPedidos);
                                                                     }
                    System.out.println("---------------------------------------------------------------------------------------------");
                    break;
    
                case 3:            //Caso 3 Eliminar clientes
                    System.out.println("---------------------------------------------------------------------------------------------");
                 
                    eliminarCliente(clientes, numClientes);
                    
                    System.out.println("---------------------------------------------------------------------------------------------");
                    break;

                case 4:           //Caso 4 listado de clientes con libros en poder
                clientesConLibros(clientes, numClientes);
                    break;  

                case 5:           //Caso 5 Clientes con mas libros pedidos      
                imprimirTopClientes(clientes, numClientes);
                    break;  

                case 6:
                    break; 

                default:
                    System.out.println();
                    System.out.println("La opcion ingresada no es correcta");
                    System.out.println();
                    break;
            }
        }while(menuCl!=6);
            System.out.println("Volviendo al menu principal ");
            System.out.println();
            menuPrincipal menuPrincipal = new menuPrincipal(args){};
            menuPrincipal.iniciar();
    }

        static void eliminarCliente(Cliente[] clientes, int numClientes) {
                Scanner scanner = new Scanner(System.in);
        
                // Mostrar la lista de clientes para que el usuario seleccione cuál eliminar
                System.out.println("Lista de clientes:");
                for (int i = 0; i < numClientes; i++) {
                    System.out.println((i + 1) + ": " + clientes[i]);
                }

                System.out.print("\nIngrese el número del cliente que desea eliminar: ");
                int indiceCliente = scanner.nextInt();
                scanner.nextLine();

                // Verificar si el índice es válido
                if (indiceCliente >= 1 && indiceCliente <= numClientes) {
                    // Eliminar el cliente del arreglo moviendo los elementos hacia adelante
                    for (int i = indiceCliente - 1; i < numClientes - 1; i++) {
                        clientes[i] = clientes[i + 1];
                    }
                    // Establecer el último elemento como null solo si hay clientes restantes
                    if (numClientes > 1) {
                        clientes[numClientes - 1] = null;
                    }

                    // Actualizar el número de clientes
                    numClientes--;

                    System.out.println("Cliente eliminado con éxito.");
                } else {
                    System.out.println("¡El número de cliente ingresado no es válido!");
                }
            }
        
        private static void imprimirTopClientes(Cliente[] clientes, int numClientes) {
                Arrays.sort(clientes, Comparator.comparingInt(c -> {
                    if (c == null) return 0; // Si el cliente es nulo, devuelve un valor por defecto
                    else return ((Cliente) c).getLibrosPedidos();
                }).reversed());
            
                // Imprimir el top de clientes por la cantidad de libros pedidos
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("Top de clientes por la cantidad de libros pedidos:");
                for (int i = 0; i < numClientes; i++) {
                    if (clientes[i] != null) { // Verificar que el cliente no sea nulo antes de imprimirlo
                        System.out.println((i + 1) + ": " + clientes[i].getNombre() + " - Libros pedidos: " + clientes[i].getLibrosPedidos());
                    }
                }
                System.out.println("---------------------------------------------------------------------------------------------");
            }

        static void clientesConLibros(Cliente[] clientes, int numClientes) {
                System.out.println("Listado de clientes con libros en poder:");
        
                for (int i = 0; i < numClientes; i++) {
                    Cliente cliente = clientes[i];
                    if (cliente.getLibroEnPoder() > 0) {
                        System.out.println(cliente);
                    }
                }
            }

        public void iniciar() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'iniciar'");
        }


}