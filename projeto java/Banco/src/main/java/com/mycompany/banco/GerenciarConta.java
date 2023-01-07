package com.mycompany.banco;

import java.util.ArrayList;

public class GerenciarConta {
    
    private ArrayList <Conta> listaConta;

    public GerenciarConta(ArrayList<Conta> listaConta) {
        this.listaConta = listaConta;
    }

    public ArrayList<Conta> getListaConta() {
        return listaConta;
    }

    public void setListaConta(ArrayList<Conta> listaConta) {
        this.listaConta = listaConta;
    }
    
    public void cadastrar(Conta objConta){
        
        this.listaConta.add(objConta);
    }
    
    public String imprimir(){
        String info="";
        
        if(this.listaConta.size()>0){
            info += "\n\nNAO A NENHUMA CONTA CADASTRADA";
        }else{
            info +="\n\n---CONTAS CADASTRADAS---";
            
            for(Conta objConta: this.listaConta){
                info +="\n---------";
                info += "\n " +objConta.imprimir();
            }
        }
        return info;
    }
    
    public Conta buscar(int numero){
        for(Conta objConta: listaConta){
            if(objConta.getNumero()==numero){
                return objConta;
            }         
        }
        return null;
    }
    
    public String busca(String cpf){
        String info="";
        
        info +="\n--------------";
        
        for(Conta objConta: listaConta){
            if(objConta.getTitular().getCpf().equalsIgnoreCase(cpf)){
                info += objConta.imprimir();
            }
        }
        return info;
    }
    
}
