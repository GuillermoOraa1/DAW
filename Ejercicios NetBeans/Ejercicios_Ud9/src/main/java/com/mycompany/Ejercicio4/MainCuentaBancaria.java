package com.mycompany.Ejercicio4;

public class MainCuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente cuenta1= new CuentaCorriente("ES3333333333333333333333",0.0);
		CuentaAhorro cuenta2= new CuentaAhorro("ES2222222222222222222222",0.0);
                System.out.println("INGRESAMOS DINERO Y MOSTRAMOS LOS DATOS DE LA CUENTA");
		cuenta1.ingresarDinero(100);
		cuenta2.ingresarDinero(200);
		cuenta1.mostrarDatosCuenta();
		cuenta2.mostrarDatosCuenta();
                System.out.println("CALCULAMOS SALDO CON INTERESES Y MOSTRAMOS LOS DATOS DE LA CUENTA");
		cuenta1.calcularIntereses();
		cuenta1.mostrarDatosCuenta();
		cuenta2.calcularIntereses();
		cuenta2.mostrarDatosCuenta();
                System.out.println("RETIRAMOS DINERO Y MOSTRAMOS LOS DATOS DE LA CUENTA");
		cuenta2.retirarDinero(170);
		cuenta2.mostrarDatosCuenta();
		System.out.println("OPERACION DE TRANSFERENCIA");
		cuenta1.traspasarDinero(40, cuenta2);
		cuenta1.mostrarDatosCuenta();
		cuenta2.mostrarDatosCuenta();
	}

}
