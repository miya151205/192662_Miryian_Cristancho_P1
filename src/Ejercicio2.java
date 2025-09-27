import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("_________Ejercicio 2_________");
        float promedio = 0;
        //se crea el array para ingresar las notas
        float[] notas = new float[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese las notas del estudiante");

             notas[i] = consola.nextFloat();
             promedio = notas[i] + promedio;
        }
        promedio = promedio / notas.length;
            //se crean las condicionales para saber cual es su promedio o estado
            if (promedio>=4.5) {
                System.out.println("promedio " +promedio);
               System.out.println("su estado es:Promocionado"); 
            }else if (promedio <= 4.0 || promedio < 4.5 ) {
                System.out.println("promedio " +promedio);
                System.out.println("su estado es:Regular");
            }else if (promedio<4.0) {
                System.out.println("promedio " +promedio);
                System.out.println("su estado es:Reprobado");
            }
            consola.close();
        }

}