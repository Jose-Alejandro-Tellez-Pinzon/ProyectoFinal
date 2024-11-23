package viajeinterplanetario;

import java.util.Random;
import java.util.Scanner;

public class ViajeInterPlanetario {

    
    // Elementos necesarios

    static Scanner read = new Scanner(System.in);
    static String[] planetas = { "Mercurio", "Venus", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno" };
    static String[] distancias = { "91.7 millones de km", "41,4 millones de km", "78,3 millones de km",
            "628,7 millones de km", "1.275 millones de km", "2.724 millones de km", "4.351 millones de km" };
    static String[] naves = {};
    static double[] velocidades = {};
    static String[] descripcion = {};
    static Random random = new Random();  

        

    public static void startTravel() {

        // Menú principal

        int option;

        //do {

            showMenu();
            option = read.nextInt();

            switch (option) {
                case 1:
                    selectPlanet();

                    break;
                case 2:

                    break;
                case 3:

                    break;

                case 4:

                    break;
                default:

            }
        //} while (option != 10);
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
        System.out.println("|_____PLANETAS____|");
        System.out.println("|                 |");
        System.out.println("|~~~> 1. Mercurio |");
        System.out.println("|~~~> 2. Venus    |");
        System.out.println("|~~~> 3. Marte    |");
        System.out.println("|~~~> 4. Júpiter  |");
        System.out.println("|~~~> 5. Saturno  |");
        System.out.println("|~~~> 6. Urano    |");
        System.out.println("|~~~> 7. Neptuno  |");
        System.out.println("|_________________|");
        System.out.println();
        System.out.print("====> Elegir opción: ");

    }
    //Juliana aqui vas hacer todo el algoritmo para que se muestre la descripcion de cada planeta
    public static void selectPlanet() {

        int option;
        showtPlanet();
        option = read.nextInt();
        
        switch (option) {
            case 1:
            System.out.println("Haz elegido Mercurio");
                System.out.println("Es el planeta más cercano al Sol, es pequeño y muy caliente durante el día, su distancia desde la tierra es aproximadamente "+distancias[0]);
                break;
            case 2:
                System.out.println("Haz elegido Venus");
                System.out.println("Su tamaño es parecido a la Tierra, su atmósfera es tóxica y con temperaturas extremas, su distancia desde la tierra es aproximadamente "+distancias[1]);
                break;
            case 3:
                System.out.println("Haz elegido Marte");
                System.out.println("Es un planeta que tiene un color rojo, con montañas y cañones gigantes, es posible que tenga agua subterránea, su distancia desde la tierra es aproximadamente "+distancias[2]);
                break;
            case 4:
                System.out.println("Haz elegido Jupiter");
                System.out.println("Es el planeta mas grande del sistema solar y esta compuesto de gases, tiene una Gran Mancha Roja y muchas lunas, su distancia desde la tierra es aproximadamente "+distancias[3]);
                break;
            case 5:
                System.out.println("Haz elegido Saturno");
                System.out.println("Famoso por sus brillantes anillos compuestos de hielo y roca, tiene más de 80 lunas y es el planeta menos denso por lo que podria flotar en el agua, su distancia desde la tierra es aproximadamente "+distancias[4]);
                break;
            case 6:
                System.out.println("Haz elegido Urano");
                System.out.println("Es conocido como el gigante de hielo ya que es el planeta mas frio del sistema solar, con un tono azul verdoso debido al metano en su atmósfera, su distancia desde la tierra es aproximadamente "+distancias[5]);
                break;
            case 7:
                System.out.println("Haz elegido Nepturno");
                System.out.println("Es el planeta más lejano, frío y ventoso, de un color azul intenso, su distancia desde la tierra es aproximadamente "+distancias[6]);
                break;
        
            default:

                break;
        }

    } // hasta aqui 

    public static void eventosAletorios(){

        int eventoAletorio = random.nextInt(3);

        switch (eventoAletorio) {
            case 0:
                System.out.println("Un meteorito golpeo la nave, por favor evalue el daño externo y realice una reparación si es necesario. ");
                break;

            case 1:
                 System.out.println("Se ha detectado una fuga de oxígeno en la nave, por favor activa el sistema de sellado automático y revisa los niveles de oxígeno. ");
            
             case 2:
                System.out.println("El motor principal está sobrecalentado, por favor reduzca la potencia del motor y active el sistema de enfriamiento. ");

            default:
                System.out.println("Todos los sistemas de la nave estan funcionando correctamente. ");

                    }
    } 
    
    public static void solucionEventosAleatorios(){

        var solucion = read.next();

        System.out.println("Para solucionar los problemas con la nave de forma automatica, presiona ENTER. ");


    }
}  


