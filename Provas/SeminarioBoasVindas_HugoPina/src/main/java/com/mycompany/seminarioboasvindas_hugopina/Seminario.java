//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.seminarioboasvindas_hugopina;
import java.util.ArrayList;

public class Seminario {
    
    //Campos
    
    ArrayList<PessoaUniversidade> participantes;
    int numProfessores;
   
    //Construtor
    
    public Seminario(){
        this.participantes = new ArrayList<PessoaUniversidade>();
        this.numProfessores = 0;
    }
    
    //A funcao retorna um boleano referente ao sucesso ou falha da operacao
    public boolean inscreverProfessor(Professor professor){ 
        if(this.numProfessores < 3){ //verifica se 3 professores ja foram inscritos
            numProfessores+=1;
            participantes.add(professor);
            return true;
        }
        else {
            return false;
        }
    }
    
    //Como todos os outros integrantes do seminario sao alunos, nao e necessario
    //devolver resposta, como no caso dos professores
    public void inscreverAluno(Aluno aluno){
        participantes.add(aluno);
    }
    
    public void gerarRelatorio(){
        PessoaUniversidade p;
        System.out.println("-----------Professores Inscritos-----------");
        
        for(int i = 0; i<participantes.size();i++){ 
            p = participantes.get(i);
            if( p instanceof Professor){
                System.out.println("");
                p.listarInformacoes(); //cada classe acessa listarInformacoes e imprime seus dados especificos
            }
        }
        
        System.out.println("-------------------------------------------\n");
        
        System.out.println("--------------Alunos Inscritos-------------");
        
        for(int i = 0; i<participantes.size();i++){ 
            p = participantes.get(i);
            if( p instanceof Aluno){ //Aqui a classe Aluno mostra sua importancia!
                System.out.println("");
                p.listarInformacoes();
            }
        }
        
        System.out.println("--------------------------------------------");
    }
    
}
