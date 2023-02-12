package com.mycompany.deposito.cuentas;

/**
 * Esta clase representa una cuenta bancaria, identificando el propietario
 * de la cuenta, el número de ésta, su saldo y el tipo de interés.
 * Cuenta con métodos para obtener su saldo, ingresar y retirar dinero.
 * 
 * @author Miguel Tarilonte
 * @version 1.0
 */
public class CCuenta {


    /**
     * Atributos que determinan una cuenta bancaria:
     * nombre: del titular
     * cuenta: identificación de la cuenta
     * saldo: de la cuenta
     * tipoInterés: de la cuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }

    /**
     * Constructor que inicializa atributos de la clase
     * 
     * @param nom String
     * @param cue String
     * @param sal double
     * @param tipo double
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método para obtener el saldo de la cuenta
     * 
     * @return saldo como double
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar dinero en la cuenta
     * 
     * @param cantidad a ingresar como double
     * @throws Exception si cantidad menos que cero
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Métido para retirar dinero de la cuenta
     * 
     * @param cantidad a retirar como double
     * @throws Exception si cantidad menos o igual que cero o si no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el nombre del titular de la cuenta
     * @return nombre del titular de la cuenta como String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     * @param nombre establece el nombre del titular de la cuenta como String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el código de la cuenta
     * @return cuenta la identificación de la cuenta como String
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el código de la cuenta
     * @param cuenta establece la identificación de la cuenta como String
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return el saldo de la cuenta como double
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     * @param saldo establece el saldo de la cuenta como double
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés asociado a la cuenta
     * @return tipoInterés de la cuenta como double
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta
     * @param tipoInterés establece el tipo de interés de la cuenta como double
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

