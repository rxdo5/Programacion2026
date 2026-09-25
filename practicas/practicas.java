package practicas;

import java.util.Scanner;

public class practicas {

    public static void practica1() { //------------------------------------------------
        //Recopilación datos personales
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Hola, introduzca su nombre: ");
            String nameString = sc.nextLine();

            System.out.println("Introduzca su edad: ");
            int age = sc.nextInt();

            sc.nextLine(); // Limpiar scanner

            System.out.println("Introduzca su ciudad: ");
            String city = sc.nextLine();

            System.out.println("Hola, " + nameString + ". tienes " + age + " años y vives en " + city + ".");

        } //autoclose scanner

    }

    public static void practica2() { //------------------------------------------------
        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Introduce el primer número entero: ");
            int num1 = sc.nextInt();

            System.out.println("Introduce el segundo número entero: ");
            int num2 = sc.nextInt();

            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
            System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
            System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
            System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2));

        } 
    }

    public static void practica3() { //------------------------------------------------

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Introduzca una gran cantidad de segundos: ");
            int seconds = sc.nextInt();

            int hours = seconds / 3600/* 60x60 */; // Sale horas de dividir segundos entre 3600 o entre 60 dos veces seguidas (sec->min->horas)
            int minutes = (seconds % 3600/* 60x60 */) / 60; // Con el resto (segundos que no llegan a una hora) se divide entre 60 para sacar los minutos
            int remainingSeconds = seconds % 60; // Con el resto (segundos que no llegan a un minuto) se sacan los segundos restantes

            System.out.println("El tiempo es: " + hours + " horas, " + minutes + " minutos y " + remainingSeconds + " segundos.");

        }

    }

    public static void practica4() { //------------------------------------------------

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Introduzca su edad: ");
            int age = sc.nextInt();

            if (age>0){ // Primer if, para evitar numeros negativos
            
                if (age < 18) { // Segundo if, para comprobar si es menor de edad
                    System.out.println("Eres menor de edad.");
                } else if (age >= 18) {
                    System.out.println("Eres mayor de edad.");
                } // Cierre del segundo if

            } else { // Cierre del primer if, para evitar numeros negativos. Sale del programa si es el caso.
                System.out.println("Edad no válida. Exiting...");
                System.exit(1);
            } // Cierre del else del primer if

        }

    }

    public static void practica5() { //------------------------------------------------

    }

    public static void practica6() { //------------------------------------------------

    }


}