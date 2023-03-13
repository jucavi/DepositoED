/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package dam_ed04_actividad.cuentas;


/**
 * Clase principal
 * 
 * @author Juan Carlos Vilarrubia
 * @version 1.0
 */
public class Main {
    
    /**
     * Método de entrada donde se crea una cuenta con identificador 
     * {@code 1000-2365-85-1230456789} al cliente {@code Antonio Lopez} con saldo
     * de {@code 2500€} y tipo de interés {@code 0} y se realizan operaciones 
     * en su cuenta
     * 
     * @param args Recibe los datos pasados por la linea de comandos
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 2300);
    }
    
    /**
     * Realiza operaciones de retirada e ingreso sobre una cuenta bancaria pasada
     * como parámetro.
     * <p>
     * Se intenta retirar una cantidad de {@code 2300}, si durante la ooperación
     * ocurriese algun error se informa al cliente.
     * <p>
     * Se intenta ingresar {@code 695}, si ocuurre un fallo durante la operación
     * se informa al cliente.
     * 
     * @param cuenta1 Cuenta Bancaria
     * @param cantidad Cantidad a retirar/ingresar
     * @see CCuenta#retirar(double)
     * @see CCuenta#ingresar(double) 
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
