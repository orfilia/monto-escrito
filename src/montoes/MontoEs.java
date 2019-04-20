/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montoes;

import java.util.Scanner;

/**
 *
 * @author orfi
 */
public class MontoEs {

    public static String mayores(int x) {
        String con;
        switch (x) {

            case 2:
                con = " veinte ";
                break;
            case 3:
                con = " treinta ";
                break;
            case 4:
                con = " cuarenta ";
                break;
            case 5:
                con = " cincuenta ";
                break;
            case 6:
                con = " sesenta ";
                break;
            case 7:
                con = " setenta ";
                break;
            case 8:
                con = " ochenta ";
                break;
            case 9:
                con = " noventa ";
                break;
            default: con = " ";
        }
        return con;
    }

    public static String unidades(int num) {
        String con;
        switch (num) {
            case 1:
                con = "uno";
                break;
            case 2:
                con = " dos ";
                break;
            case 3:
                con = " tres ";
                break;
            case 4:
                con = " cuatro ";
                break;
            case 5:
                con = " cinco ";
                break;
            case 6:
                con = " seis ";
                break;
            case 7:
                con = " siete ";
                break;
            case 8:
                con = " ocho ";
                break;
            case 9:
                con = " nueve ";
                break;

            default:
                con = " ";
        }
        return con;
    }

    public static String decenas(int num) {
        String con = null;
        switch (num) {
            case 0:
                con = " diez ";
                break;
            case 1:
                con = " once ";
                break;
            case 2:
                con = " doce ";
                break;
            case 3:
                con = " trece ";
                break;
            case 4:
                con = " catorce ";
                break;
            case 5:
                con = " quince ";
                break;
        }
        if ((num > 15) && (num < 20)) {
            con = " dieci " + unidades(num % 10);
        } else {
            if ((num % 10 > 0) && (num > 19) && (num < 100)) {
                con = mayores(num / 10) + " y " + unidades(num % 10);
            } else {
                if ((num % 10 == 0) && (num > 19) && (num < 100)) {
                    con = mayores(num / 10);
                } else {
                    con = unidades(num);
                }
            }
        }
        return con;

    }

    public static String centenas(int num) {
        String con;

        if (((num >= 200) && (num < 500)) || ((num >= 600) && (num < 700)) || ((num >= 800) && (num < 900))) {
            con = unidades(num / 100) + " cientos " + decenas(num % 100);
        } else {
            if (num == 500) {
                con = " quinientos " + decenas(num % 100);
            } else {
                if (num == 700) {
                    con = " setecientos " + decenas(num % 100);
                } else {
                    if (num == 900) {
                        con = " novecientos " + decenas(num % 100);
                    }
                }
            }

            if ((num / 100) == 1) {
                if ((num % 100) == 0) {
                    con = " cien ";
                } else {
                    con = " ciento " + decenas(num % 100);
                }

            }
            con = decenas(num);
        }
        return con;
    }

    public static String miles(int num) {
        String con;

        if ((num >= 1000) && (num < 1000000)) {
            if (num == 1000) {
                con = " mil ";
            } else {
                con = centenas(num / 1000) + " mil " + centenas(num % 1000);
            }
        } else {
            con = centenas(num);
        }
        return con;
    }

    public static String millones(int num) {
        String con;

        if ((num >= 1000000) && (num < 2000000)) {
            con = " un millon " + miles(num % 1000000);
        } else {
            if ((num >= 2000000) && (num < 1000000000)) {
                con = miles(num / 1000000) + " millones " + miles(num % 1000000);
            } else {
                con = miles(num);
            }
        }
        return con;
    }

    public static void decimas(int u) {

        if (u % 10 == 0) {

            System.out.println(" CON ");
            unidades(u / 10);
            System.out.println(" CENTESIMAS");
        } else {
            //centecimas(u);
        }

    }

}
