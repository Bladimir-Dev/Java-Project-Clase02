package Ejercicios02;
import java.util.Scanner;

public class SaludoPersonal {

    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);

        System.out.print("Bienvenido/a cual es tu nombre?: ");

        var nombre = entrada.nextLine();

        System.out.println("Te damos la bienvenido al curso de java de cero a senior "+nombre);

        entrada.close();



    }
    
}