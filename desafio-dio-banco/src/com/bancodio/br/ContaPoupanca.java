package com.bancodio.br;

public class ContaPoupanca extends Conta {

	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
		System.out.println("***Extrato conta poupanca***");
		super.imprimirInformacoes();

}
	
	
	
}
