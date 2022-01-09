//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores 2
//Data: 24/06/2021

package q1;

public class Contato {
    
    //Campos
    
    private String nome;
    private String telefone;
    private String email;
    
    
    //Construtor
    
    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    
    
    //Getters e Setters
    
    public String getNome(){
        return this.nome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(){
        this.telefone = telefone;
    }
    
    public void setEmail(){
        this.email = email;
    }
}
