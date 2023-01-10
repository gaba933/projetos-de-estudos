package com.mycompany.banco;

import java.util.ArrayList;

public class GerenciarCliente {

    private  ArrayList<Cliente> listaCliente;

    public GerenciarCliente() {
        this.listaCliente = new ArrayList<Cliente>();
    }

    public ArrayList<Cliente> getListaCliente() {

        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {

        this.listaCliente = listaCliente;
    }

    public void cadastrar(Cliente cliente){

        this.listaCliente.add(cliente);
    }

    public String listaClientes(){
        String info="\n---LISTA DE CLIENTES---";

        if (listaCliente.size()>0){
            for (Cliente objCliente: listaCliente){
                info += "\n" +objCliente.imprimir();
            }
        }else {
            info += "\n-Nao a clientes cadastrados-";
        }
        return info;
    }

    public Cliente buscar(String cpf){
        for (Cliente cliente: listaCliente){
            if (cpf.equalsIgnoreCase( cliente.getCpf() )){
                return cliente;
            }
        }
        return null;
    }
}
