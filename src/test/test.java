/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author migue
 */
public class test {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 30000.0);
        System.out.println("Empleado = " + empleado);
        var fecha = new Date();
        Cliente cliente = new Cliente(fecha, true, "Miguel", 'M', 32, "Cañada");
        System.out.println("Cliente =" + cliente);
        Cliente cliente1 = new Cliente(fecha, true, "Miguel", 'M', 32, "Cañada");
        System.out.println("Cliente =" + cliente1);

    }
}
