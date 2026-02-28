import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        //PersonajeEXE p1 = new PersonajeEXE("Pedrito", 1, 0, 100, true);

        List<PersonajeEXE> lisObjeto = new ArrayList<>();

        int op;

        do {
            System.out.println("\n");
            System.out.println("1. Crear Personaje");
            System.out.println("2. Mostrar Personaje");
            System.out.println("3. Buscar Personaje y jugar");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion para crear Objeto: ");
            op = teclado.nextInt();

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
                    for (PersonajeEXE p: lisObjeto){
                        System.out.println(p);
                    }
                    break;

                case 3:
                    String per;
                    System.out.println("Ingrese el nombre a buscar; ");
                    per = teclado.next();
                    if (lisObjeto.isEmpty()){
                        System.out.println("La lista no tiene elementos");
                    }
                    PersonajeEXE per1 = null;

                    for (PersonajeEXE p: lisObjeto){
                        if(p.getNombre().equalsIgnoreCase(per)){
                            per1 = p;
                            System.out.println(per1.toString());
                            break;
                        }
                    }

                    if (per1 != null) {
                        int opcion;
                        do {
                            System.out.println("\n================== \n menu de acciones para: " + per1.getNombre());
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
                                    per1.mostrarEstado();
                                    break;
                                case 2:
                                    System.out.println("nueva experiencia: " + per1.ganarExperiencia());
                                    break;
                                case 3:
                                    System.out.println("subida de nivel: " + per1.subirNivel());
                                    break;
                                case 4:
                                    int vidaRestante = per1.recibirDano();
                                    System.out.println("vida actual: " + vidaRestante);
                                    if (vidaRestante <= 0) System.out.println("se murioo");
                                    break;
                                case 5:
                                    if (per1.curarse()) {
                                        System.out.println("se curo, vida: " + per1.getVida());
                                    } else {
                                        System.out.println("ya esta muerto");
                                    }
                                    break;
                                case 6:
                                    System.out.println("resumen de todo:");
                                    per1.mostrarEstado();
                                    break;
                                default:
                                    System.out.println("elige del menu");
                            }
                        } while (opcion != 6);
                    } else {
                        System.out.println("no se encontro al personajke F");
                    }
                    break;


                case 4:
                    System.out.println("\nSaliendo vayiendose chao bye");
                    break;

                default:
                    System.out.println("Elige dentro de los parametros: ");
            }

        } while (op != 4);
    }
}

