package com.example.pruebajava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

/**
 * The type Prueba java application.
 *
 * @Author: Alejandro Gutiérrez
 */
@SpringBootApplication
public class JavaApplication {

    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(JavaApplication.class, args);
        byte r; // variable dimencion de matriz (filas)
        byte c; // variable dimencion de matriz (columnas)
        byte x; // variable dimencion de matriz para sumatoria (columnas)
        byte y; // variable dimencion de matriz para sumatoria (filas)
        byte z; // varialbe de dominio para asignación de datos en matríz
        System.out.println("ingrese dimensión R (filas) del 1 al 10: ");
        r = SCANNER.nextByte();
        System.out.println("ingrese dimensión C (columnas) del 1 al 10: ");
        c = SCANNER.nextByte();
        System.out.println("ingrese coordenada X (filas para sumatoria) del 1 al 10: ");
        x = SCANNER.nextByte();
        x += 1;
        System.out.println("ingrese coordenada Y (columnas para sumatoria) del 1 al 10: ");
        y = SCANNER.nextByte();
        y += 1;
        System.out.println("ingrese dominio Z del 1 al 10: ");
        z = SCANNER.nextByte();

        // crear matríz basada en dimenciones ingresadas
        Matrix matrixClass = new Matrix(r, c, z);

        System.out.println("La Sumatoria por las coordenadas seleccionadas es: ".concat(String.valueOf(matrixClass.additionArray(x, y))));
    }
}
