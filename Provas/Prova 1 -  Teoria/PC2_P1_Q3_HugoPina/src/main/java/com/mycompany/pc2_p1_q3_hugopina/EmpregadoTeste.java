//Nome: Hugo Antunes Pina
package com.mycompany.pc2_p1_q3_hugopina;

public class EmpregadoTeste {
    public static void main(String[] args) {
        //Criacao de empregados teste
        Empregado funcionario1 = new Empregado("Joao", "Pedro", 2000.50);
        Empregado funcionario2 = new Empregado("Hugo","Pina",1000);
        
        funcionario1.exibirDados();
        System.out.println("");
        funcionario2.exibirDados();
        
        System.out.println("");
        funcionario1.darAumento(10);
        funcionario2.darAumento(10);
        System.out.println("-------Após aplicado o aumento de 10%---------");
        System.out.println("");
        
        funcionario1.exibirDados();
        System.out.println("");
        funcionario2.exibirDados();
        
        System.out.println("");
        System.out.println("-------Demonstracao getters e setters---------");
        System.out.println("");
        
        //demonstracao getters e setters
        System.out.println("Modificando informacoes funcionario 1");
        
        funcionario1.setNome("Victor");
        System.out.println("Novo Nome: " + funcionario1.getNome());
        
        funcionario1.setSobrenome("Augusto");
        System.out.println("Novo Sobrenome: " + funcionario1.getSobrenome());
        
        funcionario1.setSalario(500);
        System.out.println("Novo Salario: " + funcionario1.getSalario());
        
        //tentativa de adicionar valor negativo
        funcionario1.setSalario(-100);
        System.out.println("Novo Salario(2): " + funcionario1.getSalario());
        
        System.out.println("Novas Informacoes:");
        funcionario1.exibirDados();
    }
}