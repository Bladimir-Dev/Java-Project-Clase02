package Ejercicios02;

import java.util.Scanner;

public class PrintPalabras {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.print("Digite la palabra 1: ");
        var palabra1 = scanner.nextLine();
        System.out.print("Digite una palabra 2 : ");
        var palabra2 = scanner.nextLine();
        System.out.print("Digite la palabra 3: ");
        var palabra3 = scanner.nextLine();
        System.out.print("Digite la palabra 3: ");

        System.out.println("Las palabras ingresadas fueron: "+palabra1+ ", " +palabra2+ " y " +palabra3);

        scanner.close();

    }

}