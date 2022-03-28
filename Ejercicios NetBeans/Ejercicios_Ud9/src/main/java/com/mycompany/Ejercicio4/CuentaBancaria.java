package com.mycompany.Ejercicio4;

public abstract class CuentaBancaria {
	
    protected String IBAN;
    protected double saldo;
    protected final int interesAnualBasico=4;
    
    
    
	public String getIBAN() {
		return IBAN;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public void ingresarDinero(double dinero) {
		anadir(dinero,true);
	}
	
	public void retirarDinero(double dinero) {
		anadir(dinero,false);
	}
	
	private void anadir(double dinero, boolean operacion) {
		if(operacion) this.saldo+=dinero;
		else this.saldo-=dinero;
	}
	
	public void traspasarDinero(double dinero,CuentaBancaria cuenta) {
		this.retirarDinero(dinero);
		cuenta.ingresarDinero(dinero);
	}
    
	public abstract void calcularIntereses() ;
	
	public abstract void mostrarDatosCuenta();
	
}
