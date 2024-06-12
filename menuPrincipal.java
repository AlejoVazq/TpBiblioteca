import java.util.Scanner;

class menuPrincipal {

    public menuPrincipal(String[] args){

        Scanner scanner = new Scanner(System.in);

        int menuPpal = 0;

        do {
            // Mostrar menú principal
            System.out.println("----Software Gestion de biblioteca----");
            System.out.println("1: Menu clientes");
            System.out.println("2: Menu libros");
            System.out.println("3: Salir");
            System.out.print("Ingrese a continuación la opción: ");

            menuPpal = scanner.nextInt();

            switch (menuPpal) {
                case 1:
                    menuDeLibros menuDeLibros= new menuDeLibros(args);
                    menuDeLibros.iniciar();
                    break;

                case 2:
                    // Llamar al método para mostrar el menú de libros
                    menuDeClientes menuDeClientes = new menuDeClientes(args);
                    menuDeClientes.iniciar();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("La opción ingresada no es correcta");
                    break;
            }
        } while (menuPpal != 3);

        System.out.println("El programa ha finalizado ");
    }

    // Método para mostrar el menú de clientes
    private static void menuClientes() {
        System.out.println("Menu de clientes:");
    }
        
    // Método para mostrar el menú de libros
    private static void menuLibros() {
        System.out.println("Menu de clientes:");
    }

    public void iniciar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciar'");
    }

    }

   