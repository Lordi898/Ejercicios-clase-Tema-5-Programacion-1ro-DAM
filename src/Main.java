import java.util.Arrays;
import java.util.Random;
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

        // *** Ejercicio 5.11: Calcular frecuencias de valores aleatorios ***
        ejercicio5_11();

        // *** Ejercicio 5.12: Contador de días transcurridos en el año ***
        ejercicio5_12();

        // *** Ejercicio 5.13: Estadísticas de horas de sol por mes ***
        ejercicio5_13();

        // *** Ejercicio 5.14: Diccionario inglés-castellano ***
        ejercicio5_14();

        // *** Ejercicio 5.15: Notas de estudiantes en un curso ***
        ejercicio5_15();

        // *** Ejercicio 5.16: Horas trabajadas por empleados ***
        ejercicio5_16();

        // *** Ejercicio 5.17: Generar una matriz identidad ***
        ejercicio5_17(5); // Tamaño de la matriz

        // *** Ejercicio 5.18: Búsqueda lineal modificada ***
        ejercicio5_18();

        // *** Ejercicio 5.19: Array sin repetidos ***
        ejercicio5_19();

        // *** Ejercicio 5.20: Curso y alumnos ***
        ejercicio5_20();

        // *** Ejercicio 5.21: Explorar la API de Java ***
        ejercicio5_21();

        // *** Ejercicio 5.22: Métodos de la clase String ***
        ejercicio5_22();

        // *** Ejercicio 5.23: Operaciones con Strings ***
        ejercicio5_23();

        // *** Ejercicio 5.24: Métodos en la clase Palabra ***
        ejercicio5_24();

        // *** Ejercicio 5.25: Lista de nombres ordenados ***
        ejercicio5_25();

        // *** Ejercicio 5.26: Gestión de un directorio de ficheros ***
        ejercicio5_26();

        // *** Ejercicio 5.27: Enumerados simples ***
        ejercicio5_27();

        // *** Ejercicio 5.28: Semáforo con enumerados ***
        ejercicio5_28();

        // *** Ejercicio 5.29: Valores de cartas de una baraja ***
        ejercicio5_29();
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

    // *** Ejercicio 5.11: Calcular frecuencias de valores aleatorios ***
    private static void ejercicio5_11() {
        System.out.println("Ejercicio 5.11: Calcular frecuencias de valores aleatorios");
        int[] frecuencias = new int[9]; // Array para frecuencias (1-9)
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int valor = random.nextInt(9) + 1; // Generar aleatorio entre 1 y 9
            frecuencias[valor - 1]++;
        }
        for (int i = 0; i < frecuencias.length; i++) {
            System.out.println("Frecuencia de " + (i + 1) + ": " + frecuencias[i]);
        }
    }

    // *** Ejercicio 5.12: Contador de días transcurridos en el año ***
    private static void ejercicio5_12() {
        System.out.println("\nEjercicio 5.12: Contador de días transcurridos en el año");
        ContadorDias contador = new ContadorDias();
        int dias = contador.contarDias(15, 3, 2024); // Ejemplo: 15 de marzo de 2024
        System.out.println("Días transcurridos: " + dias);
    }

    // Clase auxiliar para Ejercicio 5.12
    static class ContadorDias {
        private final int[] diasMes;

        public ContadorDias() {
            diasMes = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }

        public int contarDias(int dia, int mes, int año) {
            if (esBisiesto(año)) {
                diasMes[1] = 29; // Año bisiesto
            }
            int sumaDias = 0;
            for (int i = 0; i < mes - 1; i++) {
                sumaDias += diasMes[i];
            }
            sumaDias += dia;
            return sumaDias;
        }

        private boolean esBisiesto(int año) {
            return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        }
    }

    // *** Ejercicio 5.13: Estadísticas de horas de sol por mes ***
    private static void ejercicio5_13() {
        System.out.println("\nEjercicio 5.13: Estadísticas de horas de sol por mes");
        EstadisticaLuzSolar estadistica = new EstadisticaLuzSolar();
        System.out.println("Promedio anual: " + estadistica.getMediaSol() + " horas");
        System.out.println("Mes más soleado: " + estadistica.mesMasSoleado());
        System.out.println("Mes menos soleado: " + estadistica.mesMenosSoleado());
    }

    // Clase auxiliar para Ejercicio 5.13
    static class EstadisticaLuzSolar {
        private final String[] nombresMeses;
        private final int[] horas;

        public EstadisticaLuzSolar() {
            nombresMeses = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
            horas = new int[]{100, 90, 120, 150, 210, 250, 300, 310, 280, 230, 160, 120};
        }

        public double getMediaSol() {
            int total = 0;
            for (int hora : horas) {
                total += hora;
            }
            return total / (double) horas.length;
        }

        public String mesMasSoleado() {
            int maxHoras = horas[0];
            int indice = 0;
            for (int i = 1; i < horas.length; i++) {
                if (horas[i] > maxHoras) {
                    maxHoras = horas[i];
                    indice = i;
                }
            }
            return nombresMeses[indice];
        }

        public String mesMenosSoleado() {
            int minHoras = horas[0];
            int indice = 0;
            for (int i = 1; i < horas.length; i++) {
                if (horas[i] < minHoras) {
                    minHoras = horas[i];
                    indice = i;
                }
            }
            return nombresMeses[indice];
        }
    }

    // *** Ejercicio 5.14: Diccionario inglés-castellano ***
    private static void ejercicio5_14() {
        System.out.println("\nEjercicio 5.14: Diccionario inglés-castellano");
        Diccionario diccionario = new Diccionario(5);
        diccionario.insertarPalabra("perro", "dog");
        diccionario.insertarPalabra("gato", "cat");
        diccionario.escribirDiccionario();
    }

    // Clase auxiliar para Ejercicio 5.14
    static class Diccionario {
        private final Palabra1[] listaPalabras;
        private int pos;

        public Diccionario(int numPalabras) {
            listaPalabras = new Palabra1[numPalabras];
            pos = 0;
        }

        public void insertarPalabra(String castellano, String ingles) {
            if (pos < listaPalabras.length) {
                listaPalabras[pos++] = new Palabra1(castellano, ingles);
            } else {
                System.out.println("Diccionario lleno.");
            }
        }

        public void escribirDiccionario() {
            for (int i = 0; i < pos; i++) {
                System.out.println(listaPalabras[i]);
            }
        }
    }

    static class Palabra1 {
        private final String castellano;
        private final String ingles;

        public Palabra1(String castellano, String ingles) {
            this.castellano = castellano;
            this.ingles = ingles;
        }

        @Override
        public String toString() {
            return castellano + " - " + ingles;
        }
    }

    // *** Ejercicio 5.15: Notas de estudiantes en un curso ***
    private static void ejercicio5_15() {
        System.out.println("\nEjercicio 5.15: Notas de estudiantes en un curso");
        Curso curso = new Curso();
        double[] medias = curso.calcularMedias();
        for (int i = 0; i < medias.length; i++) {
            System.out.println("Media asignatura " + (i + 1) + ": " + medias[i]);
        }
    }

    // Clase auxiliar para Ejercicio 5.15
    static class Curso {
        private static final int MAX_ESTUDIANTES = 20;
        private static final int MAX_ASIGNATURAS = 6;
        private final int[][] notas;

        public Curso() {
            notas = new int[MAX_ESTUDIANTES][MAX_ASIGNATURAS];
            inicializar();
        }

        private void inicializar() {
            Random random = new Random();
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[i].length; j++) {
                    notas[i][j] = random.nextInt(10) + 1;
                }
            }
        }

        public double[] calcularMedias() {
            double[] medias = new double[MAX_ASIGNATURAS];
            for (int j = 0; j < MAX_ASIGNATURAS; j++) {
                int suma = 0;
                for (int[] nota : notas) {
                    suma += nota[j];
                }
                medias[j] = suma / (double) MAX_ESTUDIANTES;
            }
            return medias;
        }
    }

    private static void ejercicio5_16() {
        System.out.println("\nEjercicio 5.16: Horas trabajadas por empleados");

        // a) Array bidimensional
        int[][] horasTrabajadas = new int[7][15]; // 7 días, 15 trabajadores
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        Random random = new Random();

        // c) Inicializar con valores aleatorios
        for (int i = 0; i < horasTrabajadas.length; i++) {
            for (int j = 0; j < horasTrabajadas[i].length; j++) {
                horasTrabajadas[i][j] = random.nextInt(5) + 8; // Valores entre 8 y 12
            }
        }

        // d) Calcular total de horas por día
        int[] totalHorasPorDia = new int[7];
        for (int i = 0; i < horasTrabajadas.length; i++) {
            for (int j = 0; j < horasTrabajadas[i].length; j++) {
                totalHorasPorDia[i] += horasTrabajadas[i][j];
            }
        }

        // e) Mostrar resultados
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i] + ": " + totalHorasPorDia[i] + " horas trabajadas");
        }
    }

    // *** Ejercicio 5.17: Generar una matriz identidad ***
    private static void ejercicio5_17(int dimension) {
        System.out.println("\nEjercicio 5.17: Generar una matriz identidad");

        int[][] matrizIdentidad = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            matrizIdentidad[i][i] = 1; // Elementos de la diagonal principal
        }

        // Mostrar la matriz
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrizIdentidad[i][j] + " ");
            }
            System.out.println();
        }
    }

    // *** Ejercicio 5.18: Búsqueda lineal modificada ***
    private static void ejercicio5_18() {
        System.out.println("\nEjercicio 5.18: Búsqueda lineal modificada");

        int[] numeros = {5, 12, 7, 3, 18, 10};
        int valorBuscado = 7; // Ejemplo

        int posicion = buscarLinealModificado(numeros, valorBuscado);
        if (posicion != -1) {
            System.out.println("El valor " + valorBuscado + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el array.");
        }
    }

    private static int buscarLinealModificado(int[] numeros, int valorBuscado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                return i; // Devuelve la posición
            }
        }
        return -1; // No encontrado
    }

    // *** Ejercicio 5.19: Array sin repetidos ***
    private static void ejercicio5_19() {
        System.out.println("\nEjercicio 5.19: Array sin repetidos");
        ArraySinRepetidos array = new ArraySinRepetidos(10);
        array.insertar(5);
        array.insertar(12);
        array.insertar(5); // Intento de insertar repetido
        array.insertar(8);
        System.out.println(array);
    }

    // Clase auxiliar para Ejercicio 5.19
    static class ArraySinRepetidos {
        private final int[] elementos;
        private int siguiente;

        public ArraySinRepetidos(int tamaño) {
            elementos = new int[tamaño];
            siguiente = 0;
        }

        public void insertar(int nuevoElemento) {
            if (siguiente >= elementos.length) {
                System.out.println("Array completo, no se puede insertar.");
                return;
            }
            if (!estaElemento(nuevoElemento)) {
                elementos[siguiente++] = nuevoElemento;
            } else {
                System.out.println("El elemento " + nuevoElemento + " ya está en el array.");
            }
        }

        private boolean estaElemento(int valor) {
            for (int i = 0; i < siguiente; i++) {
                if (elementos[i] == valor) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Array: ");
            for (int i = 0; i < siguiente; i++) {
                sb.append(elementos[i]).append(" ");
            }
            return sb.toString();
        }
    }

    // *** Ejercicio 5.20: Curso y alumnos ***
    private static void ejercicio5_20() {
        System.out.println("\nEjercicio 5.20: Curso y alumnos");
        CursoDemo curso = new CursoDemo();
        curso.inicializarNotas();
        curso.mostrarNotas();
    }

    // Clase auxiliar para Ejercicio 5.20
    static class CursoDemo {
        private static final int MAX_ALUMNOS = 10;
        private static final int MAX_ASIGNATURAS = 5;
        private final int[][] notas;

        public CursoDemo() {
            notas = new int[MAX_ALUMNOS][MAX_ASIGNATURAS];
        }

        public void inicializarNotas() {
            Random random = new Random();
            for (int i = 0; i < MAX_ALUMNOS; i++) {
                for (int j = 0; j < MAX_ASIGNATURAS; j++) {
                    notas[i][j] = random.nextInt(10) + 1; // Notas entre 1 y 10
                }
            }
        }

        public void mostrarNotas() {
            System.out.println("Notas de los alumnos:");
            for (int i = 0; i < MAX_ALUMNOS; i++) {
                System.out.print("Alumno " + (i + 1) + ": ");
                for (int j = 0; j < MAX_ASIGNATURAS; j++) {
                    System.out.print(notas[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

        // *** Ejercicio 5.21: Explorar la API de Java ***
        private static void ejercicio5_21() {
            System.out.println("\nEjercicio 5.21: Explorar la API de Java");

            // Respuesta teórica para consulta de métodos:
            System.out.println("1. Clase Random: java.util.Random, método nextInt() genera un número aleatorio.");
            System.out.println("2. Clase Math: java.lang.Math, método round() redondea un número decimal al entero más cercano. PI es la constante matemática.");
            System.out.println("3. Clase System: método arraycopy() copia elementos de un array.");
            System.out.println("4. Clase String: método compareTo() compara lexicográficamente dos cadenas.");
            System.out.println("5. Clase Arrays: contiene métodos como sort(), binarySearch(), etc.");
        }

        // *** Ejercicio 5.22: Métodos de la clase String ***
        private static void ejercicio5_22() {
            System.out.println("\nEjercicio 5.22: Métodos de la clase String");

            String texto = "Aprendiendo cadenas en Java";
            System.out.println("Texto original: " + texto);

            // Ejemplo de algunos métodos:
            System.out.println("1. toLowerCase(): " + texto.toLowerCase());
            System.out.println("2. toUpperCase(): " + texto.toUpperCase());
            System.out.println("3. replace('a', '*'): " + texto.replace('a', '*'));
            System.out.println("4. indexOf('cadenas'): " + texto.indexOf("cadenas"));
            System.out.println("5. split(' '): " + Arrays.toString(texto.split(" ")));
            System.out.println("6. contains('Java'): " + texto.contains("Java"));
        }

        // *** Ejercicio 5.23: Operaciones con Strings ***
        private static void ejercicio5_23() {
            System.out.println("\nEjercicio 5.23: Operaciones con Strings");

            String str = "Aprendiendo cadenas en Java";
            System.out.println("Texto original: " + str);

            // Operaciones
            System.out.println("1. Convertido a mayúsculas: " + str.toUpperCase());
            System.out.println("2. Carácter en posición 6: " + str.charAt(6));
            System.out.println("3. Último carácter: " + str.charAt(str.length() - 1));
            System.out.println("4. Comparar con 'CADENAS': " + str.equalsIgnoreCase("cadenas"));
            System.out.println("5. Empieza por 'Apr': " + str.startsWith("Apr"));
            System.out.println("6. Sustituir 'a' por '*': " + str.replace('a', '*'));
            System.out.println("7. Primera aparición de 'd': " + str.indexOf('d'));
            System.out.println("8. Última aparición de 'n': " + str.lastIndexOf('n'));
        }

        // *** Ejercicio 5.24: Métodos en la clase Palabra ***
        private static void ejercicio5_24() {
            System.out.println("\nEjercicio 5.24: Métodos en la clase Palabra");

            Palabra palabra = new Palabra("patito");
            System.out.println("Palabra: " + palabra.getPalabra());
            System.out.println("Guionizada: " + palabra.guionizar());
            System.out.println("Número de vocales: " + palabra.contarVocales());
            System.out.println("Borrar 'ti': " + palabra.borrarAparicionesDe("ti"));
        }

        // Clase auxiliar para Ejercicio 5.24
        static class Palabra {
            private final String palabra;

            public Palabra(String palabra) {
                this.palabra = palabra;
            }

            public String getPalabra() {
                return palabra;
            }

            public String guionizar() {
                StringBuilder resultado = new StringBuilder();
                for (int i = 0; i < palabra.length(); i++) {
                    resultado.append(palabra.charAt(i));
                    if (i < palabra.length() - 1) {
                        resultado.append("-");
                    }
                }
                return resultado.toString();
            }

            public int contarVocales() {
                int contador = 0;
                for (char c : palabra.toLowerCase().toCharArray()) {
                    if ("aeiou".indexOf(c) != -1) {
                        contador++;
                    }
                }
                return contador;
            }

            public String borrarAparicionesDe(String str) {
                return palabra.replace(str, "");
            }
        }

        // *** Ejercicio 5.25: Lista de nombres ordenados ***
        private static void ejercicio5_25() {
            System.out.println("\nEjercicio 5.25: Lista de nombres ordenados");

            ListaNombres lista = new ListaNombres(5);
            lista.insertarNombre("Carlos");
            lista.insertarNombre("Ana");
            lista.insertarNombre("Daniel");
            lista.insertarNombre("Ana"); // Intento de duplicado
            lista.mostrarLista();
        }

        // Clase auxiliar para Ejercicio 5.25
        static class ListaNombres {
            private final String[] lista;
            private int pos;

            public ListaNombres(int tamaño) {
                lista = new String[tamaño];
                pos = 0;
            }

            public void insertarNombre(String nombre) {
                if (pos >= lista.length) {
                    System.out.println("Lista llena, no se puede insertar.");
                    return;
                }
                for (int i = 0; i < pos; i++) {
                    if (lista[i].equals(nombre)) {
                        System.out.println("El nombre ya está en la lista.");
                        return;
                    }
                }
                lista[pos++] = nombre;
                Arrays.sort(lista, 0, pos); // Ordenar
            }

            public void mostrarLista() {
                System.out.println("Lista de nombres:");
                for (int i = 0; i < pos; i++) {
                    System.out.println(lista[i]);
                }
            }
        }

        // *** Ejercicio 5.26: Gestión de un directorio de ficheros ***
        private static void ejercicio5_26() {
            System.out.println("\nEjercicio 5.26: Gestión de un directorio de ficheros");
            Directorio directorio = new Directorio();
            directorio.añadirFichero("archivo1.txt", 1024);
            directorio.añadirFichero("archivo2.doc", 2048);
            directorio.añadirFichero("archivo1.txt", 512); // Intento de duplicado
            System.out.println(directorio);
        }

        // Clase auxiliar para Ejercicio 5.26
        static class Directorio {
            private final String[] ficheros;
            private final int[] tamaños;
            private int pos;

            public Directorio() {
                ficheros = new String[10];
                tamaños = new int[10];
                pos = 0;
            }

            public void añadirFichero(String nombre, int tamaño) {
                for (int i = 0; i < pos; i++) {
                    if (ficheros[i].equals(nombre)) {
                        System.out.println("Fichero ya existe.");
                        return;
                    }
                }
                if (pos < ficheros.length) {
                    ficheros[pos] = nombre;
                    tamaños[pos] = tamaño;
                    pos++;
                } else {
                    System.out.println("Directorio lleno.");
                }
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder("Contenido del directorio:\n");
                for (int i = 0; i < pos; i++) {
                    sb.append(ficheros[i]).append(" (").append(tamaños[i]).append(" KB)\n");
                }
                return sb.toString();
            }
        }

        // *** Ejercicio 5.27: Enumerados simples ***
        private static void ejercicio5_27() {
            System.out.println("\nEjercicio 5.27: Enumerados simples");
            for (Palo palo : Palo.values()) {
                System.out.println(palo);
            }
        }

        // Enumerado para Ejercicio 5.27
        enum Palo {
            OROS, COPAS, ESPADAS, BASTOS
        }

        // *** Ejercicio 5.28: Semáforo con enumerados ***
        private static void ejercicio5_28() {
            System.out.println("\nEjercicio 5.28: Semáforo con enumerados");
            Semaforo semaforo = new Semaforo();
            for (int i = 0; i < 6; i++) {
                System.out.println(semaforo);
                semaforo.cambiarEstado();
            }
        }

        // Enumerado y clase para Ejercicio 5.28
        enum ColorSemaforo {
            ROJO(90), AMARILLO(10), VERDE(50);

            private final int segundos;

            ColorSemaforo(int segundos) {
                this.segundos = segundos;
            }

            public int getSegundos() {
                return segundos;
            }
        }

        static class Semaforo {
            private ColorSemaforo estado;

            public Semaforo() {
                estado = ColorSemaforo.ROJO;
            }

            public void cambiarEstado() {
                switch (estado) {
                    case ROJO -> estado = ColorSemaforo.VERDE;
                    case VERDE -> estado = ColorSemaforo.AMARILLO;
                    case AMARILLO -> estado = ColorSemaforo.ROJO;
                }
            }

            @Override
            public String toString() {
                return "Semáforo está en " + estado + " por " + estado.getSegundos() + " segundos.";
            }
        }

        // *** Ejercicio 5.29: Valores de cartas de una baraja ***
        private static void ejercicio5_29() {
            System.out.println("\nEjercicio 5.29: Valores de cartas de una baraja");
            for (Valor valor : Valor.values()) {
                System.out.println(valor + " vale " + valor.getValor());
            }
        }

        // Enumerado para Ejercicio 5.29
        enum Valor {
            AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5),
            SEIS(6), SIETE(7), SOTA(10), CABALLO(11), REY(12);

            private final int valor;

            Valor(int valor) {
                this.valor = valor;
            }

            public int getValor() {
                return valor;
            }
        }
}
