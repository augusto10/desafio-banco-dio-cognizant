package com.bancodio.br;

import java.util.Scanner;

public class mainPrincipal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	   
		Cliente cli = new Cliente(null, 0);    
		Conta conta= new Conta(0, null, 0);
		
        boolean continuar=true;
        String execucao,nome = null;
        int numero = 0,escolha;
        Conta c=null;
        double saldoinicial = 0,valor = 0;
       
        while(continuar==true){
            System.out.println("Digite 1 para criar conta, "
                    + "2 para sacar, 3 para depositar e 4 para ver"
                    + " o saldo: ");
            escolha = in.nextInt();
            if(escolha==1){
            	conta.criarConta(numero, nome, saldoinicial, valor, valor);
            }
            if(escolha==2){
                conta.sacar(nome, valor, saldoinicial, valor);
              
            }
            if(escolha==3){
               conta.depositar(nome, valor, saldoinicial, valor);
            }
            if(escolha==4){
            	
            }
            System.out.println("Deseja continuar? s - sim/ n - não");
            execucao = in.next();
            if(execucao.equals("n")){
                continuar=false;
            }
        }  
    }

	}


