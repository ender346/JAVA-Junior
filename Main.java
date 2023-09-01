import java.util.Scanner;

 public class Main {
 public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);
 System.out.println("Calculadora Simple");
 System.out.print("Ingrese dato 1: ");
 double num1 = scanner.nextDouble();

 System.out.print("Ingrese dato 2: ");
 double num2 = scanner.nextDouble();

 System.out.println("Elige una operacion:");
 System.out.println("Suma");
 System.out.println("Resta");
 System.out.println("Multiplicacion");
 System.out.println("Divicion");
 int opcion = scanner.nextInt();

 double resultado = 0;

 switch (opcion){

       case 1 :
       resultado = num1 + num2;
         break;
       case 2 :
       resultado = num1 - num2;
         break;
       case 3 :
       resultado = num1 * num2;
         break;
       case 4 :
       resultado = num1 / num2;
         break;
       default:

 System.out.println("Opcion invalida");
 return;
              }

 System.out.println("Resultado de la operacion: " + resultado);

 scanner.close();

   }
 }




