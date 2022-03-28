package com.mycompany.Ejercicio4;

public class CuentaAhorro extends CuentaBancaria{

	static final double saldoMinimo=50;
	
	public CuentaAhorro(String IBAN, double saldo) {
		this.IBAN=IBAN;
		this.saldo=saldo;
	}
	
	@Override
	public void calcularIntereses() {
		// TODO Auto-generated method stub
		if (this.saldo<CuentaAhorro.saldoMinimo) this.saldo=this.saldo+((this.saldo/100)*(this.interesAnualBasico/2));
		else  this.saldo=this.saldo+((this.saldo/100)*(this.interesAnualBasico*2));
	}

	@Override
	public void mostrarDatosCuenta() {
		// TODO Auto-generated method stub
		System.out.println("Cuenta Ahorro: \nIBAN: "+this.getIBAN()+"\nSaldo: "+this.getSaldo());
	}

}
