package practicas;

import java.util.Scanner;

public class practicas {

    public static void practica1(Scanner sc) { //------------------------------------------------
        //Recopilación datos personales

            System.out.println("Hola, introduzca su nombre: ");
            String nameString = sc.nextLine();

            System.out.println("Introduzca su edad: ");
            int age = sc.nextInt();

            sc.nextLine(); // Limpiar scanner

            System.out.println("Introduzca su ciudad: ");
            String city = sc.nextLine();

            System.out.println("Hola, " + nameString + ". tienes " + age + " años y vives en " + city + ".");

    }

    public static void practica2(Scanner sc) { //------------------------------------------------
        // Suma, resta, multiplicación y división

            System.out.println("Introduce el primer número entero: ");
            int num1 = sc.nextInt();

            System.out.println("Introduce el segundo número entero: ");
            int num2 = sc.nextInt();

            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
            System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
            System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
            System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2));

    }

    public static void practica3(Scanner sc) { //------------------------------------------------
        // Segundos a horas, minutos y segundos

            System.out.println("Introduzca una gran cantidad de segundos: ");
            int seconds = sc.nextInt();

            int hours = seconds / 3600/* 60x60 */; // Sale horas de dividir segundos entre 3600 o entre 60 dos veces seguidas (sec->min->horas)
            int minutes = (seconds % 3600/* 60x60 */) / 60; // Con el resto (segundos que no llegan a una hora) se divide entre 60 para sacar los minutos
            int remainingSeconds = seconds % 60; // Con el resto (segundos que no llegan a un minuto) se sacan los segundos restantes

            System.out.println("El tiempo es: " + hours + " horas, " + minutes + " minutos y " + remainingSeconds + " segundos.");

    }

    public static void practica4(Scanner sc) { //------------------------------------------------
        // Menor o mayor de edad

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

    public static void practica5(Scanner sc) { //------------------------------------------------
        //Cero, positivo o negativo.

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

    }

    public static void practica6(Scanner sc) { //------------------------------------------------
        //Par o impar.

            System.out.println("Introduzca un número entero: ");
            int num = sc.nextInt();

            if (num % 2 == 0) { // Primer if, para comprobar si es par
                
                System.out.println("El número " + num + " es par.");

            } else { // Si no es par, es impar
                System.out.println("El número " + num + " es impar.");
            } // Cierre del primer if

    }

    public static void practica7(Scanner sc) { //------------------------------------------------
        // mayor o igual

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

    }

    public static void practica8(Scanner sc) { //------------------------------------------------
        // Nota alumno. 0.0-4.9 suspenso, 5.0-5.9 suficiente, 6.0-6.9 bien, 7.0-8.9 notable, 9.0-9.9 sobresaliente y 10 matricula de honor, mas de 10 error

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

    }

    public static void practica9(Scanner sc) { //------------------------------------------------
        // Pide la edad y guarda en un String el texto "Mayor de edad" o "Menor de edad" utilizando el operador ternario ?:. Después muéstralo

        String message;

        System.out.println("Introduzca su edad: ");
        int age = sc.nextInt();

        message = (age >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(message);

    }

    public static void practica10(Scanner sc) { //------------------------------------------------
        //Switch

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

    public static void practica11(Scanner sc){ //------------------------------------------------

        System.out.println("------------- MENÚ -------------\n1. Saludar\n2. Mostrar un mensaje\n3. Despedirse\n4. Salir");
        int option=sc.nextInt();

        if (option >0 && option <=4) { // Control de errores

            switch (option) {
                case 1:
                    System.out.println("Buenos días, usuario.");
                    break;
            
                case 2:
                    System.out.println("Mostrando mensaje por pantalla.");
                    break;

                case 3:
                    System.out.println("Hasta luego, usuario.");
                    break;

                case 4:
                    break;
            }

        } else {System.out.println("Has de introducir una opción válida.");}

    }

    public static void practica12(Scanner sc){ //------------------------------------------------

        System.out.println("Introduce el primer número:");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("------------- MENÚ -------------\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Resto\n6. Salir");
        int option=sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("La suma de los números "+num1+" y "+num2+" da un resultado de: "+(num1+num2));
                    break;
            
                case 2:
                    System.out.println("La resta de los números "+num1+" y "+num2+" da un resultado de: "+(num1-num2));
                    break;

                case 3:
                    System.out.println("La multiplicación de los números "+num1+" y "+num2+" da un resultado de: "+(num1*num2));
                    break;

                case 4:
                    System.out.println("La división de los números "+num1+" y "+num2+" da un resultado de: "+(num1/num2));
                    break;

                case 5:
                    System.out.println("El resto de la división de los números "+num1+" y "+num2+" da un resultado de: "+(num1%num2));
                    break;

                case 6:
                    System.out.println("Hasta luego, usuario.");
                    break;

            }
        
    }

    public static void practica12redundancia(Scanner sc){ //------------------------------------------------

        // Ejercicio 12 intentando reducir redundancia, ayuda con IA (explicatorio)
        System.out.println("Introduce el primer número:");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("------------- MENÚ -------------\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Resto\n6. Salir");
        int option=sc.nextInt();

        if (option == 6) { // Sale si el usuario desea salir
            System.out.println("Hasta luego, usuario.");
        return;
        }

        String operation = switch (option) { // segun la opcion que haya elegido, este switch que opera sobre la var operacion con el input de la var option, elegirá el texto que se muestra al final, en el resultado.
        case 1 -> "suma";
        case 2 -> "resta";
        case 3 -> "multiplicación";
        case 4 -> "división";
        case 5 -> "resto de la división";
        default -> null;
    };

    if (operation != null) { // Si la var operación no es null; es decir, se ha seleccionado correctamente, este switch opera sobre la var result, con el input de la var option
        double result = switch (option) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> num1 / num2;
            case 5 -> num1 % num2;
            default -> 0;
        };

        System.out.println("La "+operation+" de los números "+num1+" y "+num2+" da un resultado de "+result+".");

        //System.out.printf("La %s de los números %.2f y %.2f da un resultado de: %.2f%n", 
        //                  operacion, num1, num2, result);

    } else {
        System.out.println("Opción no válida."); // Control de errores, al elegir un número que no se asigna en la var operacion, el valor de esta sigue siendo null, no entra en el if, y el else la saca mostrando mensaje.
    }

    }

    public static void practica13(){ //------------------------------------------------

        for (int i = 0;i <= 10;i++) { // para i = 0, mientras i sea menor o igual a 10, sumar una unidad a i por cada instancia del bucle.
                System.out.println(i); // Muestra cada intancia del bucle hasta que i deje de ser menor o igual a 10.
            }
        
    }

    public static void practica14(){ //------------------------------------------------

        for (int i = 10;i >= 0;i--) { // para i = 10, mientras i sea mayor o igual a 10, restar una unidad a i por cada instancia del bucle.
                System.out.println(i); // Muestra cada intancia del bucle hasta que i deje de ser mayor o igual a 10.
            }
        
    }

    public static void practica15(Scanner sc){ //------------------------------------------------

        System.out.println("Introduzca un número para visualizar su tabla de multiplicación: ");
        int num=sc.nextInt();

        for (int i = 0;i<=10;i++) {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
        
    }

    public static void practica16(Scanner sc){ //------------------------------------------------

        
        
    }




}