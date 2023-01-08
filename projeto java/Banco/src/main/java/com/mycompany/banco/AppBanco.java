package com.mycompany.banco;


import javax.swing.*;

public class AppBanco {
    
    public void main(String[] args){

        String menuPrincipal="0. Cadastrar Cliente\n"
                + "1. Cadastrar conta\n"
                + "2. Cadastrar conta especial\n"
                + "3. Relatorios\n"
                + "4. Movimentacao\n"
                + "5. Sair\n";
        
        String menuRelatorios = "0. Lista de todos os clientes\n"
                + "1. Listas de todas as contas\n"
                + "2. Buscar conta com saldo maior q 1000\n"
                + "3. Buscar conta com saldo negativo\n"
                + "4. Busca por CPF\n"
                + "5. Sair de relatorios\n";

        String menuMovimentacao = "1. Efetuar deposito\n"
                + "2. Efetuar saque\n";

        GerenciarCliente gerCliente = new GerenciarCliente();
        GerenciarConta gerConta = new GerenciarConta();

        int op =0;
        while (op!=5){
            op = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal) );

            switch (op){
                case 0:{
                    //codigo para cadastrar conta

                    Cliente cliente =
                }
            }
        }
    }

}
