package viajeinterplanetario;

import java.util.Scanner;

public class ViajeInterPlanetario {
    // Elementos necesarios

    static Scanner read = new Scanner(System.in);
    static String[] planetas = {"Mercurio", "Venus", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"};
    static String[] distancias = {"91.7 millones de km","41,4 millones de km", "78,3 millones de km", "628,7 millones de km", "1.275 millones de km", "2.724 millones de km", "4.351 millones de km"};
    static String[] naves = {};
    static double[] velocidades = {};
    static String[] descripcion = {};

     
    
    // Descripción del planeta




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

        System.out.println("############Menú############");
        System.out.println("1. Planetas y sus descripciones ");
        System.out.println("2. Naves y sus descripciones ");
        System.out.println("4. Distancias");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");

    }

    public static void selectShip() {

    }

    public static void selectPlanet(int position) {


<<<<<<< HEAD
=======

    }

    public static void showPlanet(int position) {

        System.out.println("Estos son los planetas: " + planets[position]);
    }

    public static void showDistance(int position) {

        System.out.println("Estas son las distancias hacia los planetas: " + distance[position]);
>>>>>>> main

    }

}
