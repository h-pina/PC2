//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.seminarioboasvindas_hugopina;

/*-----
Essa classe foi primordialmente definida como um tipo de "marcador" para
os alunos. Essa separacao Aluno-professor sera importante na classe Seminario.

Todos os alunos serao subclasses da classe aluno, porem, ainda sim terao acesso
aos campos da classe PessoaUniversidade!
------*/
public abstract class Aluno extends PessoaUniversidade {
    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }
}
