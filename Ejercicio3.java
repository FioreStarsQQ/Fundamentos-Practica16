/*
EJERCICIO 3: Pedir sucesivamente por teclado un número entero hasta que
el número sea un valor comprendido entre m y n. Con control
de repetición medio y sin él. Mostrar la cantidad de intentos
realizados para lograr. No confiar en el usuario!!!
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorInicial, valorFinal, num = 0, intentos = 0;
        System.out.print("Ingrese el número incial de un rango: ");
        valorInicial = scan.nextInt();
        System.out.print("Ingrese el número final de un rango: ");
        valorFinal = scan.nextInt();
        do {
            System.out.print("Ingrese un número dentro del rango establecido: ");
            num = scan.nextInt();
            intentos++;
        } while (num < valorInicial || num > valorFinal);
        System.out.print("\nEsta es la cantidad de intentos que realizaste: " + intentos);
        scan.close();
    }
}