import java.util.Scanner;

/*
    Programa que simula la interfaz de un cajero automatico.

    Opcion 1: consultar el saldo
    Opcion 2: ingresar dinero
    Opcion 3: retirar dinero
    Opcion 4: Consultar los ultimos movimientos
    Al elegir la opcion, pulsa enter.
    
*/
public class Interfaz {
    public static void main(String[] args) {
        int opcion = 0;
        double deposito = 0.00;
        double saldo = 60.5;
        double retiro = 0.00;
        String respuesta = "";
        Scanner scanner = new Scanner(System.in);
        String mensaje = "Bienvenido a la interfaz de cajero automatico, selecciona una opcion y presiona enter para acceder.";
        String opciones = "1: Consultar saldo.\n 2: Depositar a mi cuenta. \n 3: Retirar dinero. \n 4: Consultar movimientos.";
        System.out.println(mensaje);
        System.out.println(opciones);
        opcion = scanner.nextInt();

        switch(opcion){
            case(1):
                respuesta = "Tu saldo es: " + saldo;
                System.out.println(respuesta);
                break;
            case(2):
                respuesta = "Ingrese el valor del deposito:";
                System.out.println(respuesta);
                deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Deposito realizado con exito, su nuevo saldo es: \n" + saldo);
                break;
            case(3):
                respuesta = "Ingrese el valor del retiro: ";
                System.out.println(respuesta);
                retiro = scanner.nextDouble();
                saldo -= retiro;
                System.out.println("Retiro realizado con exito, su nuevo saldo es:\n" + saldo);
                break;
            case(4):
                respuesta = "Su ultimo movimiento fue:";
                System.out.println(respuesta);
        }
    }
}
