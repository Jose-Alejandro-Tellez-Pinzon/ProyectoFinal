package viajeinterplanetario;

import java.util.Scanner;

public class ViajeInterPlanetario {
    // Elementos necesarios

    static Scanner read = new Scanner(System.in);
    static String[] planets = { "Marte, Júpiter" };
    static double[] distance = {78.0 , 628.0 , 1256.0};
    static String[] ships = {};
    static double[] speeds = {};

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
                    selectShip();

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

        System.out.println("Menú:");
        System.out.println("1. Planetas y sus descripciones ");
        System.out.println("2. Naves y sus descripciones ");
        System.out.println("4. Distancias");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");

    }

    public static void selectShip() {

    }

    public static void selectPlanet(int position) {



    }

    public static void showPlanet(int position) {

        System.out.println("Estos son los planetas: " + planets[position]);
    }

    public static void showDistance(int position) {

        System.out.println("Estas son las distancias hacia los planetas: " + distance[position]);

    }

}
