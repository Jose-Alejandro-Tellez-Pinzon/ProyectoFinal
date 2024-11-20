package viajeinterplanetario;

import java.util.Scanner;

public class ViajeInterPlanetario {
    // Elementos necesarios

    static Scanner read = new Scanner(System.in);
    static String[] planetas = {"Marte, Júpiter"};
    static double[] distancias = {};
    static String[] naves = {};
    static double[] velocidades = {};

    public static void startTravel() {

       
        // Menú principal

        int option;

        do {

            showMenu();
            option = read.nextInt();

            switch (option) {
                case 1:
                    selectPlanet(0);

                    break;
                case 2:
                    selectShip();

                    break;
                case 3:

                    break;
                default:

            }
        } while (option != 3);
        read.close();

    }

    private static void showMenu() {

        System.out.println("Menú:");
        System.out.println("1. Planetas");
        System.out.println("2. Naves");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");

    }

    private static void selectShip() {

    }

    private static void selectPlanet(int position) {

        System.out.println("Estos son los planetas: " +planetas[position]);

        

    }

}
