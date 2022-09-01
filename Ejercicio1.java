/*
EJERCICIO 1: Mostrar los números enteros desde m hasta n que sean
múltiplos de 5. Confiar en usuario que m<=n
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n, i = 0;
        System.out.print("Ingrese el número incial de un rango: ");
        m = scan.nextInt();
        System.out.print("Ingrese el número final de un rango: ");
        n = scan.nextInt();
        while (m <= n) {
            if (m % 5 == 0) {
                System.out.println(m);
                i++;
            }
            m++;
        }
        System.out.println("Existen: " + i + " números múltiplos de 5.");
        scan.close();
    }
}