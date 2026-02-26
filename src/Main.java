import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        PersonajeEXE p1 = new PersonajeEXE("Pedrito", 1, 0, 100, true);

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

