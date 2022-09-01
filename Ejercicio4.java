
/*
EJERCICIO 4: Suponga que se tiene calificaciones finales de un grupo de n
alumnos. Realizar un programa para calcular la calificación
promedio y la calificación más baja del grupo. Escala de
calificaciones de 0..20
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,nota1, nota, min, suma = 0, i = 1;
        double  promedio;
        System.out.print("Ingrese la cantidad de alumnos: ");
        n = scan.nextInt();
        System.out.print("Ingrese la nota N° " + i + ": ");
        nota1 = scan.nextInt();
        min = nota1;
        i++;
        for (int contador = i; contador <= n; contador++) {
            System.out.print("Ingrese la nota N° " + contador + ": ");
            nota = scan.nextInt();
            suma += nota;
            if (min > nota)
                min = nota;
        }
        promedio = (double) Math.round(((double)(suma + nota1) / n)*100)/100;
        System.out.println("Este es el promedio de las calificaciones: " + promedio + "\nLa nota mínima fue: " + min);
        scan.close();
    }
}