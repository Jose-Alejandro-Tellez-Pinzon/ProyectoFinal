package viajeinterplanetario;

import java.util.Random;
import java.util.Scanner;

public class ViajeInterPlanetario {

    // Elementos necesarios

    static Scanner read = new Scanner(System.in);
    static String[] planets = { "Mercurio", "Venus", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno" };
    static String[] distances = { "91.7 millones de km", "41,4 millones de km", "78,3 millones de km",
            "628,7 millones de km", "1.275 millones de km", "2.724 millones de km", "4.351 millones de km" };
    static String[] ships = { "Argos", "Deméter", "Pegasus" };
    static double[] speed = {};
    static Random random = new Random();
    static boolean exit = false;

    public static void travel() {

        int option;

        do {
            showMenu();
            option = read.nextInt();
            switch (option) {
                case 0:
                    exit = true;

                    break;
                case 1:
                    selectPlanet();

                    break;
                case 2:
                    showShip();

                    break;
                case 3:
                    startTravel();
                    break;
                default:
                    System.err.println("Opción incorrecta");

            }
        } while (!exit);
        System.out.println();
        System.out.println("--[!Gracias por utilizar el programa¡]--");
        read.close();

    }

    public static void showMenu() {

        System.out.println(" ______________________");
        System.out.println("/_____________________/|");
        System.out.println("|       ______       | |");
        System.out.println("| ====> [MENÚ] <==== | |");
        System.out.println("|       ¨¨¨¨¨¨       | |");
        System.out.println("|  1.Elegir planeta  | |");
        System.out.println("|  2.Elegir nave     | |");
        System.out.println("|  3.Iniciar viaje   | |");
        System.out.println("|  0.Salir           | |");
        System.out.println("|____________________|_|");
        System.out.println();
        System.out.print("====> Elegir opción: ");

    }

    private static void showtPlanet() {

        System.out.println(" _________________");
        System.out.println("|___[PLANETAS]___|");
        System.out.println("|                |");
        System.out.println("|~~> 1. Mercurio |");
        System.out.println("|~~> 2. Venus    |");
        System.out.println("|~~> 3. Marte    |");
        System.out.println("|~~> 4. Júpiter  |");
        System.out.println("|~~> 5. Saturno  |");
        System.out.println("|~~> 6. Urano    |");
        System.out.println("|~~> 7. Neptuno  |");
        System.out.println("|________________|");
        System.out.println();
        System.out.print("====> Elegir un planeta: ");

    }

    public static void showShip() {

        System.out.println(" ______________________ ");
        System.out.println("|________[NAVES]_______|");
        System.out.println("|                      |");
        System.out.println("|~~~> 1. Nave Argos    |");
        System.out.println("|~~~> 2. Nave Deméter  |");
        System.out.println("|~~~> 3. Nave Pegasus  |");
        System.out.println("|______________________|");
        System.out.println();
        System.out.println("===> Elegir una nave: ");
    }

    public static void startTravel() {

    }

    public static void selectPlanet() {

        int option;
        showtPlanet();
        option = read.nextInt();

        switch (option) {
            case 1:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[0] + "]~~");
                System.out.println(
                        " Es el planeta más cercano al Sol, es pequeño y muy caliente durante el día, su distancia desde la tierra es aproximadamente "
                                + distances[0]);
                break;
            case 2:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[1] + "]~~");
                System.out.println(
                        "Su tamaño es parecido a la Tierra, su atmósfera es tóxica y con temperaturas extremas, su distancia desde la tierra es aproximadamente "
                                + distances[1]);
                break;
            case 3:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[2] + "]~~");
                System.out.println(
                        "Es un planeta que tiene un color rojo, con montañas y cañones gigantes, es posible que tenga agua subterránea, su distancia desde la tierra es aproximadamente "
                                + distances[2]);
                break;
            case 4:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[3] + "]~~");
                System.out.println(
                        "Es el planeta mas grande del sistema solar y esta compuesto de gases, tiene una Gran Mancha Roja y muchas lunas, su distancia desde la tierra es aproximadamente "
                                + distances[3]);
                break;
            case 5:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[4] + "]~~");
                System.out.println(
                        "Famoso por sus brillantes anillos compuestos de hielo y roca, tiene más de 80 lunas y es el planeta menos denso por lo que podria flotar en el agua, su distancia desde la tierra es aproximadamente "
                                + distances[4]);
                break;
            case 6:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[5] + "]~~");
                System.out.println(
                        "Es conocido como el gigante de hielo ya que es el planeta mas frio del sistema solar, con un tono azul verdoso debido al metano en su atmósfera, su distancia desde la tierra es aproximadamente "
                                + distances[5]);
                break;
            case 7:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[6] + "]~~");
                System.out.println(
                        "Es el planeta más lejano, frío y ventoso, de un color azul intenso, su distancia desde la tierra es aproximadamente "
                                + distances[6]);
                break;

            default:
                System.err.println("Planeta no valido");
                break;
        }

    }

    public static void selectShip() {
        int option;
        showShip();
        option = read.nextInt();
        switch (option) {
            case 1:

                break;

            default:
                break;
        }
    }

    public static void eventosAletorios() {

        int eventoAletorio = random.nextInt(3);

        switch (eventoAletorio) {
            case 0:
                System.out.println(
                        "Un meteorito golpeo la nave, por favor evalue el daño externo y realice una reparación si es necesario. ");
                break;

            case 1:
                System.out.println(
                        "Se ha detectado una fuga de oxígeno en la nave, por favor activa el sistema de sellado automático y revisa los niveles de oxígeno. ");

            case 2:
                System.out.println(
                        "El motor principal está sobrecalentado, por favor reduzca la potencia del motor y active el sistema de enfriamiento. ");

            default:
                System.out.println("Todos los sistemas de la nave estan funcionando correctamente. ");

        }
    }

    public static void solucionEventosAleatorios() {

        var solucion = read.next();

        System.out.println("Para solucionar los problemas con la nave de forma automatica, presiona ENTER. ");

    }
}
