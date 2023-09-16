import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        // OBJETO TIPO CONSOLA para introducir datos
        Scanner consola = new Scanner(System.in);

        // WHILE PARA MOSTRAR LA APLICACION MIENTRAS
        while (true) {

            // TITULO DE LA APLICACION
            System.out.println("**** Aplicacion Calculadora ****");

            // MOSTRAR MENU
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(consola.nextLine());

                // REVISAR QUE LA OPERACION ESTE DENTRO DE LAS OPCIONES DEL MENU
                if (operacion >= 1 && operacion <= 4) {

                    // SE LLAMA A LA FUNCION PARA QUE EJECUTE LAS OPERACIONES
                    ejectarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta luego...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                // IMPRIMIR SALTO DE LINEA
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }
    // FUNCION PRIVADA PARA MOSTRAR MENU
    private static void mostrarMenu() {
        // System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
        System.out.println("""
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    """);

        // PEDIR USUARIO QUE ELIJA UNA OPERACION
        System.out.print("Elige la operacion a realizar: ");
    }

    // FUNCION EJECUTAR OPERACION
    private  static  void ejectarOperacion(int operacion, Scanner consola) {
        // PIDE AL USUARIO QUE INTRODUZCA EL NUMERO1
        System.out.print("Proporciona numero1: ");
        var numero1 = Integer.parseInt(consola.nextLine());

        // PIDE AL USUARIO QUE INTRODUZCA EL NUMERO1
        System.out.print("Proporciona numero2: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        int resultado;

        // SWITCH
        switch (operacion) {
            case 1 -> {
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
            }
            case 2 -> {
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
            }
            case 3 -> {
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
            }
            case 4 -> {
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
            }
            default -> System.out.println("Operacion erronea: " + operacion);
        }
    }
}
