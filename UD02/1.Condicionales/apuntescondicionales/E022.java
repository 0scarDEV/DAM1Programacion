package apuntescondicionales;
import java.util.Scanner;

public class E022 {
    // 2.2. Pedir dos números enteros y decir si son iguales o no.
    
    // ESTRUCTURA CONDICIONAL DOBLE (IF - ELSE)
        public static void main(String[] args) {
        // Declaración de variables y constantes
        int num1, num2;
        
        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número entero:");
        num2 = sc.nextInt();
        
        // Proceso y Salida
        if (num1 == num2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        sc.close();
    }
}