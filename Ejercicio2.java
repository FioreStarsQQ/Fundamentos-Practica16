
/*
EJERCICIO 2:  Queremos hacer un programa que cuente cuántos números
enteros positivos y cuántos negativos ingresa el usuario. El
programa ha de mostrar los resultados finales y acabar la
ejecución cuando el usuario introduzca un cero
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, contadorNegativos = 0, contadorPositivos = 0;
        do {
            System.out.print("Ingrese un número: ");
            num = scan.nextInt();
            if (num < 0)
                contadorNegativos++;
            else if (num > 0)
                contadorPositivos++;
        } while (num != 0);
        System.out.print("\n* Cantidad de números positivos: " + contadorPositivos + "\n* Cantidad de números negativos: " + contadorNegativos);
        scan.close();
    }
}