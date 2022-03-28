package com.mycompany.Ejercicio8;

import java.time.LocalDateTime;

/**
 * Una clase para representar operaciones de ingreso o retirada de dinero.
 * 
 * <p>Cada movimiento queda determinado por una cadena de caracteres que indica las
 * cantidades ingresadas o retiradas y por la fecha en que se realizo el 
 * movimiento.</p>
 * @author Guillermo
 * @version 1.0
 * @see CuentaBancaria
 */

public class Movimiento implements Comparable<Movimiento> {
    private String movimiento;  
    private LocalDateTime fechaMovimiento;
    
    /**
     * Constructor para los movimientos  de las cuentas bancarias.
     * @param movimiento El parametro movimiento define el tipo de movimiento bancario (ingreso o retirada) que va a realizarse en esa operacion.
     * @param fechaMovimiento El parametro fechaMovimiento define la fecha en que se ha realizado la operacion.
     * */
    public Movimiento(String movimiento,LocalDateTime fechaMovimiento){
        this.movimiento=movimiento;
        this.fechaMovimiento=fechaMovimiento;
    }

    public String getMovimiento() {
        return movimiento;
    }
    /**
     * @param movimiento El parametro movimiento modifica el tipo de movimiento bancario (ingreso o retirada) que se ha realizado.
     */
    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public LocalDateTime getFechaMovimiento() {
        return fechaMovimiento;
    }
    /**
     * @param fechaMovimiento El parametro fechaMovimiento modifica la fecha en que se ha realizado el movimiento.
     */
    public void setFechaMovimiento(LocalDateTime fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }
    /**
     * Método que nos permite redefinir la forma en la que el método sort() ordenara los objetos Movimiento.
     * 
     * <p>Permite que el metodo sort() ordene los objetos Movimiento por fechaMovimiento.</p>
     * @param o Este parametro define un objeto Movimiento que sera comparado com el objeto Movimiento actual.
     * @return Devuelve un int que sera 0 si las dos fechas son iguales, -1 si la fecha que llama al compareTo es mayor que la que recibe el metodo como parametro y 1 si la fecha que recibe el metodo como parametro es mayor que la que llama al metodo.
     * @see CuentaBancaria#ordenarMovimientos()
     * */  
    @Override
    public int compareTo(Movimiento o) {
       return this.getFechaMovimiento().compareTo(o.getFechaMovimiento());
    }
}
