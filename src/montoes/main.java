/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montoes;

import java.io.IOException;
import java.util.Scanner;
import static montoes.MontoEs.centenas;

/**
 *
 * @author orfi
 */
public class main {

    public static void main(String[] args) throws IOException {

        menuPrincipal();
    }

    public static void menuPrincipal() throws IOException {
        Scanner entrada = new Scanner(System.in);
        Scanner leercadena = new Scanner(System.in);
        MontoEs nu = new MontoEs();
        String cadena = new String();
        String convEnteroEnCadena = "";

        int entero = 0;
        int decimal = 0;

        int opcion = 0;

        do {
            System.out.println("\n MENU PRINCIPAL DE OPCIONES ");
            System.out.println(" 1. Deseas convertir un numero en letras ");
            System.out.println(" 0. Salir del Programa. ");
            System.out.print(" Seleccione Opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n Digite el numero: ");
                    float n = leercadena.nextFloat();
                    entero = (int) n;
                    decimal = (int) (1000 * (n - entero));

                    if (entero > 0 && entero < 100000000) {
                        String v = nu.millones(entero);
                        System.out.println(v);
                    } else {
                        System.out.println("el numero es incorrecto");
                    }
                    if (decimal > 0) {
                        if (decimal % 1000 > 0) {
                            String p;
                            System.out.print(" con ");
                            p = nu.centenas(decimal);
                            System.out.print(p);
                            System.out.println("milesimas");
                        } else {
                            if (decimal % 100 > 0) {
                                String p;
                                System.out.print(" con ");
                                p = nu.decenas(decimal);
                                System.out.print(p);
                                System.out.println("centenas");

                            } else {
                                if (decimal % 10 > 0) {
                                    String p;
                                    System.out.print(" con ");
                                    p = nu.unidades(decimal);
                                    System.out.print(p);
                                    System.out.println("decimas");
                                }
                                //System.out.print(" con ");
                                // String p;
                                // p = nu.milesimas(decimal);
                                // System.out.print(p);
                                //System.out.print(" decimas ");
                            }
                        }}
                    break;
                    case 0:
                    System.out.println("\n\nFin.\n");
                    break;
                default:
                    System.out.println("\nOpcion Invalida!");

            }
        } while (opcion != 0);

            }

        }
