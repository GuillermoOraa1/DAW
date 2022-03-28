package com.mycompany.Ejercicio8;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Esta clase define objetos que permiten al usuario crear una cuenta bancaria con la que operar.
 * 
 * <p>La CuentaBancaria permitira al usuario guardar una cantidad de dinero que quedara asociado al objeto
 * CuentaBancaria, realizar operaciones de retirada y ingreso sobre dicha cantidad y imprimir los 
 * movimientos que muestren los datos de las operaciones realizadas.</p>
 * @author Guillermo Oraa
 * @version 1.0
 * @see Movimiento
 * */
public class CuentaBancaria {
    private String IBAN;
    private String titular;
    private double saldo;
    private ArrayList<Movimiento>movimientos=new ArrayList<Movimiento>();

   /**
     * Constructor para las cuentas bancarias de los usuarios.
     * 
     * <p>Cada uno de los objetos CuentaBancaria se crea con un ArrayList de objetos Movimiento vacio.</p>
     * 
     * <p>Cada uno de los objetos CuentaBancaria se crea con un saldo inicial de 0.0.</p>
     * @param IBAN  El parámetro IBAN define la cadena de caracteres que utilizamos como identificador de los objetos CuentaBancaria.
     * @param titular El parámetro titular define quien es el cliente propietario del objeto CuentaBancaria.
     * @throws ExcepcionIban La excepcion ocurre si el parametro IBAN no cumple con el patron establecido en una expresion regular.
     * @throws Exception La excepcion ocurre si el parametro titular no cumple con el patron establecido en una expresion regular.
     */
    public CuentaBancaria(String IBAN,String titular) throws ExcepcionIban{
        
    	//Esta es una forma de comprobar la expresion regular
	Pattern pat = Pattern.compile("[a-zA-Z]{2}[0-9]{22}");
	Matcher mat = pat.matcher(IBAN);      
	if (mat.matches()) {this.IBAN=IBAN;}
        else{throw new ExcepcionIban();}
        
        //Esta es otra forma de comprobar una expresion regular
        if(Pattern.matches("[A-Za-z]+\\s[A-Za-z]+\\s[A-Za-z]*", titular)) {this.titular=titular;}
        else { throw new ExcepcionIban();}
 
        this.saldo=0.0;
    }
    
    public String getIBAN() {
        return IBAN;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    /**
     * Metodo para modificar el valor del atributo saldo del objeto CuentaBancaria.
     * <p>Si el saldo es inferior a -50 no se puede realizar una operacion de retirada y se manda un mensaje al usuario.<p>
     * @param saldo Indica el saldo actual de la cuenta.
     */
    public void setSaldo(double saldo) throws CuentaException{
        if (saldo>-50) {
            this.saldo = saldo;
        }else{
            //AQUI SE CONTROLARIA EL ERROR
           throw new CuentaException(); 
        }        
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }
    
    /**
     * Método que nos permite sumar la cantidad que recibe como parametro al atributo saldo del objeto CuentaBancaria.
     * 
     * <p>Si cantidad es mayor de 3000 no se realiza el ingreso y se lanza el aviso "Notificar a Hacienda".</p>
     * 
     * <p>Si al ejecutar el metodo, el tamaño del atributo movimientos es mayor de 100, se elimina el objeto 
     * Movimiento de movimientos que este en la posicion 0 y se anade al ArrayList un nuevo objeto Movimiento que 
     * estara generado por esta operacion.</p>
     * 
     * <p>Si al ejecutar el metodo, el tamaño del atributo movimientos es menor de 100, se anade a movimientos un 
     * nuevo objeto Movimiento que estara generado por esta operacion.</p>
     * 
     * @param cantidad El parámetro cantidad define la cantidad de dinero a ingresar en la cuenta bancaria.
     * */
    public void Ingresar(double cantidad) throws AvisarHaciendaException{
        if (cantidad>0) {
            this.saldo=this.getSaldo()+cantidad;
            if(this.movimientos.size()<5){
                this.movimientos.add(new Movimiento("Cantidad ingresada: "+cantidad,LocalDateTime.now()));
            }else{
                this.ordenarMovimientos();
                this.movimientos.remove(0);
                this.movimientos.add(new Movimiento("Cantidad ingresada: "+cantidad,LocalDateTime.now()));
            }
        }
        if (cantidad>3000) {
            throw new AvisarHaciendaException(this);
        }

    }
    /**
     * Método que nos permite restar la cantidad que recibe como parametro al atributo saldo del objeto CuentaBancaria 
     * siempre que el valor de saldo sea mayor de -50.
     * 
     * <p>Si cantidad es mayor de 3000 no se realiza el ingreso y se lanza el aviso "Notificar a Hacienda".</p>
     * 
     * <p>Si el valor de saldo es menor de -50 despues de restar la cantidad que recibe como parametro, se envia un 
     * aviso "AVISO: Saldo negativo".</p>
     * 
     * <p>Si al ejecutar el metodo, el tamaño del atributo movimientos es mayor de 100, se elimina el objeto Movimiento 
     * de movimientos que este en la posicion 0 y se anade al ArrayList un nuevo objeto Movimiento que estara generado 
     * por esta operacion.</p>
     * 
     * <p>Si al ejecutar el metodo, el tamaño del atributo movimientos es menor de 100, se anade a movimientos un nuevo 
     * objeto Movimiento que estara generado por esta operacion.</p>
     * 
     * @param cantidad El parámetro cantidad define la cantidad de dinero a ingresar en la cuenta bancaria.
     * */
    public void Retirar(double cantidad) throws AvisarHaciendaException, CuentaException{
        if (cantidad>0 && this.saldo>-50) {
            this.setSaldo(this.getSaldo()-cantidad);
            if(this.movimientos.size()<5){
                this.movimientos.add(new Movimiento("Cantidad retirada: "+cantidad,LocalDateTime.now()));
            }else{
                this.ordenarMovimientos();
                this.movimientos.remove(0);
                this.movimientos.add(new Movimiento("Cantidad retirada: "+cantidad,LocalDateTime.now()));
            } 
            if (this.saldo<0 && this.saldo>-50) {
                throw new CuentaException();
            }
            if (cantidad>3000) {
                throw new AvisarHaciendaException(this);
            }
        }

    }
    /**
     * Método que ordena los objetos Movimiento del atributo movimientos segun la fecha en que se creo cada objeto Movimiento.
     * @see Movimiento#compareTo(Movimiento)
     * */
    public void ordenarMovimientos(){
        Collections.sort(this.movimientos);
    }
    /**
     * Método que muestra los datos de la cuenta.
     * @return Devuelve un String con los valores de los atributos IBAN, titular,saldo.
     * */
    public String datosCuenta(){
        return "IBAN: "+this.IBAN+"\nTitular: "+this.titular+"\nSaldo: "+this.saldo;
    }
    /**
     * Método que muestra por pantalla cada uno de los objetos Movimiento del atributo movimientos del objeto CuentaBancaria.
     * */
    public void imprimirMovimientos(){
        for (Movimiento movimiento : this.movimientos) {
            System.out.println(movimiento.getMovimiento()+"     "+movimiento.getFechaMovimiento().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm")));
        }
        System.out.println("Saldo total: "+this.getSaldo());
    }
    
}
