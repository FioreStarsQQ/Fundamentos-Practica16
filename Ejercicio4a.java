
/*
EJERCICIO 4: Suponga que se tiene calificaciones finales de un grupo de n
alumnos. Realizar un programa para calcular la calificación
promedio y la calificación más baja del grupo. Escala de
calificaciones de 0..20
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio4a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, suma=0, promedio, i = 1;
        double nota1, nota, min;
        System.out.print("Ingrese la cantidad de alumnos: ");
        n = scan.nextInt();
        System.out.print("Ingrese la nota: ");
        nota1 = scan.nextDouble();
        min = nota1;
        i++;
        while (i <= n) {
            System.out.print("Ingrese la nota: ");
            nota = scan.nextDouble();
            suma += nota;
            if (min > nota) {
                min = nota;
            }
            i++;
        }
        promedio = (int) Math.round((suma + nota1) / n);
        System.out.println("Este es el promedio: " + promedio + "\nLa nota mínima fue: " + min);
        scan.close();
    }
}