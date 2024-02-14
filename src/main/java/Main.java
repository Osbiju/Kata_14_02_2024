import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
Crea una función que reciba dos parámetros para crear una cuenta atrás.
El primero, representa el número en el que comienza la cuenta.
El segundo, los segundos que tienen que transcurrir entre cada cuenta.
Sólo se aceptan números enteros positivos.
El programa finaliza al llegar a cero.
Debes imprimir cada número de la cuenta atrás.
 */

        Scanner entrada = new Scanner(System.in);
        System.out.println("dime el primer numero para la cuenta atras");
        int inicio = entrada.nextInt();
        System.out.println("dime los segundos entre los numeros");
        int segundosDeEspera = entrada.nextInt();

        cuentaAtras(inicio, segundosDeEspera);
    }

    public static void cuentaAtras(int inicio, int segundosDeEspera) {
        if (inicio <= 0 || segundosDeEspera <= 0) {
            System.out.println("Error, ingresa números enteros positivos.");

        }

        for (int i = inicio; i >= 0; i--) {
            System.out.println("Cuenta atrás: " + i);
            try {
                Thread.sleep(segundosDeEspera * 1000); // Espera en milisegundos
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
