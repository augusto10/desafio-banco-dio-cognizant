package com.bancodio.br;

import java.util.Scanner;

public class  Conta implements IConta {
	Scanner in = new Scanner(System.in);
	    private int numero;
	    private String nome;
	    private double saldoinicial;
	    private double valor;
	    private double saldoatual;
	    
	    
	 
	   
	    public Scanner getIn() {
			return in;
		}
		public void setIn(Scanner in) {
			this.in = in;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getSaldoinicial() {
			return saldoinicial;
		}
		public void setSaldoinicial(double saldoinicial) {
			this.saldoinicial = saldoinicial;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		public double getSaldoatual() {
			return saldoatual;
		}
		public void setSaldoatual(double saldoatual) {
			this.saldoatual = saldoatual;
		}
		public Conta(int numero,String nome,double saldoinicial){
	        this.numero=numero;
	        this.nome=nome;
			this.saldoinicial=saldoinicial;
	        
	        
	    }
	   
		
		public Conta(Scanner in, int numero, String nome, double saldoinicial, double valor, double saldoatual) {
			super();
			this.in = in;
			this.numero = numero;
			this.nome = nome;
			this.saldoinicial = saldoinicial;
			this.valor = valor;
			this.saldoatual = saldoatual;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		
	    
	    double getSaldo(){
	        return saldoinicial;
	    }
	   
	    
	    int getNumero(){
	        return numero;
	    }
	    
	    public void sacar(Object nome, double valor,Double saldoinicial, double saldoatual){ 
	    	 this.nome=getNome(); 
		    	this.saldoatual=getSaldoatual();
	    	
			System.out.println("Digite o valor que deseja sacar: ");
			valor=in.nextDouble();
			saldoatual-=valor;
			
             System.out.println("Saque realizado com sucesso!");
             System.out.println("Titular da conta: " + nome + "  Saldo atual: "+ (saldoatual-=valor));
             
                 
	    }
	    

	     public void criarConta(int numero,String nome, double  saldoinicial, Double valor,Double saldoatual){
	    	 System.out.println("Digite o número da sua conta: ");
             numero =in.nextInt();
             System.out.println("Digite o nome do titular: ");
             nome = in.next();
             System.out.println("Digite o depósito inicial: ");
             valor =in.nextDouble();
            
             saldoatual=saldoinicial+=valor;
             
             
             System.out.println("Titular da conta:" + nome + "Saldo atual: " +(saldoatual)  );
	     }
	     
	     public void depositar(String nome, double valor, Double saldoinicial,Double saldoatual){ 
	    	    this.nome=getNome(); 
		    	this.saldoatual=getSaldoatual();
		    	
				System.out.println("Digite o valor que deseja depositar: ");
				valor=in.nextDouble();
				 saldoatual+=valor;
				 
	             System.out.println("Deposito realizado com sucesso!");
	             System.out.println("Titular da conta:"+ nome + "Saldo atual: "+ (saldoatual+=valor));
	             
	                 
		    }     
}
	     

