package viajeinterplanetario;

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

    // Descripción del planeta

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
                System.out.println("Haz elegido marte");
                break;
            case 2:
                System.out.println("haz elegido jupiter");
                break;

            default:

                break;
        }

    } // hasta aqui 

}
