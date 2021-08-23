/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author migue
 */
public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        this();      
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public static void setContadorEmpleado(int aContadorEmpleado) {
        contadorEmpleado = aContadorEmpleado;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        //sb.append(", nombre=").append(this.nombre);
        sb.append(", {").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
