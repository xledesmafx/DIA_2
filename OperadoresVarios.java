
import java.util.Scanner;

public class OperadoresVarios {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n-EJERCICIO 1-");
        operacionesMatematicas();
        System.out.println("\n-EJERCICIO 2-");
        numeroMayor();
        System.out.println("\n-EJERCICIO 3-");
        mensajeSaludo1();
        System.out.println("\n-EJERCICIO 4-");
        mensajeSaludo2();
        System.out.println("\n-EJERCICIO 5-");
        divisibleDos();
        System.out.println("\n-EJERCICIO 6-");
        calculoIva();
        System.out.println("\n-EJERCICIO 7-");
        divisibleDosTres();
        System.out.println("\n-EJERCICIO 8-");
        mayorCero();
        System.out.println("\n-EJERCICIO 9-");
        contrasena();
        System.out.println("\n-EJERCICIO 10-");
        diasSemana();
    }
    public static void operacionesMatematicas() {
    //1. Declara dos variables numéricas (con el valor que desees), muestra por consola la
    //suma, resta, multiplicación, división y módulo (resto de la división).

        int num1 = 14,num2 = 25;
        int suma,resta,multiplicacion,division,modulo;

        suma = num1+num2;
        resta= num1-num2;
        multiplicacion = num1*num2;
        division= num1/num2;
        modulo = num1%num2;

        System.out.println("NUMERO 1: " + num1 + "\nNUMERO 2: " + num2);
        System.out.println("SUMA: " + suma + "\nRESTA: " + resta + "\nMULTIPLICACION:  "+multiplicacion +
                "\nDIVISION: " + division + "\nMODULO: " + modulo);
    }
    public static void diasSemana(){
    //10. Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia
    //laboral o no (“De lunes a viernes consideramos dias laborales”).

        System.out.println("INGRESE UN DIA DE LA SEMANA: ");
        String dia = sc.nextLine();
        String resul = dia.toLowerCase();

        switch(resul){
            case "lunes","martes","miercoles","jueves","viernes":
                System.out.println("ES UN DIA LABORAL");
                break;
            case "sabado","domingo":
                System.out.println("NO ES UN DIA LABORAL");
                break;
        }
    }
    public static void contrasena(){
    //9. Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
    //se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá
    //mas la contraseña y mostrara un mensaje diciendo “Correcto!”. Piensa bien en la
    //condición de salida (3 intentos y si acierta sale, aunque le queden intentos, si no acierta
    //en los 3 intentos mostrar el mensaje “Fallaste jaja!!”).

        String contrasena = "fernando";
        int intento = 0;
        String resultado;
        String intentousuario;

        do {
            System.out.println("**INTRODUCE LA CONTRASENA***");
            intentousuario = sc.nextLine();
            resultado = intentousuario.toLowerCase();

            if(resultado == contrasena){
                System.out.println("CORRECTO!!!");
                break;
            }else
                intento = intento +1;

            if (intento == 3){
                System.out.println("FALLASTE JAJA!!!");
            }
        }while(intento<3);
    }
    public static void mayorCero(){
    //8. Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si
    //no lo es lo volverá a pedir (do while), después muestra ese número por consola.
        int num;
        do {
            System.out.println("INGRESAR UN NUMERO: ");
            num = sc.nextInt();
        } while (num < 0);
    }
    public static void numeroMayor(){
        //2. Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
        //Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

        int num1 = 15, num2 = 25;
        System.out.println("NUMERO 1: " + num1 + "\nNUMERO 2: " + num2);
        if (num1 == num2) {
            System.out.println("SON NUMEROS IGUALES");
        } else if (num1 > num2) {
            System.out.println("NUMERO 1 ES MAYOR");
        } else if (num1 < num2) {
            System.out.println("NUMERO 2 ES MAYOR");
        }
    }
    public static void mensajeSaludo1(){
    // 3. Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
    // por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.

        String nombre = "FERNANDO";

        System.out.println("Bienvenido" + nombre);
    }
    public static void mensajeSaludo2(){
    //4. Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir.
        System.out.println("INGRESAR NOMBRE: ");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);
    }
    public static void divisibleDos(){
    //5. Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es,
    //también debemos indicarlo.

        System.out.println("INGRESAR UN NUMERO: ");
        int numerodivisible = sc.nextInt();

        if (numerodivisible % 2 == 0) {
            System.out.println("EL NUMERO " + numerodivisible + "ES DIVISBLE ENTRE 2");
        } else {
            System.out.println("EL NUMERO " + numerodivisible + "NO ES DIVISBLE ENTRE 2");
        }
    }
    public static void divisibleDosTres(){
        //7. Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
        System.out.println("***NUMEROS DIVISIBLES ENTRE 2 Y 3***");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
    }
    public static void calculoIva(){
    //6. Lee un número por teclado que pida el precio de un producto (puede tener
    //decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del
    //10%.

        System.out.println("INGRESAR PRECIO DEL PRODUCTO: ");
        double precio = sc.nextFloat();
        final double IVA = 0.10;

        double preciofinal = precio * IVA;

        preciofinal = preciofinal + precio;

        System.out.println("EL PRECIO MAS IVA ES DE: " + precio);
    }
}

