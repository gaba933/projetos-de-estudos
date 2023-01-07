package com.mycompany.banco;

public class Conta {
	
    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.saldo = 0;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public String imprimir(){
        String info="";
        
        info += "\nTitular: " + this.titular.imprimir();
        
        info += "\nNumero: " + this.numero;
        info += "\nsaldo: "+ this.saldo;
        
        return info;
    }
	
    public void depositar(double quantia){
        
        this.setSaldo(this.getSaldo()+quantia);
        
    }
    
    public boolean sacar(double quantia){
        if((this.getSaldo()-quantia)>0){
            
            this.setSaldo(this.getSaldo()-quantia);
            
            return true;
        } else{
            
            return false;
            
        }
    }
    
    
    
}
