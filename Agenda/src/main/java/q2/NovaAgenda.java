//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores 2
//Data: 24/06/2021

package q2;
import q1.Contato;
import java.util.HashMap;
import java.util.Iterator;


public class NovaAgenda {
    
    //Campos
    
    HashMap<String, Contato> agenda;
    
    //Construtores
    
    public NovaAgenda(){
        this.agenda = new HashMap<String,Contato>();
    }
    
    
    //Getters e Setters
    
    public HashMap<String, Contato> getAgenda(){
        return agenda;
    }
    
    public void setAgenda(HashMap<String,Contato> agenda){
        this.agenda = agenda;
    }
    
    
    //Metodos
    
    public void adicionarContato(Contato contato){
        agenda.put(contato.getNome(),contato);
    }

    public int getTotalContatos(){
        return agenda.size();
    }
    
    public Contato pesquisarContato(String nome){
        return agenda.get(nome);
    }
    
    public void removerContato(String nome){
        agenda.remove(nome);
    }
    
    public void listarContatos(){
        Iterator<Contato> i = agenda.values().iterator();
        Contato tmpCont;
        while(i.hasNext()){
            tmpCont = i.next();
            System.out.println("");
            System.out.println("Nome:" + tmpCont.getNome());
            System.out.println("Telefone:" + tmpCont.getTelefone());
            System.out.println("Nome:" + tmpCont.getEmail());
        }      
    }   
}
