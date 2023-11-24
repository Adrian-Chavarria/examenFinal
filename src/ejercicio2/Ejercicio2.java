/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio2 {
       public static void gestionarClientes() {
            System.out.println("");
          System.out.println("Ejercicio 2");
          System.out.println("");
           System.out.println("Crea una clase llamada RegistroClientes que permita "
                   + "gestionar dinámicamente un conjunto de objetos Cliente."
                   + "\nCada Cliente debe tener un nombre, un número de cliente y un saldo."
                   + "\nImplementa métodos para agregar un cliente, eliminar un cliente y calcular el saldo total de todos los clientes."
                   + "\nDebe calcular la cantidad de bytes total del prcedimiento calcular saldo total.\n");
        // Implementa la lógica del ejercicio 2 aquí
 //  import java.util.Scanner;
//public class RegistroClientes {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
     
    }
    
    public void agregarCliente(){
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el numero de cliente: ");
        String id = scanner.nextLine();
        System.out.println("Ingrese el saldo: ");
        int saldo = scanner.nextInt();
    }
    
}
    

 

