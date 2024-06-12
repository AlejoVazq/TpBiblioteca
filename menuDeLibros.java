import java.util.Scanner;

public class menuDeLibros {

    public menuDeLibros(String[] args){

        Scanner scanner = new Scanner (System.in);

        int menuLibros = 0;

        do{                                                                     // Repetir menu Libro mientras no se use salir
            System.out.println("----Menu Libros----");
            System.out.println("1: Lista de libros");
            System.out.println("2: Prestar libro");
            System.out.println("3: Devolver Libro");
            System.out.println("4: Salir");
            System.out.print("Ingrese a continuacion la opcion: ");

            menuLibros = scanner.nextInt();

            switch (menuLibros) {                                                //Eleccion de menu
                case 1:
                    System.out.println("---------------------------------------------------------------------------------------------");
                    lista_Libros();
                    System.out.println("---------------------------------------------------------------------------------------------");
                    break;
    
                case 2:
                    System.out.println("---------------------------------------------------------------------------------------------");
                    menu_Prestar();
                    System.out.println("---------------------------------------------------------------------------------------------");
                    break;
    
                case 3:
                    System.out.println("---------------------------------------------------------------------------------------------");
                    menu_Devolver();
                    System.out.println("---------------------------------------------------------------------------------------------");
                    break;

                case 4:
                    Salir();
                    break;  

                default:
                    System.out.println();
                    System.out.println("La opcion ingresada no es correcta");
                    System.out.println();
                    break;
            }
        }while(menuLibros!=4);
            System.out.println("Volviendo al menu principal ");
            System.out.println();
            menuPrincipal menuPrincipal = new menuPrincipal(args){};
            menuPrincipal.iniciar();
    
    }

    static void lista_Libros() {
        Libro libro1=new Libro("Cien Años de Soledad","Gabriel García Márquez","978-3-16-148410-0",10,3);
        Libro libro2=new Libro("1984","George Orwell","978-0-452-28423-4",8,8);
        Libro libro3=new Libro("El Quijote","Miguel de Cervantes","978-0-14-243723-0",5,1);
        Libro libro4=new Libro("El Principito","Antoine de Saint-Exupéry","978-0-15-601219-5",12,7);
        Libro libro5=new Libro("Ficciones","Jorge Luis Borges","978-0-525-47546-6",5,0);
        Libro libro6=new Libro("Crónica de una Muerte Anunciada","Gabriel García Márquez","978-0-307-47458-3",7,4);

        System.out.println("Libro: " + libro1.getTitulo() + ", Autor: " + libro1.getAutor() + ", ISBN: " + libro1.getIsbn() + ".");
        System.out.println("Libro: " + libro2.getTitulo() + ", Autor: " + libro2.getAutor() + ", ISBN: " + libro2.getIsbn() + ".");
        System.out.println("Libro: " + libro3.getTitulo() + ", Autor: " + libro3.getAutor() + ", ISBN: " + libro3.getIsbn() + ".");
        System.out.println("Libro: " + libro4.getTitulo() + ", Autor: " + libro4.getAutor() + ", ISBN: " + libro4.getIsbn() + ".");
        System.out.println("Libro: " + libro5.getTitulo() + ", Autor: " + libro5.getAutor() + ", ISBN: " + libro5.getIsbn() + ".");
        System.out.println("Libro: " + libro6.getTitulo() + ", Autor: " + libro6.getAutor() + ", ISBN: " + libro6.getIsbn() + ".");



    }

    static void menu_Prestar(){
        
     Scanner scanner = new Scanner (System.in);

        int menuPrestamo = 0;

        do{                                                                     // Repetir menu de prestar libros mientras no se use salir
            System.out.println("Los libros disponibles son: ");
            System.out.println("1: Cien años de soledad");
            System.out.println("2: 1984");
            System.out.println("3: El Quijote");
            System.out.println("4: El principito");
            System.out.println("5: Ficciones");
            System.out.println("6: Cronica de una muerte anunciada");
            System.out.println("7: Salir");

            System.out.print("A continuacion escriba la opcion: ");
            menuPrestamo = scanner.nextInt();
            System.out.println();

            switch (menuPrestamo) {                                              
                case 1: //Prestar libro 1
                    Libro libro1=new Libro("Cien Años de Soledad","Gabriel García Márquez","978-3-16-148410-0",10,3);
                    prestarLibro(libro1); //Llamar a metodo prestarLibro
                break;

                case 2: //Prestar libro 2
                    Libro libro2=new Libro("1984","George Orwell","978-0-452-28423-4",8,8);
                    prestarLibro(libro2); //Llamar a metodo prestarLibro
                break;
    
                case 3: //Prestar libro 3
                    Libro libro3=new Libro("El Quijote","Miguel de Cervantes","978-0-14-243723-0",5,1);
                    prestarLibro(libro3); //Llamar a metodo prestarLibro                    
                break;
    
                case 4: //Prestar libro 4
                    Libro libro4=new Libro("El Principito","Antoine de Saint-Exupéry","978-0-15-601219-5",12,7);
                    prestarLibro(libro4); //Llamar a metodo prestarLibro
                break;
    
                case 5: //Prestar libro 5
                    Libro libro5=new Libro("Ficciones","Jorge Luis Borges","978-0-525-47546-6",5,0);
                    prestarLibro(libro5); //Llamar a metodo prestarLibro
                    
                break;
    
                case 6: //Prestar libro 6
                    Libro libro6=new Libro("Crónica de una Muerte Anunciada","Gabriel García Márquez","978-0-307-47458-3",7,4);
                    prestarLibro(libro6); //Llamar a metodo prestarLibro
                break;

                case 7: //Salir al menu
                    Salir();
                break;
    
                default:
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.println("La opcion ingresada no es correcta");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    break;
            }
        }while(menuPrestamo!=7);
            System.out.println("Volviendo al menu");
        
    }
    
    
    static void prestarLibro(Libro libro) { //Metodo prestar libro
            if (libro.darPrestamo()) {
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("Se ha prestado el libro " + libro.getTitulo());
                System.out.println("---------------------------------------------------------------------------------------------");
            } else {
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("No hay ejemplares disponibles de " + libro.getTitulo() + " para prestar.");
                System.out.println("---------------------------------------------------------------------------------------------");
            }

    }




    static void menu_Devolver(){
        Scanner scanner = new Scanner (System.in);

        int menuPrestamo = 0;

        do{                                                                     // Repetir menu de prestar libros mientras no se use salir
            System.out.println("Los libros disponibles son: ");
            System.out.println("1: Cien años de soledad");
            System.out.println("2: 1984");
            System.out.println("3: El Quijote");
            System.out.println("4: El principito");
            System.out.println("5: Ficciones");
            System.out.println("6: Cronica de una muerte anunciada");
            System.out.println("7: Salir");

            System.out.print("A continuacion escriba la opcion: ");
            menuPrestamo = scanner.nextInt();
            System.out.println();

            switch (menuPrestamo) {                                              
                case 1: //Prestar libro 1
                    Libro libro1=new Libro("Cien Años de Soledad","Gabriel García Márquez","978-3-16-148410-0",10,3);
                    devolverLibro(libro1); //Llamar a metodo devolverLibro
                break;

                case 2: //Prestar libro 2
                    Libro libro2=new Libro("1984","George Orwell","978-0-452-28423-4",8,8);
                    devolverLibro(libro2); //Llamar a metodo devolverLibro
                break;
    
                case 3: //Prestar libro 3
                    Libro libro3=new Libro("El Quijote","Miguel de Cervantes","978-0-14-243723-0",5,0);
                    devolverLibro(libro3); //Llamar a metodo devolverLibro                    
                break;
    
                case 4: //Prestar libro 4
                    Libro libro4=new Libro("El Principito","Antoine de Saint-Exupéry","978-0-15-601219-5",12,1);
                    devolverLibro(libro4); //Llamar a metodo devolverLibro
                break;
    
                case 5: //Prestar libro 5
                    Libro libro5=new Libro("Ficciones","Jorge Luis Borges","978-0-525-47546-6",5,0);
                    devolverLibro(libro5); //Llamar a metodo devolverLibro
                    
                break;
    
                case 6: //Prestar libro 6
                    Libro libro6=new Libro("Crónica de una Muerte Anunciada","Gabriel García Márquez","978-0-307-47458-3",7,7);
                    devolverLibro(libro6); //Llamar a metodo devolverLibro
                break;

                case 7: //Salir al menu
                    Salir();
                break;
    
                default:
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.println("La opcion ingresada no es correcta");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    break;
            }
        }while(menuPrestamo!=7);
            System.out.println("Volviendo al menu");
        
    }

    static void Salir(){} //Metodo salir


    static void devolverLibro(Libro libro) { //Metodo devolver libro
        if(libro.devolverLibro()){
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("Se ha devuelto el libro " + libro.getTitulo());
            System.out.println("---------------------------------------------------------------------------------------------");
        }
        else {
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("No hay ejemplares de " + libro.getTitulo() + " prestados.");
            System.out.println("---------------------------------------------------------------------------------------------");
        }

    }

    public void iniciar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciar'");
    }


 
}

