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

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /// Cargar 3 numeros y mostrar el menor y el mayor
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cargue un dato");
        int numero1 = teclado.nextInt();
        System.out.println("Cargue un dato");
        int numero2 = teclado.nextInt();
        System.out.println("Cargue un dato");
        int numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero mas grande es: " + numero1);
        }
        if (numero3 > numero2 && numero3 > numero1){
            System.out.println("El numero mas grande es: " + numero3);
        }
        if (numero2 > numero1 && numero2 > numero3){
            System.out.println("El numero mas grande es: " + numero3);
        }

        /**
         float promedio = (numero1 + numero2 + numero3) / 3;
         System.out.println("Promedio: " + promedio);
         */
        /**
         Scanner teclado = new Scanner(System.in);
         System.out.println("Cargue un dato");
         int numero1 = teclado.nextInt();

         int resto = numero1 % 2;
         if (resto == 0){
         System.out.println("Es par");
         }else {
         System.out.println("Es impar");
         }
         */
    }
}


/**
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] adjetivos = {"Electrizante", "Épico", "Innovador", "Luminoso", "Mágico"};
        String[] sustantivos = {"Dragón", "Universo", "Sueño", "Montaña", "Galaxia"};

        Random random = new Random();
        String nombreBanda = adjetivos[random.nextInt(adjetivos.length)] + " " +
                sustantivos[random.nextInt(sustantivos.length)];

        System.out.println("¡Bienvenidos al escenario a la banda: " + nombreBanda + "!");
    }
}

*/


// Ejecicio 1
/**

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
 */

/**
public class Main {
    public static void main(String[] args) {
        int p = 10;
        int r = 5;
        int q = 3;
        int w = 14;
        int x = 2;
        int y = 5;

        int z = (((p * r) / q) + w) * x - y;

        System.out.println("El valor de z es: " + z);
    }
}
 */

import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();
        
        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = input.next().charAt(0);
        
        double resultado = 0;
        
        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }
        
        System.out.println("El resultado es: " + resultado);
    }
}

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = input.nextInt();
        
        boolean esPrimo = true;
        
        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
}



import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = input.nextInt();
        
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}


import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = input.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
}


import java.util.Scanner;

public class SumaNumerosPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = input.nextInt();
        
        int suma = 0;
        
        for (int i = 2; i <= numero; i += 2) {
            suma += i;
        }
        
        System.out.println("La suma de números pares hasta " + numero + " es " + suma);
    }
}


import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la base del triángulo: ");
        double base = input.nextDouble();
        
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = input.nextDouble();
        
        double area = 0.5 * base * altura;
        
        System.out.println("El área del triángulo es: " + area);
    }
}


import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la base del triángulo: ");
        double base = input.nextDouble();
        
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = input.nextDouble();
        
        double area = 0.5 * base * altura;
        
        System.out.println("El área del triángulo es: " + area);
    }
}





import java.security.SecureRandom;

public class GeneradorContrasena {
    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        SecureRandom random = new SecureRandom();
        
        StringBuilder contrasena = new StringBuilder();
        int longitud = 12; // Longitud deseada de la contraseña
        
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(index);
            contrasena.append(caracter);
        }
        
        System.out.println("Contraseña generada: " + contrasena.toString());
    }
}



// Calculadora Protm

import java.util.Scanner;

public class CalculadoraPromedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la primera calificación: ");
        double calificacion1 = input.nextDouble();
        
        System.out.print("Ingrese la segunda calificación: ");
        double calificacion2 = input.nextDouble();
        
        System.out.print("Ingrese la tercera calificación: ");
        double calificacion3 = input.nextDouble();
        
        // Calcular el promedio
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;
        
        // Mostrar el resultado
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}










