import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        //PersonajeEXE p1 = new PersonajeEXE("Pedrito", 1, 0, 100, true);

        List<PersonajeEXE> lisObjeto = new ArrayList<>();

        int op;
        System.out.println("Seleccione una opcion para crear Objeto");
        op = teclado.nextInt();

        do {
            System.out.println("1. Crear Personaje");
            System.out.println("2. Mostrar Personaje");
            System.out.println("3. Salir");

            switch (op){
                case 1:
                    System.out.println("Ingrese el nombre del personaje");
                    String nombre = teclado.next();

                    System.out.println("Ingrese el nivel del personaje");
                    int nivel = teclado.nextInt();

                    System.out.println("Ingrese la experiencia del personaje");
                    int experiencia = teclado.nextInt();

                    System.out.println("Ingrese la vida del personaje");
                    int vida = teclado.nextInt();

                    boolean vivo = true;


                    PersonajeEXE p1 = new PersonajeEXE(nombre, nivel, experiencia, vida, vivo);
                    lisObjeto.add(p1);
                    break;

                case 2:
                    for (PersonajeEXE mostrar: lisObjeto){
                        System.out.println(mostrar);
                    }
                    break;



                case 3:
                    System.out.println("Salir chao bye");

                default:
                    System.out.println("Elige dentro de los parametros");

            }


        } while (op != 3);

        //Menu de acciones aqui no tocar
        int opcion;
        do {System.out.println("\n================== \n menu de acciones");
            System.out.println("1. mostrar estado");
            System.out.println("2. ganar experiencia");
            System.out.println("3. subir de nivel");
            System.out.println("4. recibir dano");
            System.out.println("5. curarse");
            System.out.println("6. salir");
            System.out.print("\nSeleccione una opción:\n ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    p1.mostrarEstado();
                    break;
                case 2:
                    System.out.println("nueva experiencia: " + p1.ganarExperiencia());
                    break;
                case 3:
                    System.out.println("subida de nivel: " + p1.subirNivel());
                    break;
                case 4:
                    int vidaRestante = p1.recibirDano();
                    System.out.println("vida actual: " + vidaRestante);
                    if (vidaRestante <= 0) System.out.println("se murioo");
                    break;
                case 5:
                    if (p1.curarse()) {
                        System.out.println("se curo, vida: " + p1.getVida());
                    } else {
                        System.out.println("ya esta muerto");
                    }
                    break;
                case 6:
                    System.out.println("resumen de todo:");
                    p1.mostrarEstado();
                    break;
                default:
                    System.out.println("elige del menu");
            }
        } while (opcion != 6);
    }
}

