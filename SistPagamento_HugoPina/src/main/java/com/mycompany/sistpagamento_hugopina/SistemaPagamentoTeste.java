//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.sistpagamento_hugopina;
import java.util.ArrayList;

public class SistemaPagamentoTeste {
    public static void main(String[] args) {
        Database db = new Database();
        ControlePagamento controlePagamento = new ControlePagamento();
        
        //variaveis auxiliares
        int k; 
        Pagavel pagavel;
        
        //adicionando objetos no sistema de pagamento
        System.out.println("Inicializando..");
        //loop por cada funcionario no Banco de Dados. Como sao 3 funcionarios
        //por categoria, coloquei tudo no mesmo loop
        for(int i = 0;i<3;i++){ 
            pagavel = db.gerarPagavel("assalariado", i);
            controlePagamento.adicionarPagamento(pagavel);
            pagavel = db.gerarPagavel("comissionado", i);
            controlePagamento.adicionarPagamento(pagavel);
            pagavel = db.gerarPagavel("assalariadoComissionado", i);
            controlePagamento.adicionarPagamento(pagavel);
            pagavel = db.gerarPagavel("terceirizado", i);
            controlePagamento.adicionarPagamento(pagavel);
            pagavel = db.gerarPagavel("titulo", i);
            controlePagamento.adicionarPagamento(pagavel);
            pagavel = db.gerarPagavel("concessionaria", i);
            controlePagamento.adicionarPagamento(pagavel);
        }
        
        //Relatorio
        System.out.println("======Relacao de valores a serem pagos======");
        System.out.println("==Funcionarios==");
        ArrayList<Empregado> empregados = controlePagamento.getAllEmpregados(); //ArrayList auxiliar
        for(Empregado emp:empregados){
            System.out.println("Nome: " + emp.getNome() + " " + emp.getSobrenome());
            System.out.println("Valor de pagamento: " + String.format("R$ %.2f",emp.getValorAPagar()) + "\n");
        }
        
        System.out.println("\n\n");
        
        System.out.println("==Contas==");
        ArrayList<Conta> contas = controlePagamento.getAllContas(); //ArrayList auxiliar
        for(Conta cont:contas){
            System.out.println("Descricao:" + cont.getDescricao());
            System.out.println("Valor de pagamento: " + String.format("R$ %.2f",cont.getValorAPagar()) + "\n");
        }
        
        System.out.println("===========================================");
        
        
        double totalAPagar = 0;
        for(Empregado emp:empregados){totalAPagar += emp.getValorAPagar();} //aproveitando das listas ja criadas
        for(Conta cont:contas){totalAPagar += cont.getValorAPagar();}
        System.out.println("\nValor Total A Pagar: " + String.format("R$ %.2f",totalAPagar) + "\n");
        System.out.println("===========================================");
    }

    
}
