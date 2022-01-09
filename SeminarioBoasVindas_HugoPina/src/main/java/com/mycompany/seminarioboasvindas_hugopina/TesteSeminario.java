//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.seminarioboasvindas_hugopina;
import java.util.Scanner;

public class TesteSeminario {
    public static void main(String[] args) {
        Seminario seminario = new Seminario();
        Scanner s = new Scanner(System.in);
        
        boolean executando = true; //define o loop de execucao
        int resposta; //armazena o valor da operacao, inserida pelo usuario
        
        //Variaveis de uso geral para a execucao dos testes
        String nome = null,cpf = null;
        String inputA, inputB, inputC, inputD, inputE, inputF, inputG, inputH; //armazenam temporariamente as informacoes especificas de cada classe
        Aluno aluno; //Qualquer aluno pode ser armazenado nessa variavel!
        Professor professor;
        
        while(executando){
            System.out.println("Olá! O que deseja fazer? \n"
                            +"(1) Inscrever Professor\n"
                            +"(2) Inscrever Aluno do Curso Tecnico\n"
                            +"(3) Inscrever Aluno da Graduacao\n"
                            +"(4) Inscrever Aluno da Pos Graduacao\n"
                            +"(5) Concluir Inscricoes e Gerar Relatorio");
            
            resposta = s.nextInt();
            s.nextLine();
            
            if(resposta < 5){ //Em qualquer um dos casos de inscricao, captura o nome e CPF da pessoa
                System.out.println("Nome:");
                nome = s.nextLine();
                System.out.println("CPF:");
                cpf = s.nextLine();
            }
            
            switch(resposta){
                case 1:
                    System.out.println("Area de Atuacao e Pesquisa:");
                    inputA = s.nextLine();
                    professor = new Professor(nome, cpf, inputA);
                    if(seminario.inscreverProfessor(professor)){
                        System.out.println("Inscricao Realizada com Sucesso! \n");
                    }else{
                        System.out.println("Me desculpe, mas todas as vagas para professores foram preenchidas");
                    }
                    break;
                    
                case 2:
                    System.out.println("Curso:");
                    inputA = s.nextLine();
                    System.out.println("Nome da Empresa(Estagio)");
                    inputB = s.nextLine();
                    System.out.println("Area de Atuacao(Estagio)");
                    inputC = s.nextLine();
                    System.out.println("Data de Inicio do Estagio");
                    inputD = s.nextLine();
                    System.out.println("Data de Termino do Estagio:");
                    inputE = s.nextLine();
                    System.out.println("Nome do Professor Orientador:");
                    inputF = s.nextLine();
                    System.out.println("CPF do Professor Orientador:");
                    inputG = s.nextLine();
                    System.out.println("Area de Pesquisa do Professor Orientador:");
                    inputH = s.nextLine();
                    aluno = new AlunoTecnico(nome, cpf, inputA, new Professor(inputF, inputG, inputH), inputB,inputC,inputD,inputE);
                    seminario.inscreverAluno(aluno);
                    System.out.println("Inscricao Realizada com sucesso!");
                    break;
                    
                case 3:
                    System.out.println("Tema TCC:");
                    inputA = s.nextLine();
                    aluno = new AlunoGraduacao(nome,cpf,inputA);
                    seminario.inscreverAluno(aluno);
                    System.out.println("Inscricao Realizada com sucesso!");
                    break;
                    
                case 4:
                    System.out.println("Linha de Pesquisa:");
                    inputA = s.nextLine();
                    System.out.println("Data de Entrada no Curso");
                    inputB = s.nextLine();
                    System.out.println("Data de Conclusao de Curso");
                    inputC = s.nextLine();
                    aluno = new AlunoPosGraduacao(nome,cpf,inputA,inputB,inputC);
                    seminario.inscreverAluno(aluno);
                    System.out.println("Inscricao Realizada com sucesso!");
                    break;
                    
                case 5:
                    seminario.gerarRelatorio();
                    executando = false; //fim do loop
                    break;
            }
        }
        
        
        
    }
    
}
