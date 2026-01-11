/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicafinal;

import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class PracticaFinal {

    public static void main(String[] args) {
        /*
        Crear un programa en java utilizando netbeans que permita registrar el
        nombre del cliente, tres compras realizadas. Determinar el total y el
        promedio de compras.
        */
        String cliente;
        double compra1, compra2, compra3, total, promedio;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del cliente:");
        cliente = lectura.next();
        
        System.out.println("Monto de la compra uno:");
        compra1 = lectura.nextDouble();
        
        System.out.println("Monto de la compra dos:");
        compra2 = lectura.nextDouble();
        
        System.out.println("Monto de la compra tres:");
        compra3 = lectura.nextDouble();
        
        total = compra1 + compra2 + compra3;
        promedio = total/3;
        
        System.out.println("Informacion");
        System.out.println("Cliente:" + cliente);
        System.out.println("Total:" + total);
        System.out.println("Promedio:" + promedio);
    }
    
}
