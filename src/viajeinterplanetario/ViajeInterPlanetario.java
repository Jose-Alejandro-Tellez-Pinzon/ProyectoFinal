package viajeinterplanetario;

import java.util.Scanner;

public class ViajeInterPlanetario {
    // Elementos necesarios

    static Scanner read = new Scanner(System.in);
    static String[] planets = { "Marte, Júpiter" };
    static double[] distance = {};
    static String[] ships = {};
    static double[] speed = {};

    public static void startTravel() {

        // Menú principal

        int option;

        do {

            showMenu();
            option = read.nextInt();

            switch (option) {
                case 1:
                    showPlanet(0);

                    break;
                case 2:

                    break;
                case 3:

                    break;

                case 4:
                    showDistance(0);
                    break;
                default:

            }
        } while (option != 10);
        read.close();

    }

    public static void showMenu() {

        System.out.println("/======> MENÚ <======\\");
        System.out.println("|  1.Elegir planeta  |");
        System.out.println("|  2.Elegir nave     |");
        System.out.println("|  3.Iniciar viaje   |");
        System.out.println("|  0.Salir           |");
        System.out.println("|\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/|");
        System.out.print("Elegir opción: ");

    }

    private static void showShips() {

        System.out.println("---> Marte");
        System.out.println("---> Júpiter");
        System.out.println("---> Urano");
        System.out.println("---> Mercurio");
        System.out.println("0. Salir");
        System.out.println("########################################");
        System.out.print("Elegir opción: ");

    }

    public static void selectPlanet(int position) {

        int option;

        showShips();
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

    }

}
