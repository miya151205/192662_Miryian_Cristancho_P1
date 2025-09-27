import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
         Scanner consola = new Scanner(System.in);
         System.out.println("_____________Primer Ejercicio__________________");
         // aqui pedimos los datos que va a ingresar el usuario
        System.out.println("Ingrese el primer numero");
        int num1 = consola.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = consola.nextInt();
        // aqui iran las condiciones que dependiendo que numeros ingrese el usuario se cambiara lo que muestre el programa
        if (num1 > num2) {
          float suma = num1 + num2;
            System.out.println(" suma: " + suma);
            float resta = num1 - num2;
            System.out.println("diferencia: " + resta);
        } else if (num2==0) {
                System.out.println("divison no definida, el segundo numero es 0, intentalo de nuevo ");
        } else if  (num1==num2) {
            float multiplicacion = num1 * num2;
            System.out.println("producto: " +multiplicacion );
            float division = num1 / num2 ;
            System.out.println("division: " +division );
    
        
        consola.close();
    }

}
}
