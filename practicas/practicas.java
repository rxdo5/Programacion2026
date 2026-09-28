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
        // Suma, resta, multiplicación y división
        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Introduce el primer número entero: ");
            int num1 = sc.nextInt();

            System.out.println("Introduce el segundo número entero: ");
            int num2 = sc.nextInt();

            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
            System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
            System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
            System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2));

        } //autoclose scanner
    }

    public static void practica3() { //------------------------------------------------
        // Segundos a horas, minutos y segundos
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Introduzca una gran cantidad de segundos: ");
            int seconds = sc.nextInt();

            int hours = seconds / 3600/* 60x60 */; // Sale horas de dividir segundos entre 3600 o entre 60 dos veces seguidas (sec->min->horas)
            int minutes = (seconds % 3600/* 60x60 */) / 60; // Con el resto (segundos que no llegan a una hora) se divide entre 60 para sacar los minutos
            int remainingSeconds = seconds % 60; // Con el resto (segundos que no llegan a un minuto) se sacan los segundos restantes

            System.out.println("El tiempo es: " + hours + " horas, " + minutes + " minutos y " + remainingSeconds + " segundos.");

        } //autoclose scanner

    }

    public static void practica4() { //------------------------------------------------
        // Menor o mayor de edad
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

        } //autoclose scanner

    }

    public static void practica5() { //------------------------------------------------
        //Cero, positivo o negativo.
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Introduzca un número entero: ");
            int num = sc.nextInt();

            if (num == 0) { // Primer if, para comprobar si es cero
                
                System.out.println("El número " + num + " es cero.");

            } else { // Si no es cero, se comprueba si es positivo o negativo
               if (num > 0) {
                    System.out.println("El número " + num + " es positivo.");
                } else {
                    System.out.println("El número " + num + " es negativo.");
                } // Cierre del segundo if
               
            } // Cierre del primer if

        } //autoclose scanner
    }

    public static void practica6() { //------------------------------------------------
        //Par o impar.
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Introduzca un número entero: ");
            int num = sc.nextInt();

            if (num % 2 == 0) { // Primer if, para comprobar si es par
                
                System.out.println("El número " + num + " es par.");

            } else { // Si no es par, es impar
                System.out.println("El número " + num + " es impar.");
            } // Cierre del primer if

        } //autoclose scanner
    }

    public static void practica7() { //------------------------------------------------
        // mayor o igual
        try (Scanner sc=new Scanner(System.in)) {

            System.out.println("Introduzca el primer número entero: ");
            int num1 = sc.nextInt();
            
            System.out.println("Introduzca el segundo número entero: ");
            int num2 =sc.nextInt();

            if (num1 == num2) {
                System.out.println("El número  "+num1+" es igual que el número "+num2+".");
            }else{

                if (num1 > num2) {
                    System.out.println("El número  "+num1+" es mayor que el número "+num2+".");
                } else {
                System.out.println("El número  "+num2+" es mayor que el número "+num1+".");
                }

            }

        } //autoclose scanner
    }

    public static void practica8() { //------------------------------------------------
        // Nota alumno. 0.0-4.9 suspenso, 5.0-5.9 suficiente, 6.0-6.9 bien, 7.0-8.9 notable, 9.0-9.9 sobresaliente y 10 matricula de honor, mas de 10 error
        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Introduzca la nota del alumno: ");
            double grade = sc.nextDouble();

            if (grade >= 0.0 && grade <= 10.0) {

                if (grade < 5.0) {
                    System.out.println("El alumno esta suspenso.");
                } else  if (grade < 6.0) {
                        System.out.println("El alumno tiene un suficiente.");
                    } else if (grade < 7.0) {
                            System.out.println("El alumno tiene un bien.");
                        } else  if (grade < 9.0) {
                                System.out.println("El alumno tiene un notable.");
                            } else if (grade < 10.0) {
                                    System.out.println("El alumno tiene un sobresaliente.");
                                } else  if (grade == 10.0) {
                                        System.out.println("El alumno tiene matricula de honor.");
                                    };

            } else {
                System.out.println("La nota debe estar entre 0 y 10.");
            }

        } //autoclose scanner
    }

    public static void practica9() { //------------------------------------------------
        // Bloque 3 Ejercicio 32  Operador ternario y switch

        boolean overage = false;
        try(Scanner sc=new Scanner(System.in)) {

            System.out.println("Introduzca su edad: ");
            int age = sc.nextInt();


            if (age > 0 && age <= 120) {

                if (age>=18) {
                    overage = true;
                } else {
                    overage = false;
                }

            }  else {
                System.out.println("Introduzca una edad correcta.");
            }


            System.out.println("¿Es el usuario mayor de edad? "+ overage);

        }

    }

    public static void practica10(Scanner sc) { //------------------------------------------------

        System.out.println("Introduzca el número del día de la semana:");
        int day = sc.nextInt();

        if (day>0 && day<=7 ) {

            switch (day) {
                case 1:
                    System.out.println("Es lunes");
                    break;
                case 2:
                    System.out.println("Es martes");
                    break;
                case 3:
                    System.out.println("Es miércoles");
                    break;
                case 4:
                    System.out.println("Es jueves");
                    break;
                case 5:
                    System.out.println("Es viernes");
                    break;
                case 6:
                    System.out.println("Es sábado");
                    break;
                case 7:
                    System.out.println("Es domingo");
                    break;
            }

        } else { System.out.println("Introduzca un número entre el 1 y el 7."); }

    }


}