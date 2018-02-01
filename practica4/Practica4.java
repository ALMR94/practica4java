/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author hola
 */
public class Practica4 {

    public static Libro[] registro = new Libro[100];

    public static void main(String[] args) {
        System.out.println("------------- Menu ----------------");
        System.out.println("1 - Crear libro");
        System.out.println("2 - Buscar libro");
        System.out.println("3 - Devolver libro");
        System.out.println("4 - Prestar libro");
        System.out.println("5 - Mostrar libro");
        System.out.println("6 - Salir");

        Scanner sc = new Scanner(System.in);
        int eleccion = sc.nextInt();
        int contador = 0;

        while (eleccion != 6) {
            switch (eleccion) {
                case 1: {
                    System.out.print("Introduce titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Introduce nombre autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Introduce isbn: ");
                    String isbn = sc.nextLine();
                    System.out.println("Introduce número de prestados: ");
                    int prestados = sc.nextInt();
                    System.out.println("Introduce número de ejemplares: ");
                    int ejemplares = sc.nextInt();

                    registro[contador] = new Libro(titulo, autor, isbn, prestados, ejemplares);
                    contador++;

                    System.out.println("------------- Menu ----------------");
                    System.out.println("1 - Crear libro");
                    System.out.println("2 - Buscar libro");
                    System.out.println("3 - Devolver libro");
                    System.out.println("4 - Prestar libro");
                    System.out.println("5 - Mostrar libro");
                    System.out.println("6 - Salir");

                    sc = new Scanner(System.in);
                    eleccion = sc.nextInt();
                }
                break;
                case 2: {
                    System.out.println("Introduce el isbn");
                    String isbn = sc.nextLine();

                    int i = 0;
                    while (isbn != registro[i].getIsbn()) {
                        i++;
                    }

                    System.out.println(registro[i].getTitulo() + " de " + registro[i].getAutor() + " con ISBN " +registro[i].getIsbn());

                    System.out.println("------------- Menu ----------------");
                    System.out.println("1 - Crear libro");
                    System.out.println("2 - Buscar libro");
                    System.out.println("3 - Devolver libro");
                    System.out.println("4 - Prestar libro");
                    System.out.println("5 - Mostrar libro");
                    System.out.println("6 - Salir");

                    sc = new Scanner(System.in);
                    eleccion = sc.nextInt();
                }
                break;
                
                case 3: {
                    System.out.println("Introduce el isbn");
                    String isbn = sc.nextLine();

                    int i = 0;
                    while (isbn != registro[i].getIsbn()) {
                        i++;
                    }

                    System.out.println(registro[i].getTitulo() + " de " + registro[i].getAutor() + " con ISBN " +registro[i].getIsbn());

                    System.out.println("------------- Menu ----------------");
                    System.out.println("1 - Crear libro");
                    System.out.println("2 - Buscar libro");
                    System.out.println("3 - Devolver libro");
                    System.out.println("4 - Prestar libro");
                    System.out.println("5 - Mostrar libro");
                    System.out.println("6 - Salir");

                    sc = new Scanner(System.in);
                    eleccion = sc.nextInt();
                }
                break;
                
                case 4: {
                    
                }

            }
        }

    }
}
