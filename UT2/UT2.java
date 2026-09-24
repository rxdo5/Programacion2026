import java.util.Scanner;

public class UT2 {

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
            
        }

        public static void ejercicio15() { //------------------------------------------------
            
        }

        public static void ejercicio16() { //------------------------------------------------
            
        }

        public static void explicacionScanner() { //------------------------------------------------
                try(Scanner sc = new Scanner(System.in)) {

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

                } //autoclose scanner
        }

        public static void ejercicio17() { //------------------------------------------------
                 try(Scanner sc = new Scanner(System.in)) {

                System.out.println("Vamos a calcular el perímetro y área de un rectángulo o cuadrado.\nIntroduce la altura que tendrá:");
                int h = sc.nextInt();
            
                System.out.println("La altura es: "+ h +". Ahora introduce la longitud:");
                int l = sc.nextInt();

                int p = (h*2) + (l*2);
        		int a = h * l;
            
        		System.out.println("En un rectángulo con una altura de " + h + " unidades y una longitud de " + l + " unidades, las medidas son las siguientes: \n");
        		System.out.println("El Perímetro es de: " + p + " unidades");
        		System.out.println("El Área es de: " + a + " unidades");

                } //autoclose scanner
        }

        public static void ejercicio18() { //------------------------------------------------
                try(Scanner sc = new Scanner(System.in)) {      

                System.out.println("Vamos a calcular el perímetro y área de un círculo.\nIntroduce el radio que tendrá:");
                int r = sc.nextInt();

                System.out.println("En un círculo con un radio de " + r + " unidades, las medidas son las siguientes:");
        		System.out.println(" El perimetro del circulo es " + (2 * Math.PI * r));
        		System.out.println(" El area del circulo es " + (Math.PI * (r * r)));

                } //autoclose scanner
        }

        public static void ejercicio19() { //------------------------------------------------
                try(Scanner sc = new Scanner(System.in)) {

                System.out.println("Introduce el capital a ingresar al 1,5% TAE");
                int deposit = sc.nextInt();

                int winnings = (deposit / 100) * 15;
            
                System.out.println("Las ganancias serán: "+ winnings +".");
                System.out.println("El saldo final será de: "+ (deposit + winnings) +".");
                
                } //autoclose scanner
        }

}