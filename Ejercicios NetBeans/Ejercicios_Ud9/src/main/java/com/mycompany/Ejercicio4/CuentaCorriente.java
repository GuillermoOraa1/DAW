package com.mycompany.Ejercicio4;

public class CuentaCorriente extends CuentaBancaria{

	public CuentaCorriente(String IBAN, double saldo) {
		this.IBAN=IBAN;
		this.saldo=saldo;
	}
	
	@Override
	public void calcularIntereses() {
		// TODO Auto-generated method stub
		this.saldo=this.saldo+((this.saldo/100)*this.interesAnualBasico);
	}

	@Override
	public void mostrarDatosCuenta() {
		// TODO Auto-generated method stub
		System.out.println("Cuenta Corriente: \nIBAN: "+this.getIBAN()+"\nSaldo: "+this.getSaldo());
	}

}
