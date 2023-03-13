/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad.cuentas;

/**
 * Clase que representa y permite operar sobre la cuenta bancaria de un cliente.
 * 
 * @author Juan Carlos Vilarrubia
 * @version 1.0
 */
public class CCuenta {


    /**
     * Nombre del cliente propietario de la cuenta
     */
    private String nombre;
    /**
     * Identificador de la cuenta del cliente
    */
    private String cuenta;
    /**
     * Saldo actual en cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interes aplicado
     */
    private double tipoInteres;

    /**
     * Constructor vacio de la clase
     */
    public CCuenta()
    {
    }
    
    /**
     * Contructor de la clase
     * 
     * @param nom Nombre del cliente propipetario de la cuenta
     * @param cue Identificador de la cuenta
     * @param sal Saldo inicial de la cuenta
     * @param tipo Tipo de interés aplicado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        // Agregada inicialización
        tipoInteres = tipo;
    }

    /**
     * Establece el nombre del cliente propietario de la cuenta
     * 
     * @param nom Nombre del cliente
     * @see CCuenta#setNombre(java.lang.String)  
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }
    
    /**
     * Obtine el nombre del cliente propieterio de la cuenta
     * 
     * @return El nombre del cliente
     * @see CCuenta#getNombre() 
     */
    public String obtenerNombre() {
        return getNombre();
    }
    
    /**
     * Obtiene el saldo de la cuenta
     * 
     * @return El saldo de la cuenta
     */
    public double estado() {
        return saldo;
    }
    
    /**
     * Incrementa el saldo de la cuenta con la cantidad pasada como parámetro
     * 
     * @param cantidad Cantidad a ingresar en la cuenta
     * @throws Exception Si la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = getSaldo() + cantidad;
    }
    
    /**
     * Decrementa el saldo en la cantidad pasada como parámetro
     * 
     * @param cantidad Cantidad a retirar de la cuenta
     * @throws Exception Si la cantidad a retirar es negativa o supera el saldo 
     * existente en cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = getSaldo() - cantidad;
    }

    /**
     * Obtiene el identificador de la cuenta
     * 
     * @return El identificador de la cuenta
     * @see CCuenta#getCuenta()
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Obtiene el nombre del cliente propietario de la cuenta
     * 
     * @return El nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente propietario de la cuenta
     * 
     * @param nombre El nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Obtiene el identificador de la cuenta
     * 
     * @return Identificador de la cuenta
     * @see CCuenta#getCuenta()
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Obtiene el saldo de la cuenta
     * 
     * @return El saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta
     * 
     * @return El tipo de Interés
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés
     * 
     * @param tipoInteres El tipo de Interes a aplicar
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
