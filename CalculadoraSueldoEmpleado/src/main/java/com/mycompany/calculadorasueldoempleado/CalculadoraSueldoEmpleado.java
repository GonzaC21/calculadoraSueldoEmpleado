package com.mycompany.calculadorasueldoempleado;

import java.util.Scanner;

public class CalculadoraSueldoEmpleado {

    public static void main(String[] args) {

        double sueldo = 0;

        System.out.println("Ingrese el tipo de empleado");
        Scanner teclado = new Scanner(System.in);
        int categoria = teclado.nextInt();

        if (categoria == 1) {
            sueldo = 15890 + (15890 * 0.10);

        } else {
            if (categoria == 2) {
                sueldo = 25630.89;
            } else {
                if (categoria == 3) {
                    sueldo = 35560.20 - (35560.20 * 0.11);

                } else {
                    System.out.println("Ingreso un numero de categoria incorrecto");
                }
            }
        }
        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("la categoria de la persona es: " + categoria);
            System.out.println("El sueldo de la persona es: " + sueldo);

        }

    }
}
