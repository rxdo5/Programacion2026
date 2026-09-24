import java.lang.*;
import java.util.*;

public class UT2 {

        public static void ejercicio1() { //------------------------------------------------
            
        }

        public static void ejercicio2() { //------------------------------------------------
            
        }

        public static void ejercicio3() { //------------------------------------------------
            
        }

        public static void ejercicio4() { //------------------------------------------------
            double nota1 = 7.8;
            double nota2 = 4.7;
            double nota3 = 5.6;
            double media = (nota1 + nota2 + nota3) / 3;
            double mediaRedondeada = Math.round(media);
            
            System.out.println("Nota de la 1 evaluación: " + nota1);
            System.out.println("Nota de la 2 evaluación: " + nota2);
            System.out.println("Nota de la 3 evaluación: " + nota3);
            System.out.println("La nota media del alumno es: "+ media);
            System.out.println("La nota media redondeada: " + mediaRedondeada);
        }

        public static void ejercicio5() { //------------------------------------------------
            int h = 3;
    		int l = 5;
    		int p = (h*2) + (l*2);
    		int a = h * l;
            
    		System.out.println("En un rectángulo con una altura de " + h + " unidades y una longitud de " + l + " unidades, las medidas son las siguientes:");
    		System.out.println("El Perímetro es de: " + p + " unidades");
    		System.out.println("El Área es de: " + a + " unidades");
        }

        public static void ejercicio6() { //------------------------------------------------
            int r = 2;

            System.out.println("En un círculo con un radio de " + r + " unidades, las medidas son las siguientes:");
    		System.out.println(" El perimetro del circulo es " + (2 * Math.PI * r));
    		System.out.println(" El area del circulo es " + (Math.PI * (r * r)));
        }

        public static void ejercicio7() { //------------------------------------------------
            
        }

        public static void ejercicio8() { //------------------------------------------------
            
        }

        public static void ejercicio9() { //------------------------------------------------
            
        }

        public static void ejercicio10() { //------------------------------------------------
            
        }

        public static void ejercicio11() { //------------------------------------------------
            
        }

        public static void ejercicio12() { //------------------------------------------------
            
        }

        public static void ejercicio13() { //------------------------------------------------
            int f = 100;
            double c = (5.0 / 9.0) * (f - 32);
    
            System.out.println(f + "º farenheit en celsius son " + c + "º");
        }

        public static void ejercicio14() { //------------------------------------------------
            
        }

        public static void ejercicio15() { //------------------------------------------------
            
        }

        public static void ejercicio16() { //------------------------------------------------
            
        }

        public static void explicacionScanner() { //------------------------------------------------
                Scanner sc = new Scanner(System.in);

                //num1
                System.out.println("Introduce el primer número (Debe ser entero):");
                int num1 = sc.nextInt();

                //num2
                System.out.println("Introduce el segundo número (Debe ser entero):");
                int num2 = sc.nextInt();

                //addition
                System.out.println("La suma de ambos números es " + (num1 + num2) + ".");
				
				//clean \n before a new sc.nextLine()
				sc.nextLine();
				
                //name
                System.out.println("Introduce tu nombre:");
            
                String nameLine = sc.nextLine(); // only reads till next \n
					// String nameSpace = sc.next(); //incase you only want to read first word or till next space

                //name output
                System.out.println("El nombre completo introducido es " + nameLine + ".");
                    // System.out.println("El nombre único introducido es " + nameSpace + "."); //incase you only want to display first word or till next space

                //close scanner
                sc.close();   
        }

        public static void ejercicio17() { //------------------------------------------------
                Scanner sc = new Scanner(System.in);

                System.out.println("Vamos a calcular el perímetro y área de un rectángulo o cuadrado.\nIntroduce la altura que tendrá:");
                int h = sc.nextInt();
            
                System.out.println("La altura es: "+ h +". Ahora introduce la longitud:");
                int l = sc.nextInt();

                int p = (h*2) + (l*2);
        		int a = h * l;
            
        		System.out.println("En un rectángulo con una altura de " + h + " unidades y una longitud de " + l + " unidades, las medidas son las siguientes: \n");
        		System.out.println("El Perímetro es de: " + p + " unidades");
        		System.out.println("El Área es de: " + a + " unidades");

                sc.close();
        }

        public static void ejercicio18() { //------------------------------------------------
                Scanner sc = new Scanner(System.in);

                System.out.println("Vamos a calcular el perímetro y área de un círculo.\nIntroduce el radio que tendrá:");
                int r = sc.nextInt();

                System.out.println("En un círculo con un radio de " + r + " unidades, las medidas son las siguientes:");
        		System.out.println(" El perimetro del circulo es " + (2 * Math.PI * r));
        		System.out.println(" El area del circulo es " + (Math.PI * (r * r)));

                sc.close();
        }

        public static void ejercicio19() { //------------------------------------------------
                Scanner sc = new Scanner(System.in);
    
                System.out.println("Introduce el capital a ingresar al 1,5% TAE");
                int deposit = sc.nextInt();

                int winnings = (deposit / 100) * 15;
            
                System.out.println("Las ganancias serán: "+ winnings +".");
                System.out.println("El saldo final será de: "+ (deposit + winnings) +".");
                
            
                sc.close();
        }

}