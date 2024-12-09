import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // *** Ejercicio 5.1: Inicialización de arrays ***
        ejercicio5_1();

        // *** Ejercicio 5.2: Uso de arrays de objetos ***
        ejercicio5_2();

        // *** Ejercicio 5.3: Manipulación de arrays ***
        ejercicio5_3();

        // *** Ejercicio 5.4: Escribir contenido de un array ***
        ejercicio5_4();

        // *** Ejercicio 5.5: Encontrar nombre de día ***
        ejercicio5_5();

        // *** Ejercicio 5.6: Calcular media de un array ***
        ejercicio5_6();

        // *** Ejercicio 5.7: Encontrar valor máximo de un array ***
        ejercicio5_7();

        // *** Ejercicio 5.8: Valores pares de un array ***
        ejercicio5_8();

        // *** Ejercicio 5.9: Rotar array a la derecha ***
        ejercicio5_9();

        // *** Ejercicio 5.10: Expansión de un array ***
        ejercicio5_10();

        // Continúa organizando los métodos según cada ejercicio.
        scanner.close();
    }

    // *** Ejercicio 5.1: Inicialización de arrays ***
    private static void ejercicio5_1() {
        System.out.println("Ejercicio 5.1: Inicialización de arrays");
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numeroElementos = diasMes.length;
        System.out.println("El array tiene " + numeroElementos + " elementos.");
        diasMes[1] = 29; // Año bisiesto
        System.out.println("Días de febrero en año bisiesto: " + diasMes[1]);
    }

    // *** Ejercicio 5.2: Uso de arrays de objetos ***
    private static void ejercicio5_2() {
        System.out.println("\nEjercicio 5.2: Uso de arrays de objetos");
        Persona[] familia = new Persona[2];
        familia[0] = new Persona("Pedro", 46);
        familia[1] = new Persona("Luisa", 45);
        for (Persona persona : familia) {
            System.out.println(persona);
        }
    }

    // Clase auxiliar para Ejercicio 5.2
    static class Persona {
        String nombre;
        int edad;

        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return nombre + " tiene " + edad + " años.";
        }
    }

    // *** Ejercicio 5.3: Manipulación de arrays ***
    private static void ejercicio5_3() {
        System.out.println("\nEjercicio 5.3: Manipulación de arrays");
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numeroElementos = diasMes.length;
        System.out.println("Número de elementos en el array: " + numeroElementos);
    }

    // *** Ejercicio 5.4: Escribir contenido de un array ***
    private static void ejercicio5_4() {
        System.out.println("\nEjercicio 5.4: Escribir contenido de un array");
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    // *** Ejercicio 5.5: Encontrar nombre de día ***
    private static void ejercicio5_5() {
        System.out.println("\nEjercicio 5.5: Encontrar nombre de día");
        String[] nombresDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int dia = 3; // Por ejemplo
        if (dia >= 1 && dia <= 7) {
            System.out.println("El día es: " + nombresDias[dia - 1]);
        } else {
            System.out.println("Día incorrecto");
        }
    }

    // *** Ejercicio 5.6: Calcular media de un array ***
    private static void ejercicio5_6() {
        System.out.println("\nEjercicio 5.6: Calcular media de un array");
        double[] notas = {7.5, 8.0, 6.5, 9.0, 10.0};
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        System.out.println("La media es: " + (suma / notas.length));
    }

    // *** Ejercicio 5.7: Encontrar valor máximo de un array ***
    private static void ejercicio5_7() {
        System.out.println("\nEjercicio 5.7: Encontrar valor máximo de un array");
        int[] numeros = {3, 5, 7, 2, 8};
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("El valor máximo es: " + maximo);
    }

    // *** Ejercicio 5.8: Valores pares de un array ***
    private static void ejercicio5_8() {
        System.out.println("\nEjercicio 5.8: Valores pares de un array");
        int[] numeros = {3, 5, 7, 2, 8, 6};
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }

    // *** Ejercicio 5.9: Rotar array a la derecha ***
    private static void ejercicio5_9() {
        System.out.println("\nEjercicio 5.9: Rotar array a la derecha");
        int[] numeros = {1, 2, 3, 4, 5};
        int ultimo = numeros[numeros.length - 1];
        System.arraycopy(numeros, 0, numeros, 1, numeros.length - 1);
        numeros[0] = ultimo;
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    // *** Ejercicio 5.10: Expansión de un array ***
    private static void ejercicio5_10() {
        System.out.println("\nEjercicio 5.10: Expansión de un array");
        int[] numeros = {2, 3, 4, 5};
        int[] expandido = new int[numeros.length * 2];
        for (int i = 0, j = 0; i < numeros.length; i++) {
            expandido[j++] = numeros[i];
            expandido[j++] = numeros[i];
        }
        for (int numero : expandido) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
