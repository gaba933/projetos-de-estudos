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
                    //codigo para cadastrar cliente

                    Cliente cliente = tela_cadCliente();
                    gerCliente.cadastrar(cliente);

                    break;
                }

                case 1:{
                    //codigo para cadastrar conta

                    int tipoConta =0;
                    Conta conta = tela_cadConta(gerCliente, tipoConta);
                    gerConta.cadastrar(conta);

                    break;
                }

                case 2:{
                    //codigo para cadastrar conta espacial

                    int tipoConta =1;
                    Conta conta = tela_cadConta(gerCliente, tipoConta);

                    break;
                }

                case 3:{
                    
                }
            }
        }
    }

    public static Cliente tela_cadCliente(){

        String cpf;
        String nome;
        String endereco;
        String telefone;

        nome = JOptionPane.showInputDialog("digite o nome: ");
        cpf = JOptionPane.showInputDialog("digite o spc: ");
        endereco = JOptionPane.showInputDialog("digite o endereco: ");
        telefone = JOptionPane.showInputDialog("digite o telefone: ");

        return new Cliente(nome, cpf, endereco,telefone);
    }

    public static Conta tela_cadConta( GerenciarCliente gerCliente, int tipoConta ){

        int numero;
        String cpf;

        Cliente cliente;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite o numero da conta: ") );
        cpf = JOptionPane.showInputDialog("digite o cpf do titular: ");

        cliente = gerCliente.buscar(cpf);

        if (tipoConta==0){
            return  new Conta(numero, cliente);
        } else {
            return new ContaEspecial(numero, cliente);
        }
    }

}
