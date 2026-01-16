import  java.util.Scanner;
//utilizamos la libreria para que el usuario pueda ingresar los datos.

public class Actividad_1_POO {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola soy, Icebot y tomare su pedido ¿listo para ordenar?");
        System.out.println("Tamaño: Grande - Mediana - Chica");
        String tamaño = entrada.nextLine();
        System.out.println("¿Que forma desea que sea su paleta? ");
        String forma = entrada.nextLine();
        System.out.println("¿De que sabor desea? ");
        String sabor = entrada.nextLine();
        //En esta parte pedimos al usuario que ingrese los datos

        System.out.println("------------------------------------");
        System.out.println("Pedido realizado con éxito :D");
        System.out.println("Su pedido fue una paleta:");
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Forma: " + forma);
        System.out.println("Sabor: " + sabor);
        //Mostramos al usuario el pedido
    }
}