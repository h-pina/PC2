//Nome: Hugo Antunes Pina
package com.mycompany.pc2_p1_q4_hugopina;

public class TesteEmpresa {
    public static void main(String[] args) {
        //Criando a empresa
        Empresa engcompltda = new Empresa("EngComp LTDA", "12345678000103", 4);
        
        //Criando funcionarios teste
        Empregado funcionario1 = new Empregado("Joao", "Pedro", 1000);
        Empregado funcionario2 = new Empregado("Hugo", "Pina", 2000);
        Empregado funcionario3 = new Empregado("Ana", "Clara", 3000);
        Empregado funcionario4 = new Empregado("Carolina", "Fonseca", 4000 );
        Empregado funcionario5 = new Empregado("Arthur", "Araujo", 2500);
        
        //Adicionar todos os funcionarios
        System.out.println("Adicionando Funcionario 1...");
        engcompltda.adicionarEmpregado(funcionario1);
        System.out.println("Adicionando Funcionario 2...");
        engcompltda.adicionarEmpregado(funcionario2);
        System.out.println("Adicionando Funcionario 3...");
        engcompltda.adicionarEmpregado(funcionario3);
        System.out.println("Adicionando Funcionario 4...");
        engcompltda.adicionarEmpregado(funcionario4);
        
        
        //Tentando adicionar um numero maior de funcionarios
        System.out.println("Adicionando Funcionario 5...");
        engcompltda.adicionarEmpregado(funcionario5);
        
        //Verificando se funcionarios existem
        
            //Funcionario Hugo Pina
        String nome_func =  funcionario2.getNome() + " " + funcionario2.getSobrenome();
        if(engcompltda.verificarEmpregado(funcionario2)){System.out.println(nome_func +" esta na empresa!");
        }else{System.out.println(nome_func + " nao esta na empresa!");}
        
             //Funcionaria Ana Clara
        nome_func =  funcionario3.getNome() + " " + funcionario3.getSobrenome();
        if(engcompltda.verificarEmpregado(funcionario3)){System.out.println(nome_func +" esta na empresa!");
        }else{System.out.println(nome_func + " nao esta na empresa!");}
        
            //Funcionario Arthur Araujo
        nome_func =  funcionario5.getNome() + " " + funcionario5.getSobrenome();
        if(engcompltda.verificarEmpregado(funcionario5)){System.out.println(nome_func +" esta na empresa!");
        }else{System.out.println(nome_func + " nao esta na empresa!");}
        
        System.out.println("");
        System.out.println("-----Demonstrando Getters e Setters-------");
        System.out.println("");
        
        System.out.println("Nome atual: " + engcompltda.getNome());
        engcompltda.setNome("Comp LTDA");
        System.out.println("Novo nome: " + engcompltda.getNome());
        System.out.println("CNPJ atual: " + engcompltda.getCNPJ());
        engcompltda.setCNPJ("1010100000105");
        System.out.println("Novo CNPJ: " + engcompltda.getCNPJ());
        
        
    }
}
