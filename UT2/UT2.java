package ut2;

import java.util.Scanner;

public class ut2 {

        public static void ejercicio3() { //------------------------------------------------
            //Nombre del programa: Ejercicio 3
            //1ºMV
            //Ricardo Arroyo Iñiguez
            
            String name = "Ricardo"; 
            String surnames = "Arroyo Íñiguez";
            int age = 21;
            boolean enrolled= true;
            double average= 0.5;

            System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
            System.out.println("El alumno se llama: " + name+" "+surnames);
            System.out.println("Tiene: " + age+" años");
            System.out.println("Matriculado: " + enrolled);
            System.out.println("Nota media: " + average);
        }

        public static void ejercicio4() { //------------------------------------------------
            // Calcular la nota media
            double grade1 = 7.8;
            double grade2 = 4.7;
            double grade3 = 5.6;
            double average = (grade1 + grade2 + grade3) / 3;
            double averageRounded = Math.round(average);
            
            System.out.println("Nota de la 1 evaluación: " + grade1);
            System.out.println("Nota de la 2 evaluación: " + grade2);
            System.out.println("Nota de la 3 evaluación: " + grade3);
            System.out.println("La nota media del alumno es: "+ average);
            System.out.println("La nota media redondeada: " + averageRounded);
        }

        public static void ejercicio5() { //------------------------------------------------
            //Escriba un programa que visualice el área y perímetro de un rectángulo de lados 3ud y 5ud.
            //Seleccione los tipos de datos adecuados. La salida se realizará en la misma línea.

            int h = 3;
    		int l = 5;
    		int p = (h*2) + (l*2);
    		int a = h * l;
            
    		System.out.println("En un rectángulo con una altura de " + h + " unidades y una longitud de " + l + " unidades, las medidas son las siguientes:");
    		System.out.println("El Perímetro es de: " + p + " unidades");
    		System.out.println("El Área es de: " + a + " unidades");
        }

        public static void ejercicio6() { //------------------------------------------------
            //Escriba un programa que visualice el área y perímetro de un círculo de radio 2ud. Seleccione los tipos de datos adecuados.
            int r = 2;

            System.out.println("En un círculo con un radio de " + r + " unidades, las medidas son las siguientes:");
    		System.out.println(" El perimetro del circulo es " + (2 * Math.PI * r));
    		System.out.println(" El area del circulo es " + (Math.PI * (r * r)));
        }

        public static void ejercicio7() { //------------------------------------------------
            // Escriba un programa que visualice el volumen de un cilindro, teniendo en cuenta que el radio=23.4 y altura=120.2
            double r = 23.4;
            double h = 120.2;

            System.out.println("Datos del cilindro: ");
            System.out.println("Radio: " + r);
            System.out.println("Altura: " + h);
            System.out.println("El volumen del cilindro es: " + (Math.PI * (r * r) * h));
        }

        public static void ejercicio8() { //------------------------------------------------
            //Escriba un programa que visualice la nota media de las siguientes asignaturas: Matemáticas, Lengua,Inglés, Informática.
            String name = "Mónica García";
            int math = 6;
            int spanish = 7;
            int english = 4;
            int computer = 6;
            double average = (math + spanish + english + computer) / 4.0;

            System.out.println("Alumna: " + name);
            System.out.println("Matemáticas: " + math);
            System.out.println("Lengua: " + spanish);
            System.out.println("Inglés: " + english);
            System.out.println("Informática: " + computer);
            System.out.println("Nota media: " + average);   
        }

        public static void ejercicio9() { //------------------------------------------------
            //Escriba un programa que visualice el precio final de compra de una camiseta cuyo precio es 15€. La camiseta tiene un descuento del 20% y el IVA aplicable es del 17%
            String article = "Camiseta";
            double value = 15.0; // Precio

            double discountAmount = value * 0.2; // 20% del precio base
            double valueAfterDiscount = value - discountAmount; // Precio después del descuento del 20%
            double vatAmount = valueAfterDiscount * 0.17; // 17% del precio sin IVA 
            double afterTaxes = valueAfterDiscount + vatAmount; // Precio final con IVA

            System.out.println("Artículo: " + article);
            System.out.println("Precio base: " + value + "€");
            System.out.println("Descuento aplicado: " + (discountAmount) + "€");
            System.out.println("Importe con IVA: " + afterTaxes + "€");
        }

        public static void ejercicio11() { //------------------------------------------------
            //Muestra el resultado de cada una de las siguientes expresiones lógicas (booleanas)
            int x = 1; // que valor debería ser x?

            boolean a = (true) && (3 > 4);
            boolean b = (true) && (x > 4);
            boolean c = !(x > 0) && (x > 0);
            boolean d = (x > 0) || (x < 0);
            boolean e = (x != 0) || (x == 0);
            boolean f = (x >= 0) || (x < 0);
           // boolean g = (x != 1) == !(x = 1); no resulta posible

            System.out.println("Resultado de (true) && (3 > 4): " + a);
            System.out.println("Resultado de (true) && (x > 4): " + b);
            System.out.println("Resultado de !(x > 0) && (x > 0): " + c);
            System.out.println("Resultado de (x > 0) || (x < 0  ): " + d);
            System.out.println("Resultado de (x != 0) || (x == 0): " + e);
            System.out.println("Resultado de (x >= 0) || (x < 0): " + f);
        }

        public static void ejercicio12() { //------------------------------------------------
            //Defina los siguientes tipos enumerados: 
            String grades = "Sobresaliente, Notable, Bien, Suficiente, Insuficiente";
            String months = "Enero, Febrero, Marzo";
            String civilStatus = "Soltero, Casado, Divorciado, Viudo";
            String musicalNotes = "Do, Re, Mi, Fa, Sol, La, Si";

            System.out.println("Calificaciones: " + grades);
            System.out.println("Meses: " + months);
            System.out.println("Estado civil: " + civilStatus);
            System.out.println("Notas musicales: " + musicalNotes);
        }

        public static void ejercicio13() { //------------------------------------------------
            double f = 100.0;
            double c = (5.0 / 9.0) * (f - 32.0);
    
            System.out.println(f + "º farenheit en celsius son " + c + "º");
        }

        public static void ejercicio14() { //------------------------------------------------
            //Realice un programa que muestre el 123 utilizando cada uno de los tipos básicos. Analice la salida.
            byte varByte = 123;
            short varShort = 123;
            int varInt = 123;
            long varLong = 123;
            float varFloat = 123;
            double varDouble = 123;
            char varChar = 123;
            String varString = "123";

            System.out.println("Byte " + varByte + ", Short " + varShort + ", Int " + varInt + ", Long " + varLong + ", Float " + varFloat + ", Double " + varDouble + ", Char " + varChar + ", String " + varString);
        }

        public static void ejercicio15() { //------------------------------------------------
            // Realice un programa que muestre el 1234.5 utilizando cada uno de los tipos básicos. Analice la salida. 
            byte varByte = (byte) 1234.5;
            short varShort = (short) 1234.5;
            int varInt = (int) 1234.5;
            long varLong = (long) 1234.5;
            float varFloat = (float) 1234.5;
            double varDouble = 1234.5;
            char varChar = (char) 1234.5;
            String varString = "1234.5";

            System.out.println("Byte " + varByte + ", Short " + varShort + ", Int " + varInt + ", Long " + varLong + ", Float " + varFloat + ", Double " + varDouble + ", Char " + varChar + ", String " + varString);
        }

        public static void ejercicio16() { //------------------------------------------------
            // Realice un programa que muestre el 1234567890.5 utilizando cada uno de los tipos básicos. Analice la salida.
            byte varByte = (byte) 1234567890.5;
            short varShort = (short) 1234567890.5;
            int varInt = (int) 1234567890.5;
            long varLong = (long) 1234567890.5;
            float varFloat = (float) 1234567890.5;
            double varDouble = 1234567890.5;
            char varChar = (char) 1234567890.5;
            String varString = "1234567890.5";

            System.out.println("Byte " + varByte + ", Short " + varShort + ", Int " + varInt + ", Long " + varLong + ", Float " + varFloat + ", Double " + varDouble + ", Char " + varChar + ", String " + varString);

        }

        public static void explicacionScanner(Scanner sc) { //------------------------------------------------

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

        }

        public static void ejercicio17(Scanner sc) { //------------------------------------------------
            // Ejercicio 5 con Scanner

            System.out.println("Vamos a calcular el perímetro y área de un rectángulo o cuadrado.\nIntroduce la altura que tendrá:");
            int h = sc.nextInt();
        
            System.out.println("La altura es: "+ h +". Ahora introduce la longitud:");
            int l = sc.nextInt();

            int p = (h*2) + (l*2);
            int a = h * l;
        
            System.out.println("En un rectángulo con una altura de " + h + " unidades y una longitud de " + l + " unidades, las medidas son las siguientes: \n");
            System.out.println("El Perímetro es de: " + p + " unidades");
            System.out.println("El Área es de: " + a + " unidades");

        }

        public static void ejercicio18(Scanner sc) { //------------------------------------------------
            // Ejercicio 6 con Scanner

            System.out.println("Vamos a calcular el perímetro y área de un círculo.\nIntroduce el radio que tendrá:");
            int r = sc.nextInt();

            System.out.println("En un círculo con un radio de " + r + " unidades, las medidas son las siguientes:");
            System.out.println(" El perimetro del circulo es " + (2 * Math.PI * r));
            System.out.println(" El area del circulo es " + (Math.PI * (r * r)));

        }

        public static void ejercicio19(Scanner sc) { //------------------------------------------------
            //Escriba un programa que visualice los intereses que pagará un banco después de 12 meses si tenemos una cuenta a plazo fijo al 1,5% anual y la cantidad la introduce el usuario por teclado.

            System.out.println("Introduce el capital a ingresar al 1,5% TAE");
            double deposit = sc.nextDouble();

            double interest = (deposit * 0.015);
        
            System.out.println("Los intereses generados serán: "+ interest +".");
            System.out.println("El saldo final será de: "+ (deposit + interest) +".");

        }

        public static void ejercicio20(Scanner sc) { //------------------------------------------------
            //Modifique el programa anterior teniendo en cuenta que a los intereses abonados se les aplica una retención del 20% sobre los intereses .

            System.out.println("Introduce el capital a ingresar al 1,5% TAE con una retención del 20%");
            double deposit = sc.nextDouble();

            double interest = (deposit * 0.015);
            double retention = (interest * 0.20);
        
            System.out.println("Los intereses generados serán: "+ interest +".");
            System.out.println("Con una retención de: "+ retention +".");
            System.out.println("Dando una suma de: "+ (interest - retention) +".");
            System.out.println("El saldo final será de: "+ (deposit + interest - retention) +".");

        }
        
        public static void ejercicio21(Scanner sc) { //------------------------------------------------
			
			System.out.println("Introduce un número de segundos: ");
			int secondsInput = sc.nextInt();
			
			int seconds = seconds%60
			int minutes = seconds/60
			int hours = seconds/3600
			
			System.out.println("Hay "+hours+" horas, "+mminutes+" minutos y "+seconds+" segundos.");
			
		}

}
