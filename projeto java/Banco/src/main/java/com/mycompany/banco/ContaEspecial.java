package com.mycompany.banco;

public class ContaEspecial extends Conta{
    
    private double limite;

    public ContaEspecial( int numero, Cliente titular) {
        super(numero, titular);
        this.limite = 500.0;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
   @Override
    public String imprimir(){
        String info="";
        
        info += super.imprimir();
        
        info += "\nLimeite: " + this.limite;
        info += "\nSaldo com limeite: " + (this.getSaldo()+this.limite);
        
        return info;
    }
    
    public boolean sacar(double quantia){
        
        if((this.getSaldo()+this.getLimite())>0){
            
            this.setSaldo(this.getSaldo()-quantia);
            
            return true;
        }else {
            
            return false;
        }
        
    }
}
