import java.sql.SQLOutput;
import java.util.Scanner;

public class EjerciciosCalentamiento {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-EJERCICIO 1-");
        ejercicioUno();
        System.out.println("-EJERCICIO 2-");
        ejercicioDos();
        System.out.println("-EJERCICIO 3-");
        ejercicioTres();
        System.out.println("-EJERCICIO 4-");
        ejercicioCuatro();
    }
    public static void ejercicioCuatro() {
        //4. Dada una cadena de caracteres (String) de longitud desconocida que tiene solamente dígitos,
        //crear un array de N elementos (donde N es el tamaño de la cadena) que tenga cada uno de los
        //valores numéricos de los dígitos

        System.out.println("INGRESAR NUMEROS: ");
        String numeros = sc.nextLine();
        int indice = numeros.length();
        char[] arreglo = new char[indice];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = numeros.charAt(i);
            System.out.print(arreglo[i] + "-");
        }
    }
    public static void ejercicioTres() {

        System.out.println("INGRESAR UNA PALABRA: ");
        String palabra = sc.nextLine();
        String invertida = "";
        String min = palabra.toLowerCase();

        for (int i = min.length() - 1; i >= 0; i--) {
            invertida = invertida + min.charAt(i);
        }

        if (invertida.equals(min)) {
            System.out.println("LA PALABRA" + min + "ES PALINDROME");
        } else
            System.out.println("LA PALABRA" + min + "NO ES PALINDROME");

    }
    public static void ejercicioDos() {
        //2. Cargar un array de manera aleatoria con 100 números enteros del -30 al 30. Imprimirlo en
        //pantalla y computar cuál es el elemento que más veces se repite, y cuáles son los números
        //que no están presentes (si es que hay alguno).

        int[] numx = new int[]{1,3,4,5,3,5,6,7,8,3};

        for (int i=0;i<numx.length;i++){
            for(int j=0;j<numx.length;j++){
                if(numx[i] != j){

                }
            }
        }


        int[] numeros = new int[100];

        int[] cont[];
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * (30 + 30 + 1) - 30);
        }

        int contador = 0;
        int masrepetido = 0;
        int x = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {


                if (numeros[i] == numeros[j]) {
                    contador = contador + 1;
                }
            }
            if (contador > x) {
                x = contador;
                masrepetido = numeros[i];
            }
            contador = 0;
        }
        System.out.println("EL MAS REPETIDO ES: " + masrepetido);
    }
    public static void ejercicioUno() {
        //1. Cargar un array de manera aleatoria con 10 números enteros del -5 al 5. Imprimirlo en
        //pantalla y computar cuál es el mayor elemento del vector.

        System.out.println("INGRESAR 10 NUMEROS: ");
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * (5 + 5 + 1) - 5);
        }

        int mayor = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " , ");

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

        }
        System.out.println("EL NUMERO MAYOR ES: " + mayor);
    }

}