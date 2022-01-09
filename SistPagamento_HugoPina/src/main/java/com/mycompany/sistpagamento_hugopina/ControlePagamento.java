//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.sistpagamento_hugopina;
import java.util.ArrayList;

public class ControlePagamento {
    public static final double SALARIO = 954.00;
    public static final double HORA = 8.00;
    
    private ArrayList<Pagavel> pagamentos; //armazena todos os itens pagaveis da empresa

    
    public ControlePagamento() {
        this.pagamentos = new ArrayList<Pagavel>();
    }

    //Adiciona um item pagavel na lista
    public void adicionarPagamento(Pagavel pagavel){
        pagamentos.add(pagavel);
    }
    
    //Retorna uma ArrayList contendo apenas os Empregados
    public ArrayList<Empregado> getAllEmpregados(){
        ArrayList<Empregado> empregados = new ArrayList<Empregado>();
        for(Pagavel tmpPagavel:this.pagamentos){
            if(tmpPagavel instanceof Empregado){
                empregados.add((Empregado)tmpPagavel);
            }
        }
        return empregados;
    }
    
    //Retorna uma ArrayList contendo apenas as Contas
    public ArrayList<Conta> getAllContas(){
        ArrayList<Conta> contas = new ArrayList<Conta>();
        for(Pagavel tmpPagavel:this.pagamentos){
            if(tmpPagavel instanceof Conta){
                contas.add((Conta)tmpPagavel);
            }
        }
        return contas;
    }
}

